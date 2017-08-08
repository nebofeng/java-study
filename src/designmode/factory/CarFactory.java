
package designmode.factory;

import designmode.factory.Car;

/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年3月9日 下午7:11:29
* 类说明
*/
public class CarFactory extends VehicleFactory {

	
	@Override
	public Moveable create() {
		
		return new Car();
	}
	
}
