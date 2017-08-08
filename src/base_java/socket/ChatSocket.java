
package base_java.socket;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;

/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年7月9日 下午9:27:58
* 类说明
*/
public class ChatSocket extends Thread {
	Socket socket;
	public ChatSocket(Socket s){
		socket=s;
	}
	
	
	@Override
	public void run() {
		try {
			BufferedWriter bw=
					new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			socket.getOutputStream();
			int count=0;
			while(true){
				bw.write("loop : "+count);
				sleep(1000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
