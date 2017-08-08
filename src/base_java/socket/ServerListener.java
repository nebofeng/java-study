
package base_java.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JOptionPane;

/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年7月9日 下午9:25:49
* 类说明
*/
public class ServerListener extends Thread {
	

	@Override
	public void run() {
		try {
			ServerSocket serverSocket=new ServerSocket(12345);
			
			while(true){
				Socket socket=serverSocket.accept();
				JOptionPane.showMessageDialog(null, "有客户端连接到了本机的===端口");
				new ChatSocket(socket).start();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
