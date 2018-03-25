package think_in_java.cp_04;


		
		public class StaticInitializationChild extends StaticInitialization {
			StaticInitializationChild(){
				System.out.println("子类构造=");
			}
			public static void main(String[] args) {
				StaticInitializationChild c=new StaticInitializationChild();
			 //System.out.println("子类执行");
			}
			static Bowl t4 = new Bowl(6);
			
}
//前面的类大于后面的类主函数开始执行 ，静态
//static -》赋值语句（Bowl b3 = new Bowl(3);）->构造方法（新建一个对象会调用 其 初始语句，构造方法）