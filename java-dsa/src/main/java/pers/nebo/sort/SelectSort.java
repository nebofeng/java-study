package pers.nebo.sort;

import java.util.Arrays;

/**
 * 选择排序
 * 
 * @author ningbo
 * 
 *         直接选择排序 时间
 *
 */
public class SelectSort {

	public static void main(String[] args) {
		int[] arr = { 0, 1, 1, 3, 0, 4, 5, 9, 8, 5 };
		selectsort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		int[] arr1 = { 0, 1, 1, 3, 4, 5, 9, 8, 5 };
		heapSort(arr1);
		System.out.println(Arrays.toString(arr1));

	}

	/**
	 * 选择排序与冒泡排序的区别在于冒泡比较之后直接交换，但是选择是等到最后才进行交换
	 * 
	 * @param arr
	 */
	public static void selectsort(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			int tmp = 0;
			int max = arr[0];

			for (int j = 1; j < arr.length - i; j++) {
				if (max < arr[j]) {
					max = arr[j];
					tmp = j;
				}

			}
			arr[tmp] = arr[arr.length - 1 - i];

			arr[arr.length - 1 - i] = max;
		}

	}

	/**
	 * 堆排序
	 * 
	 * @param arr1
	 * 
	 * 
	 *            由堆性质： 父节点的索引 *2 +1 = 左节点 。 父节点的索引 *2 +2 = 右边节点 。
	 * 
	 *            所以 -》 最后一个叶子节点的索引值是n-1，它的父节点索引值是[(n-1)-1]/2 = n/2 -1
	 * 
	 */

	public static void heapSort(int arr[]) {
		// 构建大顶堆
		// 从倒数第一个非叶子节点 开始调整结构
		for (int i = arr.length / 2 - 1; i >= 0; i--) {
			adjustHeap(arr, i, arr.length);
		}

		// 调整堆结构
		for (int j = arr.length - 1; j > 0; j--) {
			swap(arr, 0, j);
			adjustHeap(arr, 0, j);
		}

	}

	public static void adjustHeap(int arr[], int i, int len) {

		int tmp = arr[i];// 先取出当前元素
		int p = 0;
		for (int k = i * 2 + 1; k < len; k = k * 2 + 1) {
			if (k + 1 < len && arr[k] < arr[k + 1]) {
				k++;
			}
			if (arr[k] > tmp) {// 如果子节点大于父节点，将子节点的值赋给父节点，不用交换： 最后将tmp赋值就可以，类似于数组移动复制
				arr[i] = arr[k];
				i = k;
			} else {
				break;
			}

		}
		arr[i] = tmp;

	}

	public static void swap(int[] arr, int a, int b) {
		int tmp = arr[a];
		arr[a] = arr[b];
		arr[b] = tmp;
	}

}
