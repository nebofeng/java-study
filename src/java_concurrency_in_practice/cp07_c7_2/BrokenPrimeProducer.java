
package java-concurrency_in_practice.cp07_c7_2;

import java.math.BigInteger;
import java.util.concurrent.BlockingQueue;

/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年4月4日 下午3:16:04
* 类说明
*/
public class BrokenPrimeProducer  extends Thread{
	private final  BlockingQueue<BigInteger> queue; 
	private volatile boolean cancelled=false;
	
	
	public BrokenPrimeProducer(BlockingQueue<BigInteger> queue) {
			this.queue=queue;
	}
	
	
	@Override
	public void run() {
		try {
			BigInteger p=BigInteger.ONE;
			while(!cancelled){
				queue.put(p=p.nextProbablePrime());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void cancle(){
		cancelled=true;
	}
	
	
	
}
