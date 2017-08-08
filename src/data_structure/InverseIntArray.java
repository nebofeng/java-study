
package data_structure;

import org.junit.Test;

/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年3月15日 下午9:44:15
* 类说明
*/
public class InverseIntArray {
	public void swap(int[] array,int a,int b){
		int t=array[b];
		array[b]=array[a];
		array[a]=t;
	}
	
	public void printArray(int [] array){
		for(int i:array){
			System.out.println(i);
		}
	}
	
	public void inverse01(int[] array){
		if(array==null||array.length<=1){
			return ;
		}
		for(int i=0,j=array.length-1;i<j;i++,j--){
			swap(array,i,j);
		}
	}
	
	@Test
	public void test01(){
		int [] array1={1,2,3,4,5,6,7};
		printArray(array1);
		inverse01(array1);
		printArray(array1);
	}
}
