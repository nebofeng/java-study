
package book.java_multi_thread_programming.cp01.c1_10;
/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年2月16日 下午2:27:35
* 类说明
*/
public class MyThread1 extends Thread{
	
	
	@Override
	public void run() {
		System.out.println("MyThread1 run priority="+this.getPriority());
		MyThread2 thread2=new MyThread2();
		thread2.start();
	}
}
