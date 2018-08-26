
package java-multi_thread_programming.cp03_thread_connection.c3_2.threadlocaltest.test;

import java-multi_thread_programming.cp03_thread_connection.c3_2.threadlocaltest.extthread.ThreadA;
import java-multi_thread_programming.cp03_thread_connection.c3_2.threadlocaltest.extthread.ThreadB;
import java-multi_thread_programming.cp03_thread_connection.c3_2.threadlocaltest.tools.Tools;

/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年2月25日 下午8:29:11
* 类说明
*/
public class Run {
	public static void main(String[] args) {
		try{
			ThreadA a=new ThreadA();
			ThreadB b=new ThreadB();
			a.start();
			b.start();
			for(int i=0;i<100;i++){
				Tools.t1.set("Main "+(i+1));
				System.out.println(" Main get value "
				+Tools.t1.get());
				Thread.sleep(200);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
