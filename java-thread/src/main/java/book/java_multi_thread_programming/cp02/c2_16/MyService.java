
package book.java_multi_thread_programming.cp02.c2_16;
/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年2月21日 下午4:50:55
* 类说明
*/
public class MyService {
	
	private String lock="123";
	
	public void testMethod(){
		try{
			synchronized(lock){
				System.out.println(Thread.currentThread().getName()+"begin"
						+System.currentTimeMillis());
				lock="456";
				Thread.sleep(2000);
				System.out.println(Thread.currentThread().getName()+"end"
						+System.currentTimeMillis());
			}
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
