package java-multi_thread_programming.cp03_thread_connection.twothreadtransdata;

 

public class ThreadB1 extends Thread {
	private MyList list;
	public ThreadB1(MyList list) {
		super();
		this.list=list;
	}
   
	
	@Override
	public void run() {
		try {
			 
			while(true) {//while true的时候 。尽管thread a sleep 一秒。但是
			   //System.out.println("=====list.size()=======5");
				//synchronized ("any") {
					
				//}这里的说法是多线程存在可见性问题，可见性就是说一个线程对共享变量值得修改，能够及时的被其他线程看到。在这里虽然线程A对list的size进行了修改，但是线程B不一定能够知道这种修改。如果想要线程B知道这种修改，需要刷新到主内存中，synchronize有刷新的功能
				//或者像是进行一定的输出，等到共享变量的值更新等到主内存中
                Thread.sleep(500);
                //在if之前有操作就会刷新到主内存？ 如果不进行一定的输出就不能更新到主内存吗。
                //
                //final也可以保证内存可见性，System是由final修改的
                //所以这个输出具备刷新功能
				if(list.size()==5) {
					System.out.println("=====list.size()=======5");
					throw new InterruptedException();
				}
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
