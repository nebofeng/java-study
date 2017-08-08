
package designmode.proxy;
/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年3月11日 上午11:10:31
* 类说明
*/
public class TankTimeProxy implements Moveable {
	Tank t;
	
	public TankTimeProxy(Tank t) {
		super();
		this.t=t;
	}
	@Override
	public void move(){
		long start=System.currentTimeMillis();
		t.move();
		long end=System.currentTimeMillis();
		System.out.println("time= "+(start-end));
		
	}
}
