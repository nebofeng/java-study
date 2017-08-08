
package designmode.cp3.factory;
/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年1月22日 下午9:49:44
* 类说明
*/
public class MidFactory extends AbstractFactory {

	
	public ICar create() {
		return new MidCar();
	}
}
