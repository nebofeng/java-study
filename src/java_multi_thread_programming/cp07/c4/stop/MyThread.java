
package java_multi_thread_programming.cp07.c4.stop;
/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年2月28日 下午8:05:06
* 类说明
*/
public class MyThread extends Thread{
	private String num;
	
	public MyThread(ThreadGroup group,String name,String num) {
		super(group,name);
		this.num=num;
	}

	@Override
	public void run() {
		int numInt=Integer.parseInt(num);
		while(this.isInterrupted()==false){
			System.out.println("死循环中 ："+Thread.currentThread().getName());
		}
	}
}
