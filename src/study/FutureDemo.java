
package study;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;



/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年2月3日 下午6:56:21
* 类说明：从小工到专家，演示Runnable，Callable，FutureTask
*/
public class FutureDemo {
	//线程池
	static ExecutorService mExecutor=Executors.newSingleThreadExecutor();
	
	//main函数
	 public static void main(String [] args){
		try{
			futureWithRunnable();
			futureWithCallable();
			futureTask();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	//向线程池中提交 Runnable对象
	private static void futureWithRunnable() throws InterruptedException,
	ExecutionException{
		//提交runnable对象 ，没有返回值，future没有数据
		Future<?> result=mExecutor.submit(new Runnable(){
		
			@Override
			public void run() {
				fibc(20);
			}
		});
		System.out.println("future result from runable :" +result.get());
	}
	
	//提交Callable对象，有返回值
	
	private static void futureWithCallable() throws InterruptedException,
	ExecutionException{
		/**
		 * 提交 Callable，有返回值，future中能够获取返回值
		 */
		Future<Integer> result2=mExecutor.submit(new Callable<Integer>(){
		
			@Override
			public Integer call() throws Exception {
				
				return fibc(20);
			}
		});
		System.out.println("future result from callable :" +result2.get());
	}
	
	//
	private static void futureTask() throws InterruptedException ,ExecutionException{
		//提交futureTask对象
		FutureTask<Integer> futureTask=new FutureTask<Integer>(
				new Callable<Integer>(){
					public Integer call() throws Exception {
						return fibc(20);
					};
				}
				);
		//提交
		mExecutor.submit(futureTask);
		
		System.out.println("future result from futureTask : " +futureTask.get());
		
		
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
