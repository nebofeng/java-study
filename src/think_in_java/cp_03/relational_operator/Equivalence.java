package think_in_java.cp_03.relational_operator;

public class Equivalence {
	public static void main(String[] args) {
		Integer n1 = new Integer(47);
		Integer n2 = new Integer(47);
		System.out.println(n1 == n2);
		System.out.println(n1 != n2);
		}
/*	
 * 
 其中，表达式System.out.println(n1 == n2)可打印出内部的布尔比较结果。
一般人都会认为输出结果肯定
 先是true，再是false，因为两个Integer 对象都是相同的。但尽管对象的内容相同，
句柄却是不同的，而==和!=比较的正好就是对象句柄。所以输出结果实际上先是false，再是true。
这自然会使第一次接触的人感到惊奇。若想对比两个对象的实际内容是否相同，又该如何操作呢？
此时，必须使用所有对象都适用的特殊方法equals()。但这个方法不适用于“主类型”，那些类
直接使用==和!=即可。下面举例说明如何使用：
*/
}
