
package book.java_multi_thread_programming.cp02.c2_3_4;
/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年2月22日 下午8:23:05
* 类说明
*/
public class Run {
	public static void main(String[] args) {
		MyThread[] myThreadArray=new MyThread[100];
		for(int i=0;i<100;i++){
			myThreadArray[i]=new MyThread();
		}
		
		for(int i=0;i<100;i++){
			myThreadArray[i].start();
		}
	}
}
