
package java_multi_thread_programming.cp06.c4.singletonandserializable.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年2月28日 下午3:36:05
* 类说明
*/
public class SaveandRead {
	public static void main(String[] args) {
		try{
			MyObject myObject=MyObject.getInstance();
			FileOutputStream fosRef=new FileOutputStream(new File("myObjectFile.txt"));
			
			ObjectOutputStream oosRef=new ObjectOutputStream(fosRef);
			oosRef.writeObject(myObject);
			oosRef.close();
			fosRef.close();
			System.out.println(myObject.hashCode());
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		
		
		try{
			FileInputStream fisRef=new FileInputStream(new File("myObjectFile.txt"));
			
			ObjectInputStream iosRef=new ObjectInputStream(fisRef);
			MyObject myObject=(MyObject)iosRef.readObject();
			iosRef.close();
			fisRef.close();
			System.out.println(myObject.hashCode());
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
