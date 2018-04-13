package base_java.thread.join_test;

public class JoinTest {
	public static void main(String[] args) throws   InterruptedException   {
		ThreadA A = new ThreadA();
		
		 A.start();
	    // A.join();
	//    A.jointesta( );
	    A.jointest();
		 
		 
	 	System.out.println("===========");
		 
		//为什么线程调用了 start 再调用 wait会报错 。    /wait必须要	持有锁 
		//join 使当前线程阻塞的原因是什么 。 自己使用  当等待的时间为 等待时间参数 与执行消耗时间的较小值
	 	//为什么 join方法中 调用父类的 join方法可以 。但是调用父类的
	}
}
