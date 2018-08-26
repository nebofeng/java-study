
package java-multi_thread_programming.cp04.c1_4.test;

import java-multi_thread_programming.cp04.c1_4.extthread.ThreadA;
import java-multi_thread_programming.cp04.c1_4.service.MyService;

/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年2月27日 下午3:17:00
* 类说明
*/
public class Run {
	public static void main(String[] args) throws InterruptedException {
		MyService service=new MyService();
		ThreadA threadA=new ThreadA(service);
		threadA.start();
		Thread.sleep(3000);
		service.signal();
	}
}
