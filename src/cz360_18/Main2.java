package cz360_18;

 
import java.util.HashSet;
import java.util.Scanner;

public class Main2 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		if(n<0|n>100) {
			 System.out.println("输入数据不符合要求");
			 System.exit(0);	
		}
		/*
		 * 分析：绝对获胜就是说前n+1大的速度一定是比另一边n+1 大的速度快（n为每边数目的一半）
		 * 小的一边获胜必然小于一般。就是说小的一边前 n -1 大的速度 。比另一边n-1小的要小。
		 * 作为数据整体。应当满足的特征为： 1. 排序之后 。包含不同的数字。
		 * 
		 * 
		 *  
		 */
	 
	   for(int i=0;i<n;i++) {
		   int a = s.nextInt();
		   int [] arr = new  int  [2*a];
		   HashSet<Integer> set =new HashSet();
		   for(int j=0;j<2*a;j++) {
			  boolean flag = true;
			  
			  int p=s.nextInt();
			  
			  if(p>=1&&p<=100) {
				  arr[j]=p; 
				  if(!set.contains(p)) {
					 set.add(arr[j]) ;
				  }
		 	  }else {
				  System.out.println("输入数据不符合要求");
				  System.exit(0);
			  }
		 	   
		   }
		   if (set.size()!=1) {
			   System.out.println("YES");
		   }else {
			   System.out.println("NO");
		   }
		   
		   
	   } 
     	
	}

}
