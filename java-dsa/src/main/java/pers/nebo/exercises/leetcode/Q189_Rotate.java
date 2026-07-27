package pers.nebo.exercises.leetcode;

/**

 给定一个整数数组 nums，将数组中的元素向右轮转 k 个位置，其中 k 是非负数。



 示例 1:

 输入: nums = [1,2,3,4,5,6,7], k = 3
 输出: [5,6,7,1,2,3,4]
 解释:
 向右轮转 1 步: [7,1,2,3,4,5,6]
 向右轮转 2 步: [6,7,1,2,3,4,5]
 向右轮转 3 步: [5,6,7,1,2,3,4]
 示例 2:

 输入：nums = [-1,-100,3,99], k = 2
 输出：[3,99,-1,-100]
 解释:
 向右轮转 1 步: [99,-1,-100,3]
 向右轮转 2 步: [3,99,-1,-100]


 提示：

 1 <= nums.length <= 105
 -231 <= nums[i] <= 231 - 1
 0 <= k <= 105
 */
public class Q189_Rotate {

    public  void rorate(int[] nums,int k){
        int[] rorate = new int[nums.length];
        for(int i=0;i<rorate.length;i++){
            rorate[(i+k)%nums.length] =nums[i];
        }
        System.arraycopy(rorate,0,nums,0,nums.length);

    }
}
