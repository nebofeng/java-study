package think_in_java.cp_05.dessert;

public class Dinner {
	
	public Dinner() {
		System.out.println("Dinner constructor");
		}
		public static void main(String[] args) {
		Cookie x = new Cookie();
		x.foo();
		//! x.foo(); // Can't access   只有Dinner在dessert包内这个方法才能被访问
		}
}
