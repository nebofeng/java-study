package imooc_answers;

import java.util.Scanner;

public class Userful {
	
	/** 
	   * Scanner类中的方法 
	   * 优点一: 可以获取键盘输入的字符串 
	   * 优点二: 有现成的获取int,float等类型数据，非常强大，也非常方便； 
	   */
	  public static void main( String []args){ 
	    Scanner sc = new Scanner(System.in); 
	    System.out.println("学业评价总分（未乘0.7）:"); 
	    float XUETE = sc.nextFloat();  //读取字符串型输入 
	    
	    System.out.println("德育素质分（未乘0.5）:"); 
	    float XUETE1 = sc.nextFloat();  //读取字符串型输入 
	    System.out.println("社会实践分（未乘0.3）:"); 
	    float XUETE2 = sc.nextFloat();  //读取字符串型输入 
	    System.out.println("其它（未乘0.2）:"); 
	    float XUETE3 = sc.nextFloat();  //读取字符串型输入 
	   
	    System.out.println("学业评价最终=" +(0.7*XUETE)); 
	    System.out.println("学生操行评定=" +(0.5*XUETE1+XUETE2*0.3+XUETE3*0.2)*0.3);
	    System.out.println("总分="+(0.7*XUETE+(0.5*XUETE1+XUETE2*0.3+XUETE3*0.2)*0.3));
	    sc.close();
	   
	  } 
	
}
