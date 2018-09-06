
package book.java_multi_thread_programming.cp04.c1_8.extthread;

import book.java_multi_thread_programming.cp04.c1_8.service.MyService;

/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年2月27日 下午4:05:36
* 类说明
*/
public class ThreadA extends Thread{
	private MyService myService=new MyService();
	
	public ThreadA(MyService myService) {
		this.myService=myService;
	}
	
	@Override
	public void run() {
		myService.get();
	}
}
