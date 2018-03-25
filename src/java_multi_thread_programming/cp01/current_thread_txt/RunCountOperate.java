package java_multi_thread_programming.cp01.current_thread_txt;

public class RunCountOperate {
	public static void main(String[] args) {
		CountOperate cp = new CountOperate();
		cp.setName("CP");
		cp.start();
	}

}
