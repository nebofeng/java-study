
package leetcode;
/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年3月16日 下午6:10:00
* 类说明
*/
public class RotateArray {
	public void reverse(int [] array,int start,int end){
		if(array==null||array.length<1){
			return;
		}
		for(int i=start,j=end;i<j;i++,j--){
			swap(array,i,j);
		}
	}

	
	private void swap(int[] array, int i, int j) {
		int temp=array[i];
		array[i]=array[j];
		array[j]=temp;		
	}
	
	public void rotate(int[] array ,int k){
		if(k==0){
			return;
		}
		int n=array.length;
		if(k>n){
			k=k%n;
		}
		reverse(array,0,n-k-1);
		reverse(array,n-k,n-1);
		reverse(array,0,n-1);
		
	}
}
