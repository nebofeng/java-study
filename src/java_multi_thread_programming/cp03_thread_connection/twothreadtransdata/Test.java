package java_multi_thread_programming.cp03_thread_connection.twothreadtransdata;

public class Test {
    public static void main(String[] args) {
    	MyList list =new MyList();
		ThreadA1 a =new ThreadA1(list);
		a.setName("A");
		a.start();
		ThreadB1 b=new ThreadB1(list);
		b.setName("B");
		b.start();
    }
}
