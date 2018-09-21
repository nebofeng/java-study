
package pers.nebo.designmode.proxy;
/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年3月11日 上午11:04:50
* 类说明
*/
public class Tank2  extends Tank{
	@Override
	public void move(){
		long start=System.currentTimeMillis();
		super.move();
		long end=System.currentTimeMillis();
		System.out.println("time= "+(start-end));
		
	}
}
