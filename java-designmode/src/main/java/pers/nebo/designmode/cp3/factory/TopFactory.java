
package pers.nebo.designmode.cp3.factory;
/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年1月22日 下午9:47:35
* 类说明
*/
public class TopFactory extends AbstractFactory{

	
	public ICar create() {
		return new TopCar();
	}


}
