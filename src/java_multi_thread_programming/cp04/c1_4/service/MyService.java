
package java_multi_thread_programming.cp04.c1_4.service;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年2月27日 下午3:00:33
* 类说明
*/
public class MyService {
	private Lock lock=new ReentrantLock();
	public Condition condition=lock.newCondition();
	
	public void await(){
		try{
			lock.lock();
			System.out.println("await 时间为"+System.currentTimeMillis());
			condition.await();
		}catch(InterruptedException e){
			   
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
	}
	
	
	public void signal(){
		try{
			lock.lock();
			System.out.println("singal 时间为 "+System.currentTimeMillis());
			condition.signal();
		}finally{
			lock.unlock();
		}
	}
}
