package cz360_18;

 
import java.util.HashSet;
import java.util.Scanner;

public class Main3 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		if(n<0|n>100) {
			 System.out.println("输入数据不符合要求");
			 System.exit(0);	
		}
		
		int p = m;
		int an= 1;
		for(int i=1;i<=m;i++) {
			an = an*i;
		}
	    System.out.println(an);
		int result =(int) ((Math.pow((n-m), m)*(n-m)*an) %772235) ;
	  
	 //n 个位置  m种颜色花。 每朵花至少出现一次。相同颜色的花。不在同一个位置。
	   
//	    等同于 n个球 m个桶 。 每个桶至少一个球。 相同的桶里面。不能放同一个球 。
	   System.out.println(result);
	   
		   
	   } 
     	
	 

}
