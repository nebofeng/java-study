
package java-multi_thread_programming.cp02.c1_4;
/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年2月16日 下午7:17:56
* 类说明
*/
public class ThreadB extends Thread{
	private MyObject object;
	public ThreadB(MyObject object){
		super();
		this.object=object;
	}
	@Override
	public void run() {
		super.run();
		object.methodA();
	}
}
