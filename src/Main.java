import java.util.Scanner;

//import java.util.Scanner;
//public class Main{
//
//  public static void main(String [] args){
//	Scanner sc=new Scanner(System.in);
//      while(sc.hasNextLine()){
//         int n=sc.nextInt();
//         int m=sc.nextInt();
//          double answer=n;
//          double demo=answer;
//
//          for(int i=1;i<m;i++){
//              demo=Math.sqrt(demo);
//              answer+=demo;
//             
//          }
//          System.out.printf("%.2f",answer);
//      }
//  }
//
//
//}

//import java.util.Scanner;
//public class Main{
//	static boolean  flag=false;
//
//  public static void main(String [] args){
//	Scanner sc=new Scanner(System.in);
//      while(sc.hasNextLine()){
//         int n=sc.nextInt();
//         int m=sc.nextInt();
//          if(n<100||m>999){
//             System.out.println("输入值不符合要求。请重新输入！ ");
//          }
//          else{
//          	for(int i=n;i<=m;i++){
//                panduan(i,m);
//
//            }
//          	if(flag==false){
//          		System.out.print("no");
//          	}
//          	System.out.println();
//          
//          }
//
//      }
//  }
//    
//  public static void  panduan(int number,int m){
//    	int demo=number;
//        int count=0;
//       
//       
//        count=(int) (Math.pow(demo/100,3)+Math.pow((demo-demo/100*100)/10,3)+Math.pow(demo%10,3));
//        
//        if(count==number){
//            System.out.print(number+" ");
//             flag=true;
//        }
//        
//    }
//
//
//}

/*import java.util.*;
class Main{
    public static void main(String args[]){
        int m;
        double sum,n;
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            n=sc.nextInt();
            m=sc.nextInt();
            sum=0;
            for(int i=0;i<m;i++){
                sum=sum+n;
                n=Math.sqrt(n);
            }
            System.out.printf("%.2f",sum);
            System.out.println();
        }
    }
}*/


//public class Main{
//	public static void main(String [] args){
//		Scanner sc=new Scanner(System.in);
//		
//		int n=sc.nextInt();
//		
//		
//		        int m=getMax(n);
//				System.out.println(m+"");
//				
//				
//			}
//			
//			
//		
//		
//	
//	 static int getMax(int n){
//		if(n==1){
//        	return 1;
//        }
//		int max=n;
//        int count=1;
//        for(int i=1;i<n;i++){
//        	 count=count*i* getMax(n-i);
//        	//System.out.println(count);
//        	
//            if(count>max){
//               max=count;
//               System.out.println(count);
//
//            }
//            count=1;
//        }
//        return max;
//	}
//	
//}

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {


///*请完成下面这个函数，实现题目要求的功能*/
///*当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^ */
///******************************开始写代码******************************/
//    static int maxProfit(int[] stockPrices, int k) {
//		int count=0;
//    	for(int i=0;i<stockPrices.length;i++ ){
//    		for(int j=i+2;j<stockPrices.length;j++){
//    	    		if(stockPrices[j]-stockPrices[i]>count){
//    				
//    				count=stockPrices[j]-stockPrices[i];
//    				    				
//    			}
//    		}
//        }
//		return count;
//    }
///******************************结束写代码******************************/
//
//
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        int res;
//            
//        int _stockPrices_size = 0;
//        _stockPrices_size = Integer.parseInt(in.nextLine().trim());
//        int[] _stockPrices = new int[_stockPrices_size];
//        int _stockPrices_item;
//        for(int _stockPrices_i = 0; _stockPrices_i < _stockPrices_size; _stockPrices_i++) {
//            _stockPrices_item = Integer.parseInt(in.nextLine().trim());
//            _stockPrices[_stockPrices_i] = _stockPrices_item;
//        }
//        
//        int _k;
//        _k = Integer.parseInt(in.nextLine().trim());
//  
//        res = maxProfit(_stockPrices, _k);
//        System.out.println(String.valueOf(res));    
//
//    }
	public static void main(String [] args){
//		StringBuffer buffer  = new StringBuffer("aabbcc");
//		buffer.reverse();
//		System.out.println(buffer);
//		String str1="hello"; String str2="he"+ new String("llo"); System.err.println(str1==str2); 
	for(int i=0;i<200;i++) {
		System.out.println(i*127%4);
	}
	 
	}
}
