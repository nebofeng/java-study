
package pers.nebo.designmode.factory.spring;

import java.io.IOException;
import java.util.Properties;

/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年3月9日 下午7:52:59
* 类说明
*/
public class Test {
	public static void main(String[] args) throws Exception {
		Properties pros=new Properties();
		try {
			pros.load(Test.class.getClassLoader()
					.getResourceAsStream("designmode/factory/spring/spring.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String vehicleTypeName=pros.getProperty("VehicleType");
		System.out.println(vehicleTypeName);
		Object o=Class.forName(vehicleTypeName).newInstance();
		Moveable m=(Moveable)o;
		m.run();
		
//		Moveable m=;
//		m.run();
	}

}
