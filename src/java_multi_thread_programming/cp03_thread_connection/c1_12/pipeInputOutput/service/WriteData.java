
package java_multi_thread_programming.cp03_thread_connection.c1_12.pipeInputOutput.service;
import java.io.IOException;
import java.io.IOException;
import java.io.PipedOutputStream;
/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年2月24日 下午10:07:39
* 类说明
*/
public class WriteData {
	
	public void writeMethod(PipedOutputStream out) {
		try{			
			System.out.println("write ：");
			for(int i=0;i<300;i++){
				String outData=""+(i+1);
				out.write(outData.getBytes());
				System.out.println(outData);
			}
			System.out.println("/n");
			out.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}

	

	
}
