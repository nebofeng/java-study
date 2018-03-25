package data_structure.search;

/**
 * 
 * @author *** nebo
 * @date   *** 2018年3月13日
 * @email  *** nebofeng@gmail.com
 * @des    *** 查找第n大的数(前k大的数。)
 */
public class SearchN {
	public static void main(String[] args) {
		int k=4;
		int arr[] = {1,3,2,4,6};
		System.out.println(find(arr,0,arr.length-1,k));
		
		for(int j= arr.length-1;j>arr.length-k;j--){
			System.out.println(arr[j]);
		}
		
	}
	
	
	
	
	
	                                      //0                       5
	public static int find(int arr[] ,int low ,int high ,int n) {
		int right =high;
		int left=low;
		if(low==high) {
			return arr[low];
		}
		if(low<high) {
		    int pov=arr[low];
		    //0                       5
			while(low<high) {
				while(pov<arr[high]&&low<high) {
					high--;
				 
				}
				arr[low]=arr[high];
				arr[high]=pov;
				while(arr[low]<pov&&low<high) {
					low++;
				}
				arr[high]=arr[low];
				arr[low]=pov;								 
	 		}
				if(arr.length-low ==n) {
				return pov;
			}else if(arr.length-low>n){
				System.out.println(high+"==="+right);
				return find(arr,low+1,right,n);
			}else {
				return find(arr,0,low-1,n);
			}
		 	
			
		}
		return 0;
		
		
		 
	}
	
	

}
