package base_java.thread.join_test;

public class ThreadA  extends Thread{
	@Override
	public void run() {
		 System.out.println("+++++++++++++++++++==");
		 try {
			currentThread().sleep(88888);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    
   synchronized void jointest(){
		 long millis  = 10000 ;
			   
			        long base = System.currentTimeMillis();
			        long now = 0;

			        if (millis < 0) {
			            throw new IllegalArgumentException("timeout value is negative");
			        }

			        if (millis == 0) {
			            while (isAlive()) {
			                try {
								wait(0);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
			            }
			        } else {
			            while (isAlive()) {
			                long delay = millis - now;
			                if (delay <= 0) {
			                    break;
			                }
			                try {
								wait(delay);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
			                now = System.currentTimeMillis() - base;
			            }
			        }
	}
	void jointesta(){
		long a =10000000;
		try {
			join(a);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
