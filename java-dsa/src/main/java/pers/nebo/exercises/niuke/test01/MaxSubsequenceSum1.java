
package pers.nebo.exercises.niuke.test01;

import java.util.Scanner;

/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年3月16日 下午4:34:53
* 类说明
*/
public class MaxSubsequenceSum1 {
	public  int get(int [] array){
		int max=array[0]; 
		for(int i=0;i<array.length;i++){
			for(int j=i;j<array.length;j++){
				int thisnum=0;
				for(int k=i;k<=j;k++){
					thisnum+=array[k];
					
				}
				
				int max1=thisnum;
				if(thisnum>max1){
					max=thisnum;
				}else{
					max=max1;
				}
				
				
			}
		}
		return max;
	}
	
	
	public  int get2(int [] array){
		int max=array[0]; 
		for(int i=0;i<array.length;i++){
			
				int thisnum=0;
				for(int k=i;k<array.length;k++){
					thisnum+=array[k];
					if(thisnum>max){
						max=thisnum;
					}
				}							
		}
		return max;
	}
	
	
	
	public int get3(int[] array){
		int max=array[0];
		int thisnum=0;
		for(int i=0;i<array.length;i++){
			thisnum+=array[i];
			if(thisnum>max){
				max=thisnum;
			}
			if(thisnum<0){
				thisnum=0;
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String str = sc.nextLine();//
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入数组个数");
		int num=sc.nextInt();
		int [] array=new int[num];
		for(int i=0;i<array.length;i++){
			System.out.println("请输入第"+i+"个元素");
			array[i]=sc.nextInt();
		}
		MaxSubsequenceSum1 me=new MaxSubsequenceSum1();
		System.out.println(""+me.get2(array));
	}
}
