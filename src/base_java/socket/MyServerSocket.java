
package base_java.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JOptionPane;

/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年7月9日 下午9:19:42
* 类说明
*/
public class MyServerSocket {
	public static void main(String[] args) {
		new ServerListener().start();
		
	}
}
