
package java-multi_thread_programming.cp01.login;
/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年2月15日 下午2:05:42
* 类说明
*/
public class BLogin  extends Thread{
	
	@Override
	public void run() {
//		LoginServlet.doPost("b", "bb");
		LoginServletSafe.doPost("b", "bb");

	}
}
