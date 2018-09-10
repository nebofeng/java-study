package pers.nebo.web;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;

/**
 * @auther nebofeng@gmail.com
 * @date 2018/9/10 14:14
 */
public class HttpClient {

	public static void main(String[] args) {
		try {
			//建立连接
			Socket client = new Socket("127.0.0.1",8080);
			OutputStream out = client.getOutputStream();
			BufferedReader in  = new BufferedReader(new InputStreamReader(client.getInputStream(),"utf-8"));

			out.write("GET 127.0.0.1:8080 HTTP/1.1\\r\\nHost: www.baidu.com\\r\\n\\r\\n".getBytes());
            out.flush();
			int d=-1;

			System.out.println(in.readLine());
			in.close();
			out.close();
//			while (((d=in.read()))!=-1){
//				System.out.println((char) d);
//			}

			client.close();
//			SocketAddress dst= new InetSocketAddress("127.0.0.1",8080);
//			client.connect(dst);
//			InputStream inputStream = client.getInputStream();
//			BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
//
//			System.out.println(br.readLine());


//			inputStream.read()
//			OutputStream outputStream  = client.getOutputStream();
//			System.out.println(outputStream.);


		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
