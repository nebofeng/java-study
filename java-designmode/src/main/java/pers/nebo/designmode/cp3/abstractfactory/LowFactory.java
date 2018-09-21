
package pers.nebo.designmode.cp3.abstractfactory;
/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年1月22日 下午10:10:10
* 类说明
*/
public class LowFactory extends AbstractFactory {

	
	public ICar createCar() {
		return new LowCar();
	}


	public IBus createBus() {
		return new DnBus();
	}
}
