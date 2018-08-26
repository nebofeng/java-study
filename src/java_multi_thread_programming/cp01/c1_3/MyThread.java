
package java-multi_thread_programming.cp01.c1_3;
/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年2月15日 下午3:12:53
* 类说明
*/
public class MyThread extends Thread {
	public MyThread(){
		System.out.println("构造方法的打印 ： "+Thread.currentThread().getName());
	}
	
	
	@Override
	public void run() {
		System.out.println("run 方法的打印 ："+Thread.currentThread().getName());
	}
}
