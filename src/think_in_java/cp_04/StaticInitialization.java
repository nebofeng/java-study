package think_in_java.cp_04;
		class Bowl {
				Bowl(int marker) {
				  System.out.println("Bowl(" + marker + ")");
				}
				void f(int marker) {
			    	System.out.println("f(" + marker + ")");
				}
		}
		class Table {
			static Bowl b1 = new Bowl(1);
			Table() {
				System.out.println("Table()");
				b2.f(1);
			}
			void f2(int marker) {
			   System.out.println("f2(" + marker + ")");
			}
			static Bowl b2 = new Bowl(2);
		}
		class Cupboard {
			Bowl b3 = new Bowl(3);
			static Bowl b4 = new Bowl(4);
			Cupboard() {
			   System.out.println("Cupboard()");
			   b4.f(2);
		    }
			void f3(int marker) {
			   System.out.println("f3(" + marker + ")");
			}
	     	static Bowl b5 = new Bowl(5);
	     	static void run(){
	     	System.out.println("run");
	     	}
		}
		public class StaticInitialization {
			StaticInitialization(){
				System.out.println("父类构造=");
			}
			public static void main(String[] args) {
//				System.out.println(
//				"Creating new Cupboard() in main");
//				new Cupboard();
//				System.out.println(
//				"Creating new Cupboard() in main");
//				new Cupboard();
//				t2.f2(1);
//				t3.f3(1);
				Cupboard Cupboard1=new Cupboard();
				Cupboard1.run();
//				Cupboard Cupboard1;
			}
			static Table t2 = new Table();
			static Cupboard t3 = new Cupboard();
}
//前面的类大于后面的类主函数开始执行 ，静态
//static -》赋值语句（Bowl b3 = new Bowl(3);）->构造方法（新建一个对象会调用 其 初始语句，构造方法）