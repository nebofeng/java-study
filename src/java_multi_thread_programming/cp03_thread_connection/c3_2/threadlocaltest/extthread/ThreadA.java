
package java_multi_thread_programming.cp03_thread_connection.c3_2.threadlocaltest.extthread;

import java_multi_thread_programming.cp03_thread_connection.c3_2.threadlocaltest.tools.Tools;

/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年2月25日 下午8:22:09
* 类说明
*/
public class ThreadA extends Thread{

	@Override
	public void run() {
		try{
			for(int i=0;i<100;i++){
				Tools.t1.set("ThreadA "+(i+1));
				System.out.println("ThreadA get Value="
						+Tools.t1.get());
				Thread.sleep(200);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
