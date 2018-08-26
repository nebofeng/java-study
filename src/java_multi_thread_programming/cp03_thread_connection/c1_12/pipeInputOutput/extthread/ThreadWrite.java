
package java-multi_thread_programming.cp03_thread_connection.c1_12.pipeInputOutput.extthread;

import java.io.PipedOutputStream;

import java-multi_thread_programming.cp03_thread_connection.c1_12.pipeInputOutput.service.WriteData;

/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年2月25日 下午2:18:56
* 类说明
*/
public class ThreadWrite extends Thread{
	private WriteData write;
	private PipedOutputStream out;
	
	public ThreadWrite(WriteData write,PipedOutputStream out) {
		super();
		this.out=out;
		this.write=write;
	}
	
	
	@Override
	public void run() {
		write.writeMethod(out);

	}
	
}
