package think_in_java.cp_03.relational_operator;

public class EqualsMethod {
		public static void main(String[] args) {
		  Integer n1 = new Integer(47);
			Integer n2 = new Integer(47);
//			Integer n2=n1;
			System.out.println(n1.equals(n2));

	}
}
/*
正如我们预计的那样，此时得到的结果是true。但事情并未到此结束！假设您创建了自己的类，
就象下面这样： 
*/