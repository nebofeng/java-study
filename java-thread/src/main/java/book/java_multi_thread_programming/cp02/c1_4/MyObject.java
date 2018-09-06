
package book.java_multi_thread_programming.cp02.c1_4;
/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年2月16日 下午7:11:47
* 类说明
*/
public class MyObject {
	synchronized public void methodA(){
		try{
		System.out.println(" begin methodA threadName=" 
				+Thread.currentThread().getName());
			Thread.sleep(5000);
		System.out.println("end ");
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
	}
}
