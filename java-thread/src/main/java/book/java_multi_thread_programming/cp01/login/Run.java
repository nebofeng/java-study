
package book.java_multi_thread_programming.cp01.login;
/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年2月15日 下午2:08:40
* 类说明
*/
public class Run {
	public static void main(String[] args) {
		ALogin a=new ALogin();
		a.start();
		
		BLogin b=new BLogin();
		b.start();
	}
}
