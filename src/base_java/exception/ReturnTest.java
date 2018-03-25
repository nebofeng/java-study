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
		
//		额。这个。不知道是不是你想问的。
//
//		我只看到四个sysout
//
//		第一个是 10除以3  等于 3 余1 取余数 。1 
//
//		第二个  10除以 -3  等于 -3 余1 取余数  1 
//
//		第三个  与第一个相同 只是括号内的10前面多了个空格。
//
//		第四个 -10 除以-3 等于 3 余-1 取余数 -1 。
//
//		不知道这是不是你想问的 。
//
//		百度知道提问。可以贴出代码+图。代码部分可以在编辑中设置为代码。这样更容易看一些。public class Test {
//		   public static void main(String[] args) {
		       System.out.println(10%3);
		       System.out.println(10%-3);
		       System.out.println( 10%3);
		       System.out.println(-10 % -3);
//		   }
		//System.out.println(test());		
	}
	
	public static int test() {
		 int i = 1;
		 
		  
		 try{
		     return i;
			
		 }catch(Exception e) {
			 
			  return i; 
		 }finally {
		 	 i++; 
		    return i;
		    
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
  * 有try catch语句的情况下 。return不能写在 try之前。 : 如果不是分支语句 return之后就不执行 。
  * 因为try中会有异常。会使trry中return失效 。所以只有try中有异常是不对的 。
  * 
  * 
  * 
  * 
  * 
  * 
  * 
  */

	
}
