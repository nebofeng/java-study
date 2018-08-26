package java-multi_thread_programming.cp03_thread_connection.twothreadtransdata;

public class Test2 {
	public static void main(String[] args) {
		Left left = new Left();
		Right right = new Right();

		left.start();
		right.start();
		 
		 
		while (true) {
			
			System.out.println(left.n+"="+right.n);
			
			if (left.n >= 8 || right.n >= 8)
			{ // 根本停不下来
				System.out.println(left.n+"=="+right.n);
				System.out.println("=");
				//  left.stop();
			      // right.stop();
				System.exit(0);}
		}
		

	}

}
