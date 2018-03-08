package base_java.exception;
/**
 * 
 * @author *** nebo
 * @date   *** 2018年3月8日
 * @email  *** nebofeng@gmail.com
 * @des    *** 测试return位置对try catch finall的影响
 */
public class ReturnTest {
	
	
	public static void main(String[] args) {		
		System.out.println(test());		
	}
	
	public static int test() {
		 int i = 1;
		 try{
		     return i;
			
		 }catch(Exception e) {
			 
			  return i; 
		 }finally {
		 	 i++; 
		   // return i;
		 }
		 //return i;
		}
	//catch中没有return会报错。
	//try之前return也会报错
	 //后面的return会让前面的return失效 
	
 /*
  * 分析：  finall发生在return之前。但是传递到finally中的值对象。只会传递一个副本。
  * 而不是传递的值本身。所以改变的也是副本。而不是本身。
  * 如果是引用对象就可以改变 。
  * 
  * 
  * 
  * 
  * 
  * 
  */

	
}
