
package book.java_multi_thread_programming.cp03_thread_connection.c1_11.p_r_allwait.extthread;

import book.java_multi_thread_programming.cp03_thread_connection.c1_11.p_r_allwait.entity.C;

/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年2月24日 下午4:22:18
* 类说明
*/
public class ThreadC  extends Thread{
	private C r;
	
	
	public ThreadC(C r) {
		super();
		this.r=r;
	}
	
	@Override
	public void run() {
		while(true){
			r.getValue();
		}
	}
	
}
