package pers.nebo.javaexcel;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.*;

/**
 * 解析，获取，Excel 文件中的参数。
 */
public class FileUtils {
	public static final Log LOG = LogFactory.getLog(FileUtils.class);
	// 需要的字段
	private List<String> fieldList = new LinkedList<String>();
	
	
	public FileUtils(String filePath) {

		try {
			readXlsx(filePath);
    	} catch (IOException e) {
			e.printStackTrace();
		}


	}
	private void readXlsx(String  name) throws IOException {
		InputStream input = FileUtils.class.getClassLoader().getResourceAsStream(name);
		// 建立输入流
		XSSFWorkbook wb = new XSSFWorkbook(input);
		// 获得第一个表单
		Sheet sheet = wb.getSheetAt(0);
		// 获得表单的行迭代器
		Iterator<Row> rows = sheet.rowIterator();
		//根据xlsx的结构可以获取信息
		while(rows.hasNext()){
			Row row1 = rows.next();
			LOG.info("=="+row1.getCell(0)+"===="+row1.getCell(2)+"===="+row1.getCell(3));
		}
		wb.close();
		//可以.trim()
	}

}
