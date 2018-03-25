
package study;

import java.util.concurrent.Callable;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年2月9日 下午9:15:25
* 类说明
*/
public class ExecutorDemo {
	//任务数量
	private static final int MAX=10;
	
	public static void main(String [] args){
		try{
//			fixedThreadPool(3);
//			newCachedThreadPool();
			scheduledThreadPool();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	private static void fixedThreadPool(int size) throws CancellationException,ExecutionException
	,InterruptedException{
		//创建固定数量的线程池
		ExecutorService executorService=Executors.newFixedThreadPool(size);
		for(int i=0;i<MAX;i++){
			//提交任务
			Future<Integer> task=executorService.submit(new Callable<Integer>(){

				@Override
				public Integer call() throws Exception {
					System.out.println("执行线程 ： "+Thread.currentThread().getName());
					return fibc(40);
				}
				
			});
			//获取结果
			System.out.println("第"+i+"次计算，结果： " +task.get());
		}
		
		
	}
	
	private static void newCachedThreadPool() throws CancellationException,ExecutionException
	,InterruptedException{
		//创建线程池
		ExecutorService executorService=Executors.newCachedThreadPool();
		for(int i=0;i<MAX;i++){
			executorService.submit(new Runnable(){

				@Override
				public void run() {
					System.out.println("执行线程 ："+Thread.currentThread().getName()+", 结果 "+fibc(20));
					
				}
				
			});
		}
		
	}
	
	private static void scheduledThreadPool() throws CancellationException ,ExecutionException
	,InterruptedException{
		//创建定时执行的线程池
		ScheduledExecutorService executorService=Executors.newScheduledThreadPool(3);
		
		executorService.scheduleAtFixedRate(new Runnable(){
			
			@Override
			public void run() {
				System.out.println("Thread ： "+Thread.currentThread().getName()
						+"， 定时计算： ");
				System.out.println("结果： " +fibc(30));
			}
		},1, 2, TimeUnit.SECONDS);
		//参数2 为第一次延迟时间 ，参数3为执行周期
		
		executorService.scheduleAtFixedRate(new Runnable(){
			
			 
			@Override
			public void run() {
				System.out.println("Thread : "+Thread.currentThread().getName()
						+", 定时计算 2");
				System.out.println("结果 "+fibc(40));
			}
			
		},1, 2, TimeUnit.SECONDS);		
		
		
	}
	
	//效率底下的斐波那契数列，其是耗时操作
		private static int fibc(int num){
			if(num==0){
				return 0;
			}
			if(num==1){
				return 1;
			}
			return fibc(num-1)+fibc(num-2);
		}
	
}
