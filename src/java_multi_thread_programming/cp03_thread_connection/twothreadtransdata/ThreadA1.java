package java_multi_thread_programming.cp03_thread_connection.twothreadtransdata;

public class ThreadA1 extends Thread {
	
	
	private MyList list;
	public ThreadA1(MyList list) {
		super();
		this.list=list;
	}
	@Override
	public void run() {
		 try{
			for(int i=0;i<10;i++) {
				list.add();
				System.out.println("添加了"+(i+1)+"个元素");
				Thread.sleep(3000);
			} 
		 }catch(InterruptedException e) {
			 e.printStackTrace();
		 }
	}

}
