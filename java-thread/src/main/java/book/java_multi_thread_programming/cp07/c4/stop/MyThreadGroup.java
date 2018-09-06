
package book.java_multi_thread_programming.cp07.c4.stop;
/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年2月28日 下午8:03:42
* 类说明
*/
public class MyThreadGroup extends ThreadGroup{

	
	public MyThreadGroup(String name) {
		super(name);
	}
	
	@Override
	public void uncaughtException(Thread t, Throwable e) {
		
		super.uncaughtException(t, e);
		this.interrupt();
	}
}
