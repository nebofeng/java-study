
package pers.nebo.exercises.niuke.test01;

import java.util.Scanner;

/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年3月17日 下午3:52:25
* 类说明
*/
public class Fish {
	
	//暴力求解，遍历
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入 鱼尺寸的范围");
		int min=sc.nextInt();
		int max=sc.nextInt();
		System.out.println("输入已经有鱼的数量");
		int num=sc.nextInt();
		System.out.println("输入存在鱼的尺寸");
		int[] fish=new int[num];
		for(int i=0;i<fish.length;i++){
			fish[i]=sc.nextInt();
		}
		quick_sort(fish,0,fish.length-1);
		int count=0;
		int temp=fish[0];
		int demo=min;
		while((demo<=temp/10||demo>temp/2)){
			
		}
		
		
		
		
		
		
	}

	/** 
	 * @Title: quick_sort 
	 * @Description: TODO
	 * @return: void
	 */
	private static void quick_sort(int[] fish,int low,int high) {
		
		int middle=getMiddle(fish,0,fish.length-1);
		quick_sort(fish,0,middle);
		quick_sort(fish,middle+1,fish.length-1);
		
	}
	
	public static int getMiddle(int [] array,int low ,int high){
		int middleKey=array[low];
		while(low<high){
			while(array[high]>=middleKey&&low<high){
				high--;
			}
			array[low]=array[high];
			array[high]=middleKey;
			while(array[low]<=middleKey&&low<high){
				low++;
			}
			array[high]=array[low];
			array[low]=middleKey;
			
		}
		return low;
	}
	
//	
//	#include<iostream>
//	using namespace std;
//
//	int main(){
//	    int minSize,maxSize,n;
//	    cin>>minSize>>maxSize>>n;
//	    int fishSize[n];
//	    for(int i=0;i<n;i++)
//	        cin>>fishSize[i];
//	    int res=0;
//	    for(int k=minSize;k<=maxSize;k++){
//	        bool flag=true;
//	        for(int i=0;i<n;i++){
//	            if(k>=fishSize[i]*2 && k<=fishSize[i]*10){
//	                flag=false;
//	                break;
//	            }
//	            if(fishSize[i]<=k*10 && fishSize[i]>=k*2){
//	                flag=false;
//	                break;
//	            }
//	            if(fishSize[i]>=k*2 && fishSize[i]<=k*10){
//	                flag=false;
//	                break;
//	            }
//	            if(k<=fishSize[i]*10 && k>=fishSize[i]*2){
//	                flag=false;
//	                break;
//	            }
//	        }
//	        if(flag==true)
//	            res++;
//	    }
//	    cout<<res<<endl;
//	    return 0;
//	}
	
}
