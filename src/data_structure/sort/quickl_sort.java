package data_structure.sort;
/**
 * 快速排序的思想：
 * 
 *  未知序列的数字 例如   5526487646
 *  首先以第一个数为基准  比它小的放在前面，比它大的放在后面
 *  244  5  568766
 *  前面后面 分别再次调用该思想，
 *  
 *  显而易见：实现方法有两种：递归与非递归
 *  
 *  
 *  递归：
 *  首先以第一个为基准
 *  从最后面往前遍历 ，找到比第一个小的数字，交换这个两个数，这时，基准数跑到后面；并且基准数后面的数字都比基准数大
 *  
 *  然后 从前往后遍历 ，找到第一个比基准数大的数，交换这两个数字，这时基准数跑到前面，并且基准数前面的数字都比它小。
 *  
 *  
 *  快速排序的最坏情况是看 枢纽（pivot）的选择策略，在快速排序的早期版本中 最左面或者是最右面的那个元素被选为枢轴，那最坏的情况就会在下面的情况下发生啦：

     1）数组已经是正序（same order）排过序的。 
     2）数组已经是倒序排过序的。 
     3）所有的元素都相同（1、2的特殊情况）
 * @ClassName: quickl_sort 
 * @Description: TODO
 * @author: ningbo
 * @date: 2016年11月22日 下午2:06:16
 */
public class quickl_sort {
	//递归实现
	static void sort(int a[] ,int low,int high){		
		if(low<high){
			int par=partition( a,  low,  high) ;
			sort( a , par+1, high);
			sort( a , 0, par-1);
			
		}		
	}
	
	 static int partition(int a[], int low, int high)  
	 {  
	     int privotKey = a[low];      //基准元素  
	     while(low < high){       
	    	 //从表的两端交替地向中间扫描  
	        while(low<high&&a[high]>=privotKey){
	        	high--;
	        }
	        a[low]=a[high];
	        a[high]=privotKey;
	        while(low<high&&a[low]<=privotKey){
	        	low++;	        	
	        }
	        a[high]=a[low];
	        a[low]=privotKey;
	     }  
	     
	     return low;  
	 } 
	 
	 
	 

	public static void main(String[] args) {
		int b[]={16,3,5,2,8,7,56,12,4,22};
		for(int i=0;i<b.length;i++){
			System.out.println(b[i]);
		}
		sort(b,0,9);
		for(int i=0;i<b.length;i++){
			System.out.println(b[i]);
		} 
	
	
	}
}



