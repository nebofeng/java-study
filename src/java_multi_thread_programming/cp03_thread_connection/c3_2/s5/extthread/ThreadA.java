
package java_multi_thread_programming.cp03_thread_connection.c3_2.s5.extthread;

import java.util.Date;

import java_multi_thread_programming.cp03_thread_connection.c3_2.s5.tools.Tools;

/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年2月25日 下午8:50:26
* 类说明
*/
public class ThreadA extends Thread{
	
	@Override
	public void run() {
		try{
			for(int i=0;i<20;i++){
				if(Tools.t1.get()==null){
					Tools.t1.set(new Date());
				}
				System.out.println("A"+Tools.t1.get().getTime());
				Thread.sleep(100);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
