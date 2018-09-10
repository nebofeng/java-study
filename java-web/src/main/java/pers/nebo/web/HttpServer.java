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
			ServerSocket server = new ServerSocket(8080);
			while (1 == 1) {
				// 接收客户端请求数据
				Socket socket = null;
				try {
					//accept client  socket :
					socket = server.accept();
					new SocketThread(socket).start();
					//这里启动一个线程处理这个socket；

				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}catch(IOException e){
				e.printStackTrace();
			}
		}
	 }

