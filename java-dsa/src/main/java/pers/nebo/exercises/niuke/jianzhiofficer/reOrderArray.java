package pers.nebo.exercises.niuke.jianzhiofficer;

public class reOrderArray {
	public static void main(String[] args) {
		SolutionreOrderArray s=new SolutionreOrderArray();
		int [] demo=new int[]{1,2,3,4,5,6,7};
		s.reOrderArray(demo);
	}
}
/*
 * 1234567
 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
 所有的偶数位于位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。 
 */
class SolutionreOrderArray{
      public void reOrderArray(int [] array) {
    	 for(int i=0;i<array.length;i++){
    		   if(array[i]%2==1){
    			   int demo=array[i];
    			   System.out.println("奇数位置："+i);
    			   for(int j=0;j<i;j++){
    				   if(array[j]%2==0){
    					   System.out.println("数位置："+j);
   				         
   				        	 for(int k=j;k<i;i--){
   				        		 array[i]=array[i-1];
   				        	 }   				    	
   				       array[j]=demo;
   				       break;
   				       }	
    			   }
    		   }   		
    	} 
    	 for(int i=0;i<array.length;i++){
    		 System.out.print(array[i]);
    	 }	 
     }     
}

