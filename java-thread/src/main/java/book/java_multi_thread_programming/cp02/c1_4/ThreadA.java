
package book.java_multi_thread_programming.cp02.c1_4;
/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年2月16日 下午7:17:56
* 类说明
*/
public class ThreadA extends Thread{
	private MyObject object;
	public ThreadA(MyObject object){
		super();
		this.object=object;
	}
	@Override
	public void run() {
		super.run();
		object.methodA();
	}
}
