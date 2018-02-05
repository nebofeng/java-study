package data_structure.search;

 
/**
 * 常规查找算法的类
 * @author NeboFeng
 *
 */
public class CommonSearch {
	public static void main(String[] args) {
		
		
		
	}
	
	 
	/**
	 * 
	 * @param arr 有序数组
	 * @param target 查找值
	 * @return   找到就返回坐标位置，找不到就返回最小值。
	 * @throws Exception
	 * @dec 二分查找的非递归算法 ，
	 * 时间复杂度： o log（n）   n  n/2  n/4  假设 k次找到 。 n/(2的k次方) 即 2的k次方=n 所以k= logn
	 * 
	 */
	public static int  binarySearch(int arr[], int target) throws Exception {	    
		if(arr==null) {
			throw new Exception("ARR IS NULL");
		}
		if(arr.length<=0) {
			throw new Exception("length  is illegal");
		}
		int low = 0;
		int high = arr.length-1;
		
		while(low<=high) {
			if(target==arr[(low+high)/2]) {
				return (low+high)/2;
			}else if(target>arr[(low+high)/2]) {
				low = (low+high)/2 +1 ;
				
			}else {
				high = (low+high)/2 -1;
			}
		}
		 return Integer.MIN_VALUE;  	 		
	}
	
	

}
