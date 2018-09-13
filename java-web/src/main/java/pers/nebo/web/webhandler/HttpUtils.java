package pers.nebo.web.webhandler;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.CharArrayBuffer;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Map;

/**
 * @auther fnb
 * @date 2018/9/13 16:32
 */
public class HttpUtils {

	/**
	 * 根据url与参数 ，发出请求。并解析数据封装到 传入的mapData ,以及返回 的StringBuffer对象中。
	 * @param url
	 * @param parameters
	 * @return
	 */
	public static String get(String url, Map parameters) {
		String result = null;
		CloseableHttpClient httpClient = HttpClients.createDefault();
		StringBuilder newUrl = new StringBuilder(url);
		Iterator<Map.Entry<String, String>> entries = parameters.entrySet().iterator();

		while (entries.hasNext()) {

			Map.Entry<String, String> entry = entries.next();
			if (!entry.getKey().equals("Action")) {
				newUrl.append("&" + entry.getKey() + "=" + entry.getValue());

			}

		}
		System.out.println(newUrl);
		HttpGet get = new HttpGet(String.valueOf(newUrl));
		CloseableHttpResponse response = null;
		try {
			response = httpClient.execute(get);
			if (response != null && response.getStatusLine().getStatusCode() == 200) {
				HttpEntity entity = response.getEntity();
				result = entityToString(entity);
			} else {
				HttpEntity entity = response.getEntity();

				System.out.println(entityToString(entity));
			}
			return result;
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				httpClient.close();
				if (response != null) {
					response.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	/**
	 * 解析返回的HttpEntity
	 * @param entity
	 * @return
	 * @throws IOException
	 */
	private static String entityToString(HttpEntity entity) throws IOException {
		String result = null;
		if (entity != null) {
			long lenth = entity.getContentLength();
			if (lenth != -1 && lenth < 2048) {
				result = EntityUtils.toString(entity, "UTF-8");
			} else {
				InputStreamReader reader1 = new InputStreamReader(entity.getContent(), "UTF-8");
				CharArrayBuffer buffer = new CharArrayBuffer(2048);
				char[] tmp = new char[1024];
				int l;
				while ((l = reader1.read(tmp)) != -1) {
					buffer.append(tmp, 0, l);
				}
				result = buffer.toString();
			}
		}
		return result;
	}
}
