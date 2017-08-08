
package java_multi_thread_programming.cp01.login;
/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年2月15日 下午1:56:55
* 类说明:模仿的登陆servlet
*/
public class LoginServlet {
	
	private static String usernameRef;
	private static String passwordRef;
	public static void doPost(String username,String password){
		try{
			usernameRef=username;
			if(username.equals("a")){
				Thread.sleep(5000);
			}
			passwordRef=password;
			System.out.println("username= "+usernameRef+"password= "
			+passwordRef);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
