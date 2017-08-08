
package java_multi_thread_programming.cp02.c2_3_5;
/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年2月22日 下午8:38:30
* 类说明
*/
public class Run {
	public static void main(String[] args) {
		AddCountThread countService=new AddCountThread();
		Thread t1=new Thread(countService);
		t1.start();
		
		Thread t2=new Thread(countService);
		t2.start();
		Thread t3=new Thread(countService);
		t3.start();
		Thread t4=new Thread(countService);
		t4.start();
		Thread t5=new Thread(countService);
		t5.start();
	}
}
