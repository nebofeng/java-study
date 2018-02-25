
package java_multi_thread_programming.cp03_thread_connection.c1_14.join_test;
/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年2月25日 下午5:14:11
* 类说明
*/
public class Run {
	public static void main(String[] args) throws InterruptedException {
		ThreadA threadA=new ThreadA();
		ThreadB threadB=new ThreadB();
		threadA.start();
		threadB.start();
		threadB.join();
	}
}
