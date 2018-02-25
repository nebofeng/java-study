package java_multi_thread_programming.cp03_thread_connection.twothreadtransdata;

public class Left extends Thread {
	int n = 0;

	public void run() {
		while (true) {
			n++;
			System.out.printf("\n%s", "我在左边写字"+n);
			try {
				sleep((int) (Math.random() * 100) + 100);
			} catch (InterruptedException e) {
			}
		}
	}

}
