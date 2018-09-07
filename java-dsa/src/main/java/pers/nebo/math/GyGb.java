package pers.nebo.math;
/**
 * 最大公约数最小公倍数
 * @author ningbo
 *
 */
public class GyGb {

    public static void main(String[] args) {
		
	}
	public static int getMaxGy(int a, int b) {
		 
		int gongyue=0;
		if(a<b)  
        {    
            a=a+b;  
            b=a-b;  
            a=a-b;  
        }  
        if(a%b==0)   
        {  
            gongyue = b;  
        }  
        while(a % b>0)  
        {  
            a=a%b;  
            if(a<b)  
            {  
                a=a+b;  
                b=a-b;  
                a=a-b;  
            }  
            if(a%b==0)  
            {  
                gongyue = b;  
            }  
        }  
        return gongyue;  
	}
	
	public static int getMinGb(int a,int b) {
		 return (a*b)/ (getMaxGy(a ,b));
	}
}


