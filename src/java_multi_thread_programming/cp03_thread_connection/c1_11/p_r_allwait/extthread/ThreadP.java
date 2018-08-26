
package java-multi_thread_programming.cp03_thread_connection.c1_11.p_r_allwait.extthread;

import java-multi_thread_programming.cp03_thread_connection.c1_11.p_r_allwait.entity.P;

/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年2月24日 下午4:20:22
* 类说明
*/
public class ThreadP extends Thread {
   private P p;
   

	public ThreadP( P p ) {
		super();
		this.p=p;
		
	}
	
	@Override
	public void run() {
		while(true){
			p.setValue();
		}
	}
}
