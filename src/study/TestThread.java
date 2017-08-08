
package study;
/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年2月3日 下午4:49:34
* 类说明:翻阅从小工到专家时，回顾线程知识点。
*/
public class TestThread {
	
	
	private static Object sLockObject=new Object();
	
	//wait方法
	
	static void waitAndNotifyAll(){
		System.out.println("主线程运行");
		//创建并启动子线程
		Thread thread=new WaitThread();
		thread.start();
		long startTime=System.currentTimeMillis();
		try{
			synchronized (sLockObject) {
				
				System.out.println("主线程等待");
				sLockObject.wait();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		long timesMs=(System.currentTimeMillis()-startTime);
		System.out.println("主线程继续--等待耗时 ："+timesMs+" ms");
	}
	
	
	
	//join方法
	static void joinDemo(){
		Worker worker1=new Worker("worker1");
		Worker worker2=new Worker("worker2");
		worker1.start();
		System.out.println("启动线程 1");
		try{
			
			//调用worker1的join函数 ，主线程会阻塞知道worker1完成
			worker1.join();
			
			System.out.println("启动线程2");
			worker2.start();
			worker2.join();
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("主线程继续执行");

	}
	
	//yield方法
	
	static void yieldDemo(){
		YieldThread t1=new YieldThread("thread -1");
		YieldThread t2=new YieldThread("thread -2");
		t1.start();
		t2.start();

		
	}
	
	
	
	//主函数
	public static void main(String [] args){
		System.out.println("start");
//		 waitAndNotifyAll();
//		joinDemo();
		yieldDemo();
	}
	
	
	
	
	
	//线程类
	//wait方法
	static class WaitThread extends Thread{

		@Override
		public void run() {
				try{
					synchronized (sLockObject) {
						System.out.println("开始睡觉");
						Thread.sleep(3000);
						sLockObject.notifyAll();
					}
				}catch(Exception e){
					e.printStackTrace();
				}
		}
	}
	//join方法
	static class Worker extends Thread{
		public Worker(String name){
			super(name);
		}
		
		
		@Override
		public void run() {
			try{
				Thread.sleep(2000);
				
			}catch(Exception e){
				e.printStackTrace();
			}
			System.out.println("work in "+getName());
		}
	}
	//yield方法
	static class YieldThread extends Thread{
		public YieldThread(String name){
			super(name);
		}
		public synchronized void run(){
			for(int i=0;i<5;i++){
				System.out.printf("%s[%d]--->%d\n",this.getName(),this.getPriority(),i);
				//当i=2时,调用当前线程的yield函数
				if(i==2){
					Thread.yield();
				}
			}
		}
	}
	
}
