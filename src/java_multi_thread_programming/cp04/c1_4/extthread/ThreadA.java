
package java-multi_thread_programming.cp04.c1_4.extthread;

import java-multi_thread_programming.cp04.c1_4.service.MyService;

/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年2月27日 下午3:20:22
* 类说明
*/
public class ThreadA extends Thread{
	private MyService service;
	public ThreadA(MyService service) {
		super();
		this.service=service;
	}

	@Override
	public void run() {
		service.await();
	}
}
