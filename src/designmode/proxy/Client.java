
package designmode.proxy;
/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年3月11日 上午11:02:32
* 类说明
*/
public class Client {
	public static void main(String[] args) {
		Moveable m=new Tank();
		m.move();
	}
}
