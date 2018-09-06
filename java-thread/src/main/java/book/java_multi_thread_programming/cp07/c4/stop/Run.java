
package book.java_multi_thread_programming.cp07.c4.stop;
/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年2月28日 下午8:08:10
* 类说明
*/
public class Run {
	public static void main(String[] args) {
		MyThreadGroup myGroup=new MyThreadGroup("我的线程组");
		MyThread[] myThread=new MyThread[10];
		for(int i=0;i<myThread.length;i++){
			myThread[i]=new MyThread(myGroup, "线程"+(i+1), "1");
			myThread[i].start();
		}
		MyThread newT=new MyThread(myGroup, "报错线程", "a");
		newT.start();
	}
}
