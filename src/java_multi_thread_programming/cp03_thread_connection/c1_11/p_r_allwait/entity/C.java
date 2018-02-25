
package java_multi_thread_programming.cp03_thread_connection.c1_11.p_r_allwait.entity;
/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年2月24日 下午7:46:13
* 类说明
*/
public class C {
	private String lock;
	
	public C(String lock) {
		this.lock=lock;
	}
	
	public void getValue(){
		try{
			synchronized(lock){
				while(ValueObject.value.equals("")){
					System.out.println("消费者 "
				+Thread.currentThread().getName()+"WAITTING ");
				lock.wait();
				}
				
				System.out.println("消费者 "+Thread.currentThread().getName()+"RUNNABLE");
				ValueObject.value="";
				lock.notify();
			}
			
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
