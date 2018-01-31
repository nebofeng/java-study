package data_structure.sort;

public class SelectSort {
	
	public static void main(String[] args) {
		int[] arr= { 0,1,1,3,4, 5,9,8,5};
		selectsort(arr);
		for(int i= 0;i<arr.length ;i++) {
			System.out.println(arr[i]);
		}
//		for(int arrs: arr) {
//			System.out.println(arr);
//		}
	}
	public static void selectsort(int arr[]) {
		//  0      8
		for(int i=0;i<arr.length-1;i++) {
		     int tmp=0;
		     int max=arr[0];
		     
			for(int j=1;j<arr.length-i;j++) {				 
				if(max<arr[j]) {
					 max=arr[j];
					 tmp=j;
				 }
		 		 
			}
 			//System.out.println(i);
 	 		arr[tmp]=arr[arr.length-1-i];
//			System.out.println(tmp+"==========");
 			arr[arr.length-1-i]=max;
//			System.out.println(arr.length-1-i);
 			//System.out.println(max+"====");
//		    System.err.println(max+"error============");
			
			
		}
		
		
	}

	
}
