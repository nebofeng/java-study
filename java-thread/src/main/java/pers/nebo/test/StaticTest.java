package pers.nebo.test;

/**
 * @auther nebofeng@gmail.com
 * @date 2018/9/7 11:54
 */
public class StaticTest {

	public static void main(String[] args) {
		for(int i=0;i<4;i++){
			Thread thread = new MyThread(i);
			//thread.run();
			thread.start();
		}
	}
}
class MyThread extends   Thread {
	int a;
	MyThread(int a) {
		this.a = a;
	}
	@Override
	public void run() {
		System.out.println("num===" + a + "   threadId===" + Thread.currentThread().getId());
		demo();
	}
	void demo() {
	}


}
/*
 当 变量为 static 的时候 ，意味着多个线程可以同时对该变量进行编辑 。
 如果想要使每个线程的变量都不一样。不可以使用全局static 。但是又需要该变量可以在
 使用类的方法中直接使用。
 1. 不使用 static ， 全部局部 ，如果不是main方法调用 ，将变量传入方法内，
 */