package base_java.czlianjia2018;

public class Test {
	public static void main(String[] args) {
		A a = new B();
		a.show();

	}
}

class A {
	int x = 50;

	public void show() {
		System.out.println(this.x);
	}

}

class B extends A {
	int y = 100;

	@Override
	public void show() {
		this.y = 200;
		this.showB();
		System.out.println(this.y);
	}
    
	public void showB() {
		System.out.println("我是子类的showB方法");
	}
	public void showC() {
		System.out.println("我是子类的showB方法");
	}
}
