
package java_multi_thread_programming.cp01.c1_10;
/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年2月16日 下午2:29:32
* 类说明
*/
public class MyThread2 extends Thread {
	
	@Override
	public void run() {
		System.out.println(" MyThread 2 run priority ="+this.getPriority());
	}
}
