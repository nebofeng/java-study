package pers.nebo.exercises.leetcode;

public class Q53_MaxSubArray {

/*

测试用例
测试用例
测试结果
代码
53. 最大子数组和
中等
相关标签
premium lock icon
相关企业
给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。

子数组是数组中的一个连续部分。



示例 1：

输入：nums = [-2,1,-3,4,-1,2,1,-5,4]
输出：6
解释：连续子数组 [4,-1,2,1] 的和最大，为 6 。
示例 2：

输入：nums = [1]
输出：1
示例 3：

输入：nums = [5,4,-1,7,8]
输出：23


提示：

1 <= nums.length <= 105
-104 <= nums[i] <= 104


进阶：如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的 分治法 求解
*

*/


    public static int maxSubArray(int[] nums){
        int result = nums[0];
        int[] count = new int[nums.length];
        count[0] = nums[0];
        // 首先定义一个前缀和的数组 count[i] = count[i-1] + nums[i]
        for(int i=1;i<nums.length;i++){
            count[i] = count[i-1] + nums[i];
        }

        // 然后遍历nums, 到每一个索引i 时，计算以i结尾的子数组最大值
        // i 结尾对应的子数组最大值，等于 count[i] - 前面的最小值(也包含0，count[i] 本身)
        int curMax = count[0];
        int preMin =  0;

        for(int i=0;i<count.length;i++){
            //计算出以i结尾的当前的最大值
            curMax = Math.max(count[i]-preMin,curMax);
            preMin = Math.min(count[i],preMin);
        }

        // 最大的pre则为最大的和
        result = curMax;
        return  result;
    }


    /*
    思路2: 先定义最大子数组和的公式： 遍历nums的时候，新的索引i,以i结尾的最大子数合定义为 f(i)
    则有 f(i) =  math.max(num, f(i-1)+ nums[i])
    因此需要每一个i都需要比较并存储  f(i)
    */
    public static int maxSubArray1(int[] nums){

        int max = nums[0];
        //定义当前最大的f(i)
        int pre = 0;
        for(int num:nums){
            // 获取当前i 结尾的子数组的最大值。
            pre=Math.max(pre+num,num);
            // 更新全局的最大值
            max=Math.max(max,pre);

        }
        return  max;
    }
    public static void main(String[] args) {

//        int [] nums = {-2,1,-3,4,-1,2,1,-5,4};
//        System.out.println(maxSubArray(nums));
        int [] nums1 = {-1};
        System.out.println(maxSubArray(nums1));

    }
}
