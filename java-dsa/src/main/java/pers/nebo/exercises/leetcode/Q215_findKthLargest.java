package pers.nebo.exercises.leetcode;

public class Q215_findKthLargest {


    /**
     *
     * 返回start 这个应该在哪个位置
     * @param nums
     * @param start
     * @param end
     * @return
     */
    public int  quickSelect(int[]  nums, int start,int end){

         int tmpPartiton  = nums[end];

         int j = start;

         //将tmpPartition 放到她该
         for(int i = start;i<end-1;i++){
            //如果比tmpPartition 大，则放到前面
             if(nums[i]>tmpPartiton){
                swap(nums,i,j);
                j++;
             }

         }

         swap(nums,end,j);

         return  j;



    }

    /**
     * swap a  b
     * @param nums
     * @param i
     * @param j
     */
    public void swap(int[] nums ,int i,int j){

        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    /**
     *
     * @param nums
     * @param start
     * @param end
     * @param topN
     * @return
     */
    public int getKth(int[] nums, int start,int end,  int topN){

        int length = nums.length;
        int partion  = quickSelect(nums, start ,end);

           // 1 2 3 4
        int index = length-topN+1;
        if(partion==index){
            return  nums[partion];

         //如果 partion 比需求的位置大，则说明需求的位置在左侧
        } else if (partion>index) {

            return  getKth(nums, start,partion-1,topN);
        } else{

            return  getKth(nums, partion+1,end,topN);
        }



    }



    public static  void main(String[] args){



    }
}
