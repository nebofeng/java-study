package imooc_answers;

import java.util.HashMap;
import java.util.Map;

public class Java_map_null {
//	都可以为空
//	但是如果有多个空健的话，后面的会把前面的覆盖。
//	你可以做个测试。
	public static void main(String[] args) {
	
	  Map map = new HashMap();
	  map.put("key", null);
//	  map.put("key", null);
//	  map.put("3", null);
	  for (int i=0;i<map.size();i++){
		  if(map.get("key")==null){
			 if(map.containsKey("key"))
			  {
				 System.out.println(map.get("key")); 
			  }else{
				  
			  }
			 
		  }		  
				 
	    }
		 
	  }
	   
	 }

//public static void main(String[] args) {
//	// TODO Auto-generated method stub
//	HashMap map = new HashMap();
//	map.put("key1", "value1");
//	map.put("key2", "value2");
//	map.put("key3", "value3");
//	Iterator keys = map.keySet().iterator();
//	while(keys.hasNext()){
//		String key = (String)keys.next();
//		if("key2".equals(key)){
//			System.out.println("这里面有key2");
//		}
//	}
//}
