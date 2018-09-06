package pers.nebo.test;

public class JavaString {

	public static void main(String[] args) {


		String data  = " ";
		data ="fdaf";
		int id =1;
		switch(id){
			case 1:
				data="new data";
		}
		String str="dfaf";
        str = new String("DFASF");
		String newdata =str;
		String newdata1=data;



//		new Thread(new Runnable() {
//			@Override
//			public void run() {
//				new JavaString().test(str);
//			}
//		}).start();
//		new Thread(()->new JavaString().test(str)).start();
//		new Thread(()->new JavaString().test(data)).start();
		new Thread(()->new JavaString().test(newdata)).start();
		new Thread(()->new JavaString().test(newdata1)).start();
       /*
        注释掉的代码不能正常编译的原因：
        lambda表达式（内部类中）在1.8 可以传入非final修饰的变量。但是 变量不能被赋值两次，因为
            ** 引用的局部变量必须是最终的（final）或事实上最终的
         第一，实例变量和局部变量背后的实现有一 个关键不同。实例变量都存储在堆中，而局部变量则保存在栈上
         。如果Lambda可以直接访问局部变量，而且Lambda是在一个线程中使用的，则使用Lambda的线程，
         可能会在分配该变量的线程将这个变量收回之后，去访问该变量。
         因此，Java在访问自由局部变量时，实际上是在访问它的副本，而不是访问原始变量。
         如果局部变量仅仅赋值一次那就没有什么区别了——因此就有了这个限制。

         第二，这一限制不鼓励你使用改变外部变量的典型命令式编程模式（这种模式会阻碍很容易做到的并行处理）

         当你将它加入到内部类的时候。编译器自动加上了final（隐式） ， 所以如果你对它进行更改，就会报错。
        */




		System.out.printf(data);
	}

	void test(String data){
		System.out.print(data);
	}
}
