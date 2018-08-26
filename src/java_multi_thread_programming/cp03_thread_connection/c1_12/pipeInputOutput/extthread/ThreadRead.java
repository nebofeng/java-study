
package java-multi_thread_programming.cp03_thread_connection.c1_12.pipeInputOutput.extthread;

import java.io.PipedInputStream;

import java-multi_thread_programming.cp03_thread_connection.c1_12.pipeInputOutput.service.ReadData;

/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年2月25日 下午2:25:36
* 类说明
*/
public class ThreadRead  extends Thread{
	private ReadData read;
	private PipedInputStream input;
	
	public ThreadRead(ReadData read,PipedInputStream input) {
		super();
		this.read=read;
		this.input=input;
	
	}
	
	
	@Override
	public void run() {
		read.readMethod(input);
	}
}
