package pers.nebo.exercises.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Q560_SubarraySum {


    /*

            给你一个整数数组 nums 和一个整数 k ，请你统计并返回 该数组中和为 k 的子数组的个数 。
            子数组是数组中元素的连续非空序列。
            示例 1：
            输入：nums = [1,1,1], k = 2
            输出：2

            示例 2：
            输入：nums = [1,2,3], k = 3
            输出：2


            提示：
            1 <= nums.length <= 2 * 104
            -1000 <= nums[i] <= 1000
            -107 <= k <= 107

     */


    /**
     *
      思路1：
        从每个元素开始遍历，这个方法的前缀和优化没有什么作用，后面还是遍历计算的
     */
    public static int subarraySum(int[] nums, int k) {

        int result = 0;
        //countSum[i] 为nums 0--> i的累加和
        int countSum[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i==0){
                countSum[i]=nums[i];
            }else{
                countSum[i]=nums[i]+countSum[i-1];
            }

        }
        //合为k的子数组，则是计算不同差值为k的个数
        for(int i=0;i<countSum.length;i++){
            //计算i开头的 子数组，是否存在合为key.
            for(int j=i;j<countSum.length;j++){
                if(i==0){
                        if(countSum[j]==k){
                            result ++;
                       }
                }else{
                    //从i 到 j的合
                    if((countSum[j]-countSum[i-1])==k){
                        result ++;
                    }
                }
            }
        }
        return  result;
    }

    /**
     *
     思路1：
     从每个元素开始遍历，
     */
    public static int subarraySum1(int[] nums, int k) {

        int result = 0;

        // 每次遍历一个新的nums[i] ,就把这个i当做 开始或者结尾，
        // 1) 当做开始的话： 则需要遍历后面得才知道结果。 需要多次遍历
        // 2）当做结尾： 以为前缀和前面已经知道了， 所以更方便

        int pre = 0;
        Map<Integer,Integer> tmpMap = new HashMap<>();

        // 将 0，添加进去，是兼容遍历的时候，数值本身刚好满足k,即：没有一个前缀时，和为0
        tmpMap.put(0,1);

        //合为k的子数组，则是计算不同差值为k的个数
        for(int i=0;i<nums.length;i++){

            // 因此将前缀和存储在一个map即可
            pre  = pre + nums[i];

            //遍历到一个nums[i] 的时候，判断前面是否存在一个 前缀合+k = pre
            if(tmpMap.containsKey(pre-k)){
                result=result+ tmpMap.get(pre-k);
            }

            tmpMap.put(pre,tmpMap.getOrDefault(pre,0)+1);
        }
        return  result;
    }

    public static void main(String[] args) {
        int [] nums1 = {1,1,1};
        System.out.println(subarraySum1(nums1,2));
    }

}
