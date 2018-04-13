package base_java.thread.join_test;

public class TestA  extends Thread{
	
	void methodA(){
		System.out.println(currentThread().getName());
		System.out.println("=====A");
	}
	void methodB(){
		System.out.println("======B");
	}
	

}
