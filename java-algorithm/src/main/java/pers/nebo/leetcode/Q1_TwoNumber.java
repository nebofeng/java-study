
package pers.nebo.leetcode;


/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年3月16日 下午6:23:43
* 类说明
*/
public class Q1_TwoNumber {
	//n的方
	public void twonumber(int[] array,int s){
		for(int i=0;i<array.length;i++){
			for(int j=i+1;j<array.length;j++){
				if(array[i]+array[j]==s){
					System.out.println(array[i]+"||"+array[j]);
					System.out.println(""+s);
					break;
				}
			}
		}
	}
	
	//n
	
	
	public void twonumber2(int[] array,int s){
		int i=0,j=array.length-1;
		while(i<j){
			int sum=array[i]+array[j];
			if(s==sum){
				System.out.println(array[i]+"||"+array[j]);

				i++;
				j--;
			}else if(s>sum){
				i++;
			}else {
				j--;
			}
		}
	}
	
	//用到二分查找 nlog（n）
	public void twonumber3(){
		
	}
	

}
