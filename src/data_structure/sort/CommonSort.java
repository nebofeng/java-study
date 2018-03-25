package data_structure.sort;
/**
 * 学习排序算法的公共类
 * @author NeboFeng
 *
 */
public class CommonSort {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,8,9,7,6};
		BinarySort(arr);
		for(int i=0;i<arr.length;++i) {
			System.out.println(i+"===");
			System.out.println(arr[i]);
		}
	}
	
	/**
	 * 
	 * @param arr
	 */
	public static void  BubbleSort(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=1;j<arr.length-i; j++) {
				if(arr[j]<arr[j-1]) {
					int tmp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=tmp;					
				}
			}
		}
	}
	/**
	 * 分析：与上一种冒泡相比，在于更加灵活的获取了排序的次数。
	 * 上一种是无论序列是否有序。都需要排序
	 * 这一种是只对可能无序的元素排序
	 * @param arr o()
	 */
	public static void BubbleSort_1(int arr[]) {
		int i = arr.length-1;
		while(i>0) {
			int pos=0;
			for(int j=0;j<i;j++) {
				if(arr[j]>arr[j+1]) {
					pos=j;
					int tmp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}
			}
			i= pos;		 
		}
		 
	}
	/**
	 * 冒泡 双向遍历 
	 * @param arr
	 */
	public static void BubbleSort_2(int arr[]) {
		int low=0,high=arr.length-1;
	    int j,tmp;
		while(high>low) {
	    	
	    	for( j=low;j<high;j++) {
	    		if(arr[j]>arr[j+1]) {
	    			tmp=arr[j];
	    			arr[j]=arr[j+1];
	    			arr[j+1]=tmp;
	    		}
	    	}
	    	high--;
	    	for(j=high;j>low;j--) {
	    		if(arr[j]<arr[j-1]) {
	    			tmp=arr[j];
	    			arr[j]=arr[j-1];
	    			arr[j-1]=tmp;
	    		}
	    	}
	    	low++;
	    }	
 	}
	
	public static void SelectSort() {
		
	}
	
	/**
	 * 
	 * @param arr
	 * @dec： 直接插入的思想是： 从第二个开始与第一个相比。  
	 * 后面每次发现比前面的小的话。就需要将前面（有序）的序列倒序遍历一遍。
	 * 等到不需要再（连续移动）排序（TODO: 可以记录标识位置。然后插入标识位）
	 */
	public static void InsertSort(int arr[]) {
		if(arr==null) {
			System.out.println("cannot be null");
		}
		if(arr.length<=0) {
			System.out.println("illegal length");
		}
		int low =1;
		int high =arr.length;
		if(low<high) {//insert sort should  at last 2 elments 			 
	 		for(int i = low;i<high;i++) {
 				if(arr[i]<arr[i-1]) {	
 					 
					for(int j=i;arr[j]<arr[j-1] && j>0;j--) {
						 if(arr[j]<arr[j-1]) {
							int tmp=arr[j];
							arr[j]=arr[j-1];
							arr[j-1]=tmp;						
						 }else {
							 //如果没有继续排序就说明不需要再排序。可以跳出for循环。
							break;
						 }
					}					
				}
 			}			 	 		
		}
 	}
	
	/**
	 * 
	 * @param arr
	 * @des 可以再插入的时候记录标识位。
	 */
	public static void InsertSort1(int arr[]) {
		if(arr==null) {
			System.out.println("cannot be null");
		}
		if(arr.length<=0) {
			System.out.println("illegal length");
		}
		int low =1;
		int high =arr.length;
		if(low<high) {//insert sort should  at last 2 elments 			 
	 		for(int i = low;i<high;i++) {
 				if(arr[i]<arr[i-1]) {
 					int position= i;
 					int temp = arr[i] ;
 					
 					//先记录标识位，后面直接根据标识位移动
					for(int j=i;temp<arr[j-1] && j>0;j--) {
						 if(temp<arr[j-1]) {
							 position = j-1;							 										 
						 }else {
							 break;
						 }
					}	
					
					for(int k=i;k>=position;k--) {
					 
						if(k!=position) {							 
							arr[k]=arr[k-1];
						}else {
							arr[k]=temp;
						}
						
					}
					
				}
 			}			 	 		
		}
 	}
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * 
	 * @param arr
	 * @des 二分插入排序:思想  对于 0,1,...  n-1个已经有序的序列。第n个数字的摆放位置，通过二分查找的方式来计算。
	 *  o（n）= n*
	 */
	public static void BinarySort(int arr[]) {
		if(arr==null) {
			System.out.println("cannot be null");
		}
		if(arr.length<=0) {
			System.out.println("illegal length");
		}
		
		int low = 1;
		int high= arr.length;				
		if(low<high) {			
			for(int i=low; i<high;i++) {
				 int position,tmp;
				  if(arr[i]<arr[i-1]) {					
					tmp=arr[i];				 
					position = binaryGetSearch(arr,tmp,i);					
					for( int j= i; j>=position; j--) {
						if(j!=position) {
							arr[j]=arr[j-1];							
						}else {
							arr[j]=tmp;
						}						
					}  					 
				}
			}		 
		}
		 
	}

	
	
	
	
	/**
	 * 
	 * @param arr
	 * @param target
	 * @return position  that the target should be
	 * positon : default positon  
	 * 二分查找 最后的high 与 low 会相同 。 low坐标 位 第一个大于 或者等于  taget值的数组元素坐标 。
	 * 每次判断之后  high 是 target大的数字前一位减一          最后   arr[high]>= target
	 *             low 是 target小于 或者等于的数字 +1 . 最后  arr[low]>=target 
	 *             所以到最后 low >=  high 
	 *     （当二分查找的时候 两端一直逼近 target，最后 若存在 则两个 low high 会指向同一个 element low = high
	 *      如果不存在 则 low》high ）         
	 *              
	 *              
	 */
	private static int binaryGetSearch(int arr[] ,int target,int position) {
		int low = 0;
		int high=position;
		int mid; 
		while(low<=high) {
			
			mid = (low+high)/2;
			if(target<arr[mid]) {
				high=mid-1;
			}else {
				low=mid+1;
			}	 		
		}		 
		return low ;
	 	 
	}

}
