
package java-multi_thread_programming.cp01.c1_10;
/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年2月16日 下午2:31:04
* 类说明
*/
public class Run {
	public static void main(String[] args) {
		System.out.println(" main thread begin priority="
				+Thread.currentThread().getPriority());
//		Thread.currentThread().setPriority(6);
		System.out.println(" main thread end priority="
				+Thread.currentThread().getPriority());
		MyThread1 myThread1=new MyThread1();
		myThread1.start();
	}
}
