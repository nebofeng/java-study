package pers.nebo.javaexcel;


import org.apache.hadoop.fs.Path;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.codehaus.jettison.json.JSONObject;
import sun.rmi.runtime.Log;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

/**
 * 解析，获取，hdfs目录文件中的参数。
 */
public class FileUtils {

	public FileUtils() {
		try {
			downloadXmlFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static final Log LOG = LogFactory.getLog(FileUtils.class);
	private static final String filePath = "/doc/kafka/ad_boe/l_event_log.xlsx";

	// json中内嵌json的字段或者json中的对象属性
	private Map<String, String> nestFieldMap = new HashMap<String, String>();
	// 需要存储的字段
	private List<String> fieldList = new LinkedList<String>();
	// json根目录下的字段
	private List<String> remainFieldList = new LinkedList<String>();
	// 全部字段(包括存储以及不存储的)
	private List<String> allFieldList = new LinkedList<String>();
	// 对象子属性字段
	private List<String> objectChildList = new LinkedList<>();

	private void downloadXmlFile() throws IllegalArgumentException, IOException {
		Path path = new Path(filePath);
		InputStream input = null;
		try {
			input = BigdataHdfsUtils.getHDFS().open(path).getWrappedStream();
			readXlsx(input);
		} catch (IOException e) {
			LOG.error("the hdfs path is not exists...path=" + path.toString());
			//skipFlag = true;
		} finally {
			if (null != input) {
				try {
					input.close();
				} catch (IOException e) {
					LOG.error("close input stream error..." + e.getMessage());
				}
			}
		}
		LOG.info("read file " + path.toString() + " from hdfs end ...");
	}


	private void readXlsx(InputStream input) throws IOException {
		// 建立输入流
		XSSFWorkbook wb = new XSSFWorkbook(input);
		// 获得第一个表单
		Sheet sheet = wb.getSheetAt(0);
		// 获得第一个表单的行迭代器
		Iterator<Row> rows = sheet.rowIterator();

		// 第一行第二列为表名
		// 第二行第二列为表描述信息
		for (int i = 0; i < 10; i++) {
			// rows.next();
			Row row1 = rows.next();
			LOG.error("====> " + row1.getRowNum() + " value=> " + (row1.getCell(0) == null ? "" : row1.getCell(0)));
		}
		// 第十一行开始为数据
		while (rows.hasNext()) {
			Row row = rows.next(); // 获得行数据
			// 第一列为空则说明改行无数据，结束循环
			if (null == row.getCell(0) || StringUtils.isBlank(row.getCell(0).getStringCellValue().trim())) {
				continue;
			}
			LOG.info(row.getRowNum() + "||" + row.getCell(0).getStringCellValue().trim());
			// 添加到所有字段列表中
			allFieldList.add(row.getCell(0).getStringCellValue().trim());
			// 判断字段是否 有父字段，没有父字段的记录则说明是根节点下的字段可以直接获取到值
			if (null != row.getCell(6) && StringUtils.isNotBlank(row.getCell(6).toString())) {
				nestFieldMap.put(row.getCell(0).getStringCellValue().trim(), row.getCell(6).getStringCellValue().trim());
			} else {
				remainFieldList.add(row.getCell(0).getStringCellValue().trim());
			}

			// 判断是否是需要存储的字段，不需要存储的字段放在remainFieldList中
			if (null == row.getCell(7) || StringUtils.isEmpty(row.getCell(7).toString().trim())) {
				fieldList.add(row.getCell(0).getStringCellValue().trim());
			}
			// 判断字段是否是对象的子属性
			if (null != row.getCell(8) && StringUtils.isNotEmpty(row.getCell(8).toString().trim())) {
				objectChildList.add(row.getCell(0).getStringCellValue().trim());
			}
		}

		wb.close();
		LOG.info("read xlsx file " + filePath + ".xlxs success...");
	}

	public String getRecord(String json) {
		String finalResult = null;
		String[] result = new String[3];

		try {
			String createtime = null;
			StringBuffer recordSb = new StringBuffer();
			JSONObject jsonData = new JSONObject(json);
			JSONObject jsonData2 = null;
			// 字段属性-值的映射Map
			Map<Object, Object> resultMap = new TreeMap<>();

			JSONObject whom = jsonData.getJSONObject("whom");
			Map<String, String> localMap = new HashMap<>();
			localMap.put("cxt", jsonData.getString("cxt"));
			localMap.put("where", jsonData.getString("where"));
			localMap.put("when", jsonData.getString("when"));
			localMap.put("what", jsonData.getString("what"));

			//遍历所有的key，并且在json中获取。
			for (String key : fieldList) {
				if (whom.has(key)) {
					resultMap.put(key, whom.getString(key));

				} else {
					resultMap.put(key, localMap.get(key));
				}
			}
			String fieldValue = null;
			for (String field : fieldList) {
				Object obj = resultMap.get(field);
				if (null == obj) {
					recordSb.append("null");
				} else {
					fieldValue = resultMap.get(field).toString();
					if (StringUtils.isBlank(fieldValue)) {
						recordSb.append("null");
					} else {
						recordSb.append(resultMap.get(field));
					}
				}
				recordSb.append("\t");
			}

		} catch (Exception e) {
			LOG.error("parse json error : " + json, e);
		}
		System.out.println("result==" + finalResult);
		return finalResult;
	}

	public static void main(String[] args) {
		FileUtils flieUtils = new FileUtils();
		try {
			flieUtils.downloadXmlFile();
			String json1 = "{\"whom\":{\"platform\":\"android\",\"deviceid\":\"0E763A72-11D3-4932-A6AD-AA098BD6E0EE\"," +
			               "\"ad_deviceid\":\"0E763A72-11D3-4932-A6AD-AA098BD6E0EE\",\"appversion\":\"1.10.1\"," +
			               "\"mac\":\"02:00:00:00:00:00\",\"screenwidth\":\"1080\",\"screenheight\":\"1812\"," +
			               "\"osversion\":\"7.0\",\"network\":\"3g\",\"lang\":\"ar\",\"devicemodel\":\"BAC-L21\"," +
			               "\"bundleid\":\"and.onemt.war.ar\",\"jailbreak\":0,\"channel\":\"googleplay\",\"carrier\":\"41902\"," +
			               "\"sn\":\"GUYDU17929006533\",\"imei\":\"864841034432999\",\"androidid\":\"90FA9439984E2EA6\"," +
			               "\"timezone\":\"GMT+03:00\",\"sdkversion\":\"2.24.3\"," +
			               "\"devicetoken\":\"dT-0NS320PM:APA91bHVy7ex1jsJ4pa8GhRLOc_5AQ0FMbBzMmo8lv2e5swrfOsHTCAl1nwOdh0UhCFYVsKWPiO25ldXZVstQV9rQIJztiCk1McxIrVp4GYRR2Z0QDaXndQGEtWhT65lDkile9Meyv5ciMBckW0PliRHHxGwqqXftQ\"," +
			               "\"eventargs\":\"{}\",\"logtime\":\"1534213053\",\"userid\":\"7b8368cd2232b89bc68444abe4365413\"," +
			               "\"gameuserid\":\"1420016\",\"eventname\":\"1010171\",\"dbname\":\"kingdom_1\",\"appid\":\"100000601\"," +
			               "\"ua\":\"Android 7.0; BAC-L21 Build\\/HUAWEIBAC-L21\",\"uniqueid\":\"92d909e74fd5ee2637a19a2b426b9e40\"," +
			               "\"ip\":\"37.39.232.156\",\"country\":\"KW\",\"city\":\"Kuwait City\",\"area\":\"Al Asimah\"," +
			               "\"devicemd5\":\"7b17c9ea81fade4dbd13f1702b24c73b\",\"media\":0,\"gamelang\":false," +
			               "\"servertime\":1534213282,\"request\":\"event\",\"activatetime\":null,\"logintime\":null," +
			               "\"createtime\":\"1534213053\"},\"where\":\"37.39.232.156\",\"when\":\"1534213053\",\"what\":\"kingdom\",\"cxt\":{}}";

			flieUtils.getRecord(json1);
			for (String s : flieUtils.fieldList) {
				System.out.println(s);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}


}
