
package pers.nebo.designmode.factory;

/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年3月9日 下午7:00:50
* 类说明
*/
public class Car implements Moveable{
	private static Car car=new Car();
	public Car(){}
	
	public static Car getInstance(){
		return new Car();
	}
	
	public void run(){
		System.out.println("冒雨 奔跑中");
	}
}
