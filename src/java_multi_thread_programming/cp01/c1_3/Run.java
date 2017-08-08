
package java_multi_thread_programming.cp01.c1_3;
/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年2月15日 下午3:15:41
* 类说明
*/
public class Run {
		public static void main(String[] args) {
			MyThread myThread=new MyThread();
//			myThread.setName("my");
			myThread.start();
			
//			myThread.run();
		}
}
