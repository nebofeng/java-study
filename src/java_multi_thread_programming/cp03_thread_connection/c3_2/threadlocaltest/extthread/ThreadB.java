
package java-multi_thread_programming.cp03_thread_connection.c3_2.threadlocaltest.extthread;

import java-multi_thread_programming.cp03_thread_connection.c3_2.threadlocaltest.tools.Tools;

/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年2月25日 下午8:25:44
* 类说明
*/
public class ThreadB extends Thread {

	@Override
	public void run() {
		try{
			for(int i=0;i<100;i++){
				Tools.t1.set("ThreadB "+(i+1));
				System.out.println("ThreadB get Value="
						+Tools.t1.get());
				Thread.sleep(200);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
