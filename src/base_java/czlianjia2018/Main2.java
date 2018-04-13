package base_java.czlianjia2018;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		 /*
		 *   1 2 3 4 5 6 7 8 9 10 11,  n =11  ,
		 *   找到比离11最近的且比11小的。    13
		 *   x+y > z
		 *   123    5  8  13   21
		 *   1 2 3 4 5 6 7 8 9 10 11 12                    12 -7 
		 *         4   6 7   9 10 11 12  
		 *         
		 *        2   3  5   8
		 *        1   2  4   7
		 *   x-y < z
		 *   z不能为2倍的x y 。 保留最大的数字。
		 *   for（int i）{
		 *   
		 *   }
		 *   1 2 3 4  去掉的是 2        1  3  4 7 
		 *   
		 *   1 2   4 6  10 去掉的是 3  1  2 4 6
		 *   1   3  4  7 
		 *   1 2 3  4 。          4        1  2 3 5
		 */
	 
		if(number<=3){
			System.out.println(0);
		}else {
			
			if(number==4) {
				System.out.println(1);
 		   }else {
	 			int num0=0;
				
	 			
	 			int current = 4;
	 			int next =  7;
	 			for(int j=4;j<=number;j++) {
					if(j<next){
						num0++;
					}else {
						 
						int tmp=next;
						next=current+next;
						current=tmp;
			 		}
 				}
				
	 			int num1=0;
	 			int current1 = 4;
	 			int next1 =  6;
	 			for(int j=4;j<=number;j++) {
					if(j<next1){
						num1++;
					}else {
						 
						int tmp=next1;
						next1=current1+next1;
						current1=tmp;
			 		}
 				}
	 			
	 			int result = Math.min(num1, num0);
	 			int num2=0;
	 			int current2 = 3;
	 			int next2 =  5;
	 			for(int j=4;j<=number;j++) {
					if(j<next2){
						num2++;
					}else {
						 
						int tmp=next2;
						next2=current2+next2;
						current2=tmp;
			 		}
 				}
	 			
	 			result=Math.min(result, num2);
	 			System.out.println(result);
	 			
	 			
//	 			在迷迷糊糊的大草原上，小红捡到了n根木棍，第i根木棍的长度为i，小红现在很开心。
//
//	 			她想选出其中的三根木棍组成美丽的三角形。
//
//	 			但是小明想捉弄小红，想去掉一些木棍，使得小红任意选三根木棍都不能组成三角形。
//
//	 			请问小明最少去掉多少根木棍呢
			 
	 		}
	 	 }
		
	}

}
