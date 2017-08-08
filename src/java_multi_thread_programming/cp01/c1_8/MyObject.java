
package java_multi_thread_programming.cp01.c1_8;
/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年2月16日 下午1:51:01
* 类说明
*/
public class MyObject {
	private String username="1";
	private String password="11";
	
	public void setValue(String u,String p){
		this.username=u;
		if(Thread.currentThread().getName().equals("a")){
			System.out.println("停止 a 线程");
			Thread.currentThread().suspend();
		}
		this.password=p;
	}
	
	public void printUsernamePassword(){
		System.out.println(username +"++"+password);
	}
	
}
