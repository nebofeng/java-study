
package book.java_multi_thread_programming.cp03_thread_connection.c1_11.p_r_test.entity;
/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年2月24日 下午4:05:04
* 类说明:消费者
*/
public class C {
	private String lock;
	
	public C(String lock) {
		super();
		this.lock=lock;
	}
	
	public void getValue(){
		try{
			synchronized(lock){
				if(ValueObject.value.equals("")){
					lock.wait();
				}
				System.out.println("get 的值 是："+ValueObject.value);
				ValueObject.value="";
				lock.notify();
			}
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
