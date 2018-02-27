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
						 System.out.println("==k"+k+"j======="+j+"i=="+i);
						  arr[k++]=tmp[j][i];  
						  System.out.println("==========");
					  }
					  intNumber[j]=0;
		 		  }
			  }
			  b=b*10;
			  k=0;
			  m++;
			  
		  }
	 	  
	  }
	  
	  
	  public static void main(String[] args) {
		//int arr[]= {34,58,7,656,07222222,06845,0679};
		 int arr[]= {34,58,7,656, 97222222, 6845, 679};
		 sortCore1(arr,7);
		 System.out.println(Arrays.toString(arr));
		 int age =  800;

	}
	
	
	
	     
}
