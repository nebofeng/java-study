package pers.nebo.exercises.niuke.jianzhiofficer;

public class Fibonacci_sequence {
public static void main(String [] args){
	
	Solution s=new Solution();
	System.out.println("递归==》"+s.Fibonacci(10));
	System.out.println("非递归==》"+s.Fibonacci1(10));
}
	

 
}
//大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。
//
//n<=39
 class Solution {
    public int Fibonacci(int n) {
			if(n==1){
                return 1 ;
            }else if(n==2){
                return 1;
            }else if(n<0){
                return 0;
            }
            else{
               return Fibonacci(n-1)+Fibonacci(n-2);
           }
        
    }
    
    public int Fibonacci1(int n) {
        int a=1,b=1,c=0;
        if(n<0){
            return 0;
        }else if(n==1||n==2){
            return 1;
        }else{
            for (int i=3;i<=n;i++){
                c=a+b;
                b=a;
                a=c;
            }
            return c;
        }
    }
 
    
}


