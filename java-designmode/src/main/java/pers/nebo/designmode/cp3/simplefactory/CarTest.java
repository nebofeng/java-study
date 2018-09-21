
package pers.nebo.designmode.cp3.simplefactory;
/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年1月22日 下午9:22:52
* 类说明
*/
public class CarTest {
	public static void main(String[] args){
		//从工厂中创建对象
		ICar obj=CarSimpleFactory.create("toptype");
	}
}
