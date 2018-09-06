
package book.java_multi_thread_programming.cp02.c2_3_5;

import java.util.concurrent.atomic.AtomicInteger;

/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年2月22日 下午8:35:49
* 类说明
*/
public class AddCountThread extends Thread{
		
	private AtomicInteger count=new AtomicInteger(0);
		@Override
		public void run() {
			for(int i=0;i<100;i++){
				System.out.println(count.incrementAndGet());
			}
		}
}
