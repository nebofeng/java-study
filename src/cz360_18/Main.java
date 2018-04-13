package cz360_18;

 
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		if(n<0|n>100) {
			 System.out.println("输入数据不符合要求");
			 System.exit(0);	
		}
		 
		 int [] [] arr= new int [n][5] ;
         for(int i = 0;i<n;i++) {
        	 int result=0;
        	 for(int j=0;j<5;j++) {
        		 int p=s.nextInt();
        		 if(p>=0&&p<=100) {
        			 arr[i][j]= p;
        			 result+=arr[i][j];
        			 
        		 }else {
        			 System.out.println("输入数据不符合要求");
        			 System.exit(0);
        		 }
        		
        	 }
        	 if(result%5 == 0) {
        		 if(result/5 ==0) {
        			 System.out.println("-1"); 
        		 }else {
        			 System.out.println(result/5 );
        		 }
        		
        	 }else {
        		 System.out.println("-1");
        	 }
        	 
         }
         
     	
	}

}
