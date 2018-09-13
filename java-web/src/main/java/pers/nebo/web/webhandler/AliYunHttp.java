package pers.nebo.web.webhandler;

import org.apache.commons.codec.binary.Base64;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author fnb
 * @date 2018/9/11 10:19
 * @des: 阿里云 http请求 。返回 竞价实例的详细信息
 */
public class AliYunHttp {

	private static final String ENCODING = "UTF-8";

	private static Map<String, String> dataMap = new HashMap<String, String>();

	private static StringBuffer allResult;

	/**
	 * get请求，参数拼接在地址上
	 *
	 * @param url 请求地址加参数
	 * @return 响应
	 */


	private static final String ISO8601_DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss'Z'";

	//时间格式
	private static String formatIso8601Date(Date date) {

		SimpleDateFormat df = new SimpleDateFormat(ISO8601_DATE_FORMAT);

		df.setTimeZone(new SimpleTimeZone(0, "GMT"));

		return df.format(date);

	}

	/**
	 * 生成签名需要用到的处理逻辑
	 *
	 * @param value
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	private static String percentEncode(String value) throws UnsupportedEncodingException {
		return value != null ? URLEncoder.encode(value, ENCODING).replace("+", "%20").replace("*", "%2A").replace("%7E", "~") : null;
	}

	/**
	 * 让 Map按key进行排序
	 */
	public static Map<String, String> sortMapByKey(Map<String, String> map) {
		if (map == null || map.isEmpty()) {
			return null;
		}
		Map<String, String> sortMap = new TreeMap<String, String>(new MapKeyComparator());
		sortMap.putAll(map);
		return sortMap;
	}

	/**
	 * 封装请求参数，生成签名 ，发送http请求 。
	 * 获取 内网 ip 与公网ip的对应关系 。
	 * 填充到 mapData
	 * 以及  finalResult中
	 */
	public static void updateDataList() {

		//请求参数： 	https://ecs.aliyuncs.com/?Action=DescribeInstances&RegionId=cn-hangzhou&<公共请求参数>

		String Action = "DescribeInstances";
		String Version = "2014-05-26";
		String ALIAK = SettingUtil.getKey("", "ALIAK");
		String SignatureMethod = "HMAC-SHA1";
		String SignatureVersion = "1.0";
		String Tag1 = "bigdata";
		String RegionId = "us-west-1";
		String Format = "json";
		String InstanceChargeType = "PostPaid";
		String SpotStrategy = "SpotWithPriceLimit";
		String PageSize = "100";
		String ALISK = SettingUtil.getKey("", "ALISK");
		String SignatureNonce = UUID.randomUUID().toString();
		String Timestamp = formatIso8601Date(new Date());
		final String HTTP_METHOD = "GET";
		Map parameters = new HashMap();

		try {
			// 输入请求参数
			parameters.put("Action", Action);
			parameters.put("Version", Version);
			parameters.put("AccessKeyId", ALIAK);
			parameters.put("Timestamp", Timestamp);
			parameters.put("SignatureMethod", SignatureMethod);
			parameters.put("SignatureVersion", SignatureVersion);
			parameters.put("SignatureNonce", SignatureNonce);
			parameters.put("Tag.1.Key", Tag1);

			parameters.put("RegionId", RegionId);
			parameters.put("Format", Format);
			parameters.put("InstanceChargeType", InstanceChargeType);
			parameters.put("SpotStrategy", SpotStrategy);
			parameters.put("PageSize", PageSize);

			// 排序请求参数
			String[] sortedKeys = (String[]) parameters.keySet().toArray(new String[]{});
			Arrays.sort(sortedKeys);
			final String SEPARATOR = "&";
			// 构造 stringToSign 字符串
			StringBuilder stringToSign = new StringBuilder();
			stringToSign.append(HTTP_METHOD).append(SEPARATOR);
			stringToSign.append(percentEncode("/")).append(SEPARATOR);
			StringBuilder canonicalizedQueryString = new StringBuilder();
			for (String key : sortedKeys) {
				// 这里注意编码 key 和 value
				canonicalizedQueryString.append("&")
						.append(percentEncode(key)).append("=")
						.append(percentEncode((String) parameters.get(key)));
			}
			// 这里注意编码 canonicalizedQueryString
			stringToSign.append(percentEncode(canonicalizedQueryString.toString().substring(1)));
			// 以下是一段计算签名的示例代码
			final String ALGORITHM = "HmacSHA1";
			final String ENCODING = "UTF-8";
			String key = ALISK + "&";
			Mac mac = Mac.getInstance(ALGORITHM);
			mac.init(new SecretKeySpec(key.getBytes(ENCODING), ALGORITHM));
			String finalString = new String(stringToSign);
			byte[] signData = mac.doFinal(finalString.getBytes(ENCODING));
			String signature = percentEncode(new String(Base64.encodeBase64(signData)));

			System.out.println(signature + "============");
			String url = "https://ecs.aliyuncs.com/?Action=" + Action;
			parameters.put("Signature", signature);
			String result = HttpUtils.get(url, parameters);
			allResult = PraseJson.transData(result, dataMap);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 根据传入的内网ip
	 *
	 * @param privateIp
	 * @return 返回 内网ip对应的公网ip
	 */
	public static String getPublicIp(String privateIp) {
		String publicIp = dataMap.get(privateIp);
		if (publicIp == null && privateIp.isEmpty()) {
			return null;
		} else {
			return publicIp;
		}
	}
	//返回竞价实例的所有ip（不超过100的情况下，（每页最多100个信息。暂时只有20个未多页查询））
	public static String getAllIp() {

		return new String(allResult);
	}

	/**
	 * 开始定时任务，每隔一段时间更新数据实例的IP 对应信息。
	 * @param times
	 */
	public static void start(long times) {
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		executor.scheduleAtFixedRate(
				new TimeThread(),
				0,
				times,
				TimeUnit.SECONDS);
	}

}

//实现一个比较器类
class MapKeyComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		return s1.compareTo(s2);  //从小到大排序
	}
}
