
package java-multi_thread_programming.cp06.c4.singletonandserializable.test;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年2月28日 下午3:28:12
* 类说明
*/
public class MyObject implements Serializable{
	public static final long serialVersionUID=888L;
	
	//内部类方式
	private static class MyObjectHandler{
		private static final MyObject myObject=new MyObject();
	}
	private MyObject(){
		
	}
	public static MyObject getInstance(){
		return MyObjectHandler.myObject;
	}
	
	
	//该方法在readObject方法调用之后 调用。是用来替换从流中读取的对象。
	protected Object readResolve() throws ObjectStreamException {
			System.out.println("调用了 readResolve方法 ");
			return MyObjectHandler.myObject;
	}
}
