package book.java_multi_thread_programming.cp03_thread_connection.twothreadtransdata;

public class Right extends Thread {
	int n = 0;

	public void run() {
		while (true) {
			n++;
			System.out.printf("\n%40s", "我在右边写字");
			try {
				sleep((int) (Math.random() * 100) + 100);
			} catch (InterruptedException e) {
			}
		}
	}

}
