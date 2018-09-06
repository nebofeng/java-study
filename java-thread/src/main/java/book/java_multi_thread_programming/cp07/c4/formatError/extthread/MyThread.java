
package book.java_multi_thread_programming.cp07.c4.formatError.extthread;

import java.text.SimpleDateFormat;
import java.util.Date;

import java.text.ParseException;

/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年2月28日 下午5:38:52
* 类说明
*/
public class MyThread extends Thread{
	private SimpleDateFormat sdf;
	private String dateString ;
	
	public MyThread(SimpleDateFormat sdf,String dateString ) {
			super();
			this.sdf=sdf;
			this.dateString=dateString;
	}

	@Override
	public void run() {
		try{
			 Date dateRef=sdf.parse(dateString);
			String newDateString =sdf.format(dateRef).toString();
			if(!newDateString.equals(dateString)){
				System.out.println("ThreadName ="+this.getName()
							+"报错了 日期字符串 ：" +dateString +"转换成的日期 为："
							+newDateString);
			}
		}catch(ParseException e){
			e.printStackTrace();
		} 
	}
}
