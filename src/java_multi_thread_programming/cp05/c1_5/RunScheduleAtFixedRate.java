
package java-multi_thread_programming.cp05.c1_5;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年2月27日 下午9:22:29
* 类说明
*/
public class RunScheduleAtFixedRate {
	private static Timer timer=new Timer();
	
	private static int count=0;
	
	static public class MyTask1 extends TimerTask{

		
		@Override
		public void run() {
			try{
				System.out.println("i begin 运行了 ！时间为"+new Date());
				Thread.sleep(5000);
				System.out.println("i end 运行了 ！ 时间 为 "+new Date()); 
				count++;
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		
	}
	public static void main(String[] args) {
		try{
			MyTask1 task1=new MyTask1();
			SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dateString1="2017-02-17 21:32:30";
			Date dateRef1=sdf1.parse(dateString1);
			System.out.println("字符串  1 时间 ："+dateRef1.toLocaleString()+"当前时间 ："
					+new Date().toLocaleString());
			
			timer.scheduleAtFixedRate(task1, dateRef1, 2000);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
