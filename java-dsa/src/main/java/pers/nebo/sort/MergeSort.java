package pers.nebo.sort;

import java.util.Arrays;

/**
 * 归并排序实现类
 * @author ningbo
 *归并排序思路：
 *  分而治之
 *  将一个数组（序列） 分割为 若干个序列对待
 *   12438765
 *   1243 8765
 *   12 43  87 65
 *  1 2 4 3 8 7 6 5 分
 *   12 34  78  56  合
 *   1234   5678
 *     12345678
 *  将logn 个序列进行合并
 *  等同于  两个有序序列合为一个序列的递归实现（只是坐标变化） 
 *
 *
 */
public class MergeSort {
	
	public static void main(String[] args) {
		int arr[] = {345,678,86,54,5,6,78,96,54,3,23,4,5,67};
		int tmp[]= new int[arr.length];
		sort( 0, arr.length-1,arr,tmp);

		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void sort(int low ,int high,  int arr[] ,int tmp[]) {
		 
		if(low<high) {
			int mid=(low+high)/2;    
			sort( low,mid,  arr,tmp);
			sort( mid+1,high  ,arr,tmp);
			merge(low,high,mid,arr,tmp);
			
			
		}
		
		
	}
	public static void merge (int left,int high ,int mid,int arr[],int tmp[]) {
		int low=left ;
		 
		int middle = mid+1;
		int t=0;
		while(low<=mid && middle<=high) {
			if(arr[low]<=arr[middle]) {
				tmp[t++]=arr[low++];
			}else {
				tmp[t++]=arr[middle++];
			}			
		}
		while(low<=mid) {
			tmp[t++]=arr[low++];
		}
		
		while(middle<=high) {
			tmp[t++]=arr[middle++];
			
		}
 		 t=0;
 		while(left<=high) {
 		 System.out.println(low+"====="+high);
 			 arr[left++] = tmp[t++];
 			System.out.println(Arrays.toString(arr));
 		}
		
	}
	
	
	
	
	
	

}
