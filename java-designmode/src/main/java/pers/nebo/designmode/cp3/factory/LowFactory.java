
package pers.nebo.designmode.cp3.factory;
/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年1月22日 下午9:50:40
* 类说明
*/
public class LowFactory extends AbstractFactory{
	public ICar create() {
		return new LowCar();
	}
}
