
package java-multi_thread_programming.cp01.c1_8;
/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年2月16日 下午1:55:35
* 类说明
*/
public class Run {
	public static void main(String[] args) throws InterruptedException{
		final MyObject myobject=new MyObject();
		Thread thread1=new Thread(){
			public void run() {
				myobject.setValue("a", "aa");
			};
		};
		
		thread1.setName("a");
		thread1.start();
		Thread.sleep(5000);
		Thread thread2=new Thread(){
			
			public void run() {
				myobject.printUsernamePassword();
			};
		};
		thread2.start();
	}
}
