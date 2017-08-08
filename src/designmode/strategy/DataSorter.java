
package designmode.strategy;
/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年3月8日 下午8:03:08
* 类说明
*/
public class DataSorter {

	/** 
	 * @Title: sort 
	 * @Description: TODO
	 * @return: void
	 */
	public static void sort(int[] a) {
		for(int i=0;i<a.length-1;i++){
			for(int j=0;j<a.length-1-i;j++){
				if(a[j]>a[j+1]){
					int max=a[j];
					a[j]=a[j+1];
					a[j+1]=max;
					
					
				}
				
			}
		}
		
	}
	
	
	static void quick_sort(int a[],int low,int high){
		if(low<high){
			int par=getMiddle( a,  low,  high) ;
			quick_sort( a , par+1, high);
			quick_sort( a , 0, par-1);
			
		}
//		int middle=getMiddle(a,low,high);
//		quick_sort(a ,middle+1,high);
//		
//		quick_sort(a,0,middle-1);
		
		
	}

	/** 
	 * @Title: getMiddle 
	 * @Description: TODO
	 * @return: int
	 */
	private static int getMiddle(int[] a, int low, int high) {
//		int privotKey = a[low];                             //基准元素  
//	     while(low < high){       
//	    	 //从表的两端交替地向中间扫描  
//	        while(low<high&&a[high]>=privotKey){
//	        	high--;
//	        }
//	        a[low]=a[high];
//	        a[high]=privotKey;
//	        while(low<high&&a[low]<=privotKey){
//	        	low++;	        	
//	        }
//	        a[high]=a[low];
//	        a[low]=privotKey;
//	     }  
//	     
//	     return low;  
		
		
		int middle=low;
		while(low<high){
			
			while(a[low]<a[high]&&high>low){
				high--;
			}
			
			int tmp=a[high];
			a[high]=a[middle];
			a[middle]=tmp;
			middle=high;
			System.out.println(middle);
			
			while(a[low]<tmp&&low<high){
				low++;
			}
			tmp=a[low];
			a[low]=a[middle];
			a[middle]=tmp;
			middle=low;
			System.out.println(middle);

			
		}
		return middle;
	}


	/** 
	 * @Title: p 
	 * @Description: TODO
	 * @return: void
	 */
	public static void p(int[] a) {
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
}
