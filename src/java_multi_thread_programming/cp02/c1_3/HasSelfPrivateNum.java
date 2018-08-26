
package java-multi_thread_programming.cp02.c1_3;
/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年2月16日 下午3:03:14
* 类说明
*/
public class HasSelfPrivateNum {
	private int num=0;
	 synchronized public  void addI(String username) {
		try{
			if(username.equals("a")){
				num=100;
				System.out.println(" a set over!");
				Thread.sleep(2000);
			}else{
				num=200;
				System.out.println("b set over!");
			}
			System.out.println(username+"num="+num);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
