
package java_multi_thread_programming.cp02.c2_3_4;
/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年2月22日 下午8:20:51
* 类说明
*/
public class MyThread  extends Thread{
	volatile public static int count;
	
	public static void addCount(){
		for(int i=0;i<100;i++){
			count=5;
		}
		System.out.println("count="+count);
	}
	
	@Override
	public void run() {
		addCount();
	}
}
