
package java-multi_thread_programming.cp03_thread_connection.c1_12.pipeInputOutput.test;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

import java-multi_thread_programming.cp03_thread_connection.c1_12.pipeInputOutput.extthread.ThreadRead;
import java-multi_thread_programming.cp03_thread_connection.c1_12.pipeInputOutput.extthread.ThreadWrite;
import java-multi_thread_programming.cp03_thread_connection.c1_12.pipeInputOutput.service.ReadData;
import java-multi_thread_programming.cp03_thread_connection.c1_12.pipeInputOutput.service.WriteData;

/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年2月25日 下午2:30:55
* 类说明
*/
public class Run {
	public static void main(String[] args) {
		try{
			WriteData writeData=new WriteData();
			ReadData readData=new ReadData();
			PipedInputStream input=new PipedInputStream();
			PipedOutputStream out=new PipedOutputStream();
			
			input.connect(out);
			 
			ThreadRead threadRead=new ThreadRead(readData,input);
			threadRead.start();
			Thread.sleep(2000);
			
			ThreadWrite threadWrite=new ThreadWrite(writeData,out);
			threadWrite.start();
			
		
		}catch(Exception e){
			e.printStackTrace();
			
		}
	}
}
