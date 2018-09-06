package book.java_multi_thread_programming.cp01.current_thread_txt;

public class CountOperate  extends Thread{
    
	public CountOperate() {
		System.out.println("CountOperate==>begin");
		
		System.out.println(Thread.currentThread().getName()+"currentThread==>begin");
		System.out.println(this.getName()+"==>this");
		
		
		System.out.println("CountOperate==>end"); 
		
		
	}

	@Override
	public void run() {
		 System.out.println("run ===> begin");
		 
		 System.out.println(Thread.currentThread().getName()+"currentThread==>begin");
			System.out.println(this.getName()+"==>this");
		 
		 System.out.println("run ===> end");
		 
	}
	

}
