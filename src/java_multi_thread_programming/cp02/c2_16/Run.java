
package java_multi_thread_programming.cp02.c2_16;
/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年2月21日 下午4:59:42
* 类说明
*/
public class Run {
	
	public static void main(String[] args) {
		
		MyService myService=new MyService();
		
		ThreadA a=new ThreadA(myService);
		a.setName("A");
		a.start();
		
		ThreadB b=new ThreadB(myService);
		b.setName("b");
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
//		System.out.println(""+System.currentTimeMillis());
//		for(int i=1;i<=1000000000;i++){
//			for(int j=1;j<=1000;j++){
//				int k=j;
//			}
//		}
//		System.out.println(""+System.currentTimeMillis());

		b.start();
		
	}
	
}
