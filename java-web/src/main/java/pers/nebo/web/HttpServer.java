package pers.nebo.web;

/**
 * @auther nebofeng@gmail.com
 * @date 2018/9/7 17:08
 */

import com.sun.org.glassfish.gmbal.Impact;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 *  简单的 Java Http服务
 */
public class HttpServer {


	public static void main(String[] args) {
		try {

			ServerSocket	server = new ServerSocket(8080);


			while (1 == 1) {
				// 接收客户端请求数据
				Socket socket = null;
				try {
					socket = server.accept();
				} catch (IOException e) {
					e.printStackTrace();
				}


				// 读取
				BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				// 写入
				BufferedWriter output = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

				String line = null;
				try {
					line = input.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}

				while (line != null) {
					System.out.println(line);
					output.write("Success!!"  +"\r\n");
					try {
						output.flush();
					} catch (IOException e) {
						e.printStackTrace();
					}
					line = input.readLine();
					return;
				}
				//必须关闭
				input.close();
				output.close();
				socket.close();

			}
	  }catch(IOException e){
			e.printStackTrace();
	}


	}


}
