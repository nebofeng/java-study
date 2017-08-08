
package java_multi_thread_programming.cp04.c1_8.service;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年2月27日 下午4:06:05
* 类说明
*/
public class MyService {
	private Lock lock=new ReentrantLock();
	public Condition condition=lock.newCondition();
	public boolean hasValue=false;
	
	
	
	public void set(){
		try{
			lock.lock();
			while(hasValue==true){
				condition.await();
				System.out.println("可能出现多个 ■■ ");
			}
			System.out.println("打印 ■");
			condition.signal();
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
	}
	
	public void get(){
		try{
			lock.lock();
			while(hasValue==false){
				condition.await();
				System.out.println("有可能出现多个□□");
			}
			System.out.println("打印  □ ");
			condition.signal();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
	}
	
	
	
	
}
