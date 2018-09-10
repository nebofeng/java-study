package pers.nebo.web;



import java.io.*;
import java.net.Socket;

/**
 * @auther nebofeng@gmail.com
 * @date 2018/9/10 10:20
 */
public class SocketThread  extends Thread{
	private  Socket socket;

	SocketThread(Socket socket){
		this.socket=socket;
	}
	@Override
	public void run() {
		// 读取
		BufferedReader input = null;
		try {
			input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			BufferedWriter output = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			// 写入
			String line = null;
			try {
				line = input.readLine();
				if(line!=null){
					String method= line.substring(0,4).trim();
					System.out.println("====="+method);
					if("get".equalsIgnoreCase(method)){
			 			//get 方法
						System.out.println("===INIT");
						output.write("get method");


						output.flush();
					}else {
						output.write("not get mothod");
					}
				}
			//	output.flush();
				//close stream and socket
				input.close();
				output.close();
//				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	void  doGet(){

	}


	void doPost(){


	}
}
