
package java-multi_thread_programming.cp03_thread_connection.c1_11.p_r_test.entity;
/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年2月24日 下午4:04:50
* 类说明:生产者
*/
public class P {
	
	private String lock;
	public P(String lock) {
		super();
		this.lock=lock;
	}
	
	public void setValue(){
		try{
			synchronized(lock){
				if(!ValueObject.value.equals("")){
					lock.wait();
				}
				String value=System.currentTimeMillis()+"_"
						+System.nanoTime();
				System.out.println("set 的值是： "+value);
				ValueObject.value=value;
				lock.notify();
			}	
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
