
package designmode.strategy;
/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年3月8日 下午8:01:17
* 类说明
*/
public class Test {  
	public static void main(String[] args) {
		int [] a={9,3,6,7,1};
		DataSorter.quick_sort(a,0,a.length-1);
		DataSorter.p(a);
	}
}
