
package pers.nebo.designmode.cp3.factory;
/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年1月22日 下午9:51:34
* 类说明
*/
public class CarTest {
	public static void main(String [] args){
		AbstractFactory obj=new TopFactory();
		ICar car=obj.create();
	}
}
