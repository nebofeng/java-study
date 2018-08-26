
package java-multi_thread_programming.cp03_thread_connection.c1_11.p_r_allwait.entity;
/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年2月24日 下午7:38:38
* 类说明
*/
public class P {
	private String lock;
	
	public P(String lock ) {
		this.lock=lock;
	}
	
	public void setValue(){
		try{
			synchronized(lock){
				while(!ValueObject.value.equals("")){
					System.out.println("生产者 "
							+Thread.currentThread().getName() +"WAITING**");
					lock.wait();
					
				}
				System.out.println("生产者 "
						+Thread.currentThread().getName()
						+"RUNNABLE ");
				String value=System.currentTimeMillis()+"_"
						+System.nanoTime();
				ValueObject.value=value;
				lock.notify();
			}
			
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
