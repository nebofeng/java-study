package pers.nebo.web.webhandler;



import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.Map;

/**
 * @auther fnb
 * @date 2018/9/12 14:15
 */
public class PraseJson {

	public static StringBuffer transData (String jsonData,Map<String,String> dataMap) {

		//获取根节点
		JSONObject jsonObject =   JSONObject.parseObject(jsonData);

		//获取实例
		JSONObject jsonInstances =   jsonObject.getJSONObject("Instances");
		JSONArray jsonInstance = jsonInstances.getJSONArray("Instance");

        StringBuffer stringBuffer = new StringBuffer();
		for(int i=0;i<jsonInstance.size();i++){
			//获取到每一个实例
		 	JSONObject instance = jsonInstance.getJSONObject(i);
		 	//获取 内网 ip ，
			JSONArray jsonNetworkInterfaces= instance.getJSONObject("NetworkInterfaces").getJSONArray("NetworkInterface");
			//只获取第一个网卡
            String privateIp    =jsonNetworkInterfaces.getJSONObject(0).getString("PrimaryIpAddress");
			String publicIp    = instance.getJSONObject("PublicIpAddress").getJSONArray("IpAddress").get(0).toString();
			dataMap.put(publicIp,privateIp);
			stringBuffer.append(publicIp+" "+privateIp);
			stringBuffer.append("\r\n");

		}
		return stringBuffer;


	}
}
