
package designmode.proxy;

import java.util.Random;

/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年3月9日 下午8:48:30
* 类说明
*/
public class Tank implements Moveable {

	
	public void move() {
		long start=System.currentTimeMillis();
		System.out.println("tank moving");
		try {
			Thread.sleep(new Random().nextInt(10000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		long end=System.currentTimeMillis();
		
		System.out.println("time "+(start-end) );
	}
}
