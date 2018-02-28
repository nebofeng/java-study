package data_structure.sort;

import java.util.Arrays;

/**
 * 基数排序/桶排序
 * 
 * @author ningbo
 *  
 */
public class RadixSort {
	     
	  /**
	   * 
	   * @param  arr 需要排序的数组 
	   * @param  bit 需要排序的数组最大数的位数
	   */
	  private static void  sortCore1(int arr[] ,int bit) {
		 		   
		  int m=1;
		  int b =1;
		  int k =0;
		//构建二维数组，放置数据
		  int tmp[][] = new int[10][arr.length];
		  //构建一维数组， 放置不同‘桶’ 数字的个数
		  int intNumber[] = new int[10];
		  //从低位开始向高位
		  
		  while(m<=bit){
		 	  for(int i=0;i<arr.length;i++) {
				  int lsd = (arr[i]/b)% 10 ;
				  tmp [lsd][intNumber[lsd]] =arr[i];
				  intNumber[lsd]++;
				 
			  }
			  for(int j=0;j<10;j++){
				  if(intNumber[j]!=0) {
					  for(int i=0;i<intNumber[j];i++) {						 
						  arr[k++]=tmp[j][i];  						  
					  }
					  intNumber[j]=0;
		 		  }
			  }
			  b=b*10;
			  k=0;
			  m++;			  
		  }
	 	  
	  }
	  /**
	   * 计数排序： 辅助数组的大小取决于原数组的值的范围
	   *  适合值类密集排序	  
	   * @param arr
	   */
	  private static void countSort(int  arr[]) {
		  int max = Integer.MIN_VALUE;
		  int min = Integer.MAX_VALUE;
		  int index = 0;
		  for(int i=0;i<arr.length;i++) {
			  max = Math.max(max, arr[i]);
			  min = Math.min(min, arr[i]);
			  
		  }
		  int help[] = new int[max-min+1];
		  
		  for(int i=0;i<arr.length;i++) {
			  int pos=arr[i]-min ;
		 
			  help[pos]++;
					  
		  }
		  
		  for(int i=0;i<help.length;i++) {
			  while(help[i]-- > 0) {
				  arr[index++] = min+i;
			  }
		  }
		  
		  
		  
		  
	  }
	  
	  
	  
	  
	  public static void main(String[] args) {
		//int arr[]= {34,58,7,656,07222222,06845,0679};
		 int arr[]= {34,58,7,656, 97222222, 6845, 679};
		 int arr1[]= {12,3,4,8,7,43,0,9,8,6,28,28,5,12};
		 countSort(arr1);
	//	 sortCore1(arr,7);
		// System.out.println(Arrays.toString(arr));
		 System.out.println(Arrays.toString(arr1));

		 
		// int age =  800;

	}
	
	
	
	     
}
