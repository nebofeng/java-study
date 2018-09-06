
package book.java_multi_thread_programming.cp03_thread_connection.c1_12.pipeInputOutput.service;
import java.io.IOException;
import java.io.PipedInputStream;;

/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年2月24日 下午10:13:12
* 类说明
*/
public class ReadData {
	
	public void readMethod(PipedInputStream input) {
		try{
			System.out.println("read :");
			byte[] byteArray=new byte[20];
			int readLength=input.read(byteArray);
			while(readLength!=-1){
				String newData=new String(byteArray,0,readLength);
				System.out.println(newData);
				readLength=input.read(byteArray);
			}
			System.out.println("/n");
			input.close();
		}catch(IOException e){
			e.printStackTrace();
			
		}
		
		
	}
}
