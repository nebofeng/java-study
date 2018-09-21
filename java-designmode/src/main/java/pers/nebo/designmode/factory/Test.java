
package pers.nebo.designmode.factory;

import pers.nebo.designmode.factory.spring.Car;

/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年3月9日 下午7:01:34
* 类说明
*/
public class Test {
	public static void main(String[] args) {
		Car c=Car.getInstance();
		c.run();
	}
}
