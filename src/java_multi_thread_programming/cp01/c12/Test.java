package java-multi_thread_programming.cp01.c12;

public class Test {
	public static void main(String[] args) {
		TestThread thread = new TestThread();
		thread.start();
		thread.interrupt();
		
		System.out.println(" thread"+thread.isInterrupted());
		System.out.println("mythread"+thread.isInterrupted());
		;
		System.out.println("mythread"+thread.interrupted());
		
		System.out.println(" thread"+thread.interrupted());
		
		
	}
	
	
	

}
