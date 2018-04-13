package base_java.thread.synchorized_test;

class Res {
	String name;
	String sex;
}

class Input implements Runnable {
	private Res r;

	Input(Res r) {
		this.r = r;
	}

	public void run() {
		int x = 0;
		while (true) {
			synchronized (r)
			/* 为什么要加同一个对象才可行。不一样的对象同样是必须执行完语句才有可能执行下一个线程 
			 * 
			 * 不加同一个对象，有可能两个逻辑一起执行。也就是说这边并没有将r的属性更改完。那边就输出了
			 * 所以会出现：  mike....女女女女女 （只是其中一种情况）
			 * 
			 * */
			
			{
				if (x == 0) {
					r.name = "mike";
					r.sex = "man";
				} else {
					r.name = "丽丽";
					r.sex = "女女女女女";
				}
				x = (x + 1) % 2;
			}
		}
	}
}

class Output implements Runnable {
	private Res r;

	Output(Res r) {
		this.r = r;
	}

	public void run() {
		while (true) {
			 synchronized ("a") {
			/* 这就是一句代码为什么要加同步代码块。另一个线程有同步代码块，另一个一定要赋值完以后才有可能执行运行这句输出代码，为什么不加同步代码块会出错 */ 
				System.out.println(r.name + "...." + r.sex);
			 }
		}
	}
}

public class Test {
	public static void main(String[] args) {
		Res r = new Res();
		Input in = new Input(r);
		Output out = new Output(r);
		Thread t1 = new Thread(in);
		Thread t2 = new Thread(out);
		t1.start();
		t2.start();
	}
}