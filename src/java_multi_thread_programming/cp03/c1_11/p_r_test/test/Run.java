
package java_multi_thread_programming.cp03.c1_11.p_r_test.test;

import java_multi_thread_programming.cp03.c1_11.p_r_test.entity.C;
import java_multi_thread_programming.cp03.c1_11.p_r_test.entity.P;
import java_multi_thread_programming.cp03.c1_11.p_r_test.extthread.ThreadC;
import java_multi_thread_programming.cp03.c1_11.p_r_test.extthread.ThreadP;

/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年2月24日 下午4:18:22
* 类说明
*/
public class Run {
	public static void main(String[] args) {
		String lock=new String("");
		P p=new P(lock);
		C r =new C(lock);
		
		ThreadP pThread=new ThreadP(p);
		
		ThreadC rThread=new ThreadC(r);
		
		pThread.start();
		rThread.start();
		
	}
}
