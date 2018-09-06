
package book.java_multi_thread_programming.cp03_thread_connection.c3_2.s5.test;

import book.java_multi_thread_programming.cp03_thread_connection.c3_2.s5.extthread.ThreadA;
import book.java_multi_thread_programming.cp03_thread_connection.c3_2.s5.extthread.ThreadB;

/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年2月25日 下午8:57:05
* 类说明
*/
public class Run {
	public static void main(String[] args) {
		try{
			ThreadA a=new ThreadA();
			a.start();
			Thread.sleep(1000);
			ThreadB b=new ThreadB();
			b.start();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
