
package java_multi_thread_programming.cp04.c1_8.extthread;

import java_multi_thread_programming.cp04.c1_8.service.MyService;

/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年2月27日 下午4:05:36
* 类说明
*/
public class ThreadB extends Thread{
	private MyService myService=new MyService();
	
	public ThreadB(MyService myService) {
		this.myService=myService;
	}
	
	@Override
	public void run() {
		myService.set();
	}
}
