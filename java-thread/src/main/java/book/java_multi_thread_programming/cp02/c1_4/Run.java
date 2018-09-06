
package book.java_multi_thread_programming.cp02.c1_4;
/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年2月16日 下午7:25:07
* 类说明
*/
public class Run {
	public static void main(String[] args) {
		MyObject object=new MyObject();
		ThreadA thread1=new ThreadA(object);
		thread1.setName("A");
		ThreadB threadb=new ThreadB(object);
		threadb.setName("B");
		thread1.start();
		
		threadb.start();
		
	}
}
