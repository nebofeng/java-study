package pers.nebo.exercises.leetcode;

import com.sun.java.swing.plaf.windows.resources.windows;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Q239_MaxSlidingWindow {

    /**
     239. 滑动窗口最大值
     困难
     相关标签
     premium lock icon
     相关企业
     提示
     给你一个整数数组 nums，有一个大小为 k 的滑动窗口从数组的最左侧移动到数组的最右侧。你只可以看到在滑动窗口内的 k 个数字。滑动窗口每次只向右移动一位。

     返回 滑动窗口中的最大值 。



     示例 1：

     输入：nums = [1,3,-1,-3,5,3,6,7], k = 3
     输出：[3,3,5,5,6,7]
     解释：
     滑动窗口的位置                最大值
     ---------------               -----
     [1  3  -1] -3  5  3  6  7       3
     1 [3  -1  -3] 5  3  6  7       3
     1  3 [-1  -3  5] 3  6  7       5
     1  3  -1 [-3  5  3] 6  7       5
     1  3  -1  -3 [5  3  6] 7       6
     1  3  -1  -3  5 [3  6  7]      7
     示例 2：

     输入：nums = [1], k = 1
     输出：[1]


     提示：

     1 <= nums.length <= 105
     -104 <= nums[i] <= 104
     1 <= k <= nums.length



     */
    // 暴力方法超出时间限制
    /*
     * @param nums
     * @param k
     * @return
      */
    public  static  int[] maxSlidingWindow(int[] nums, int k){
        //定义返回结果
        int[] result = new int[nums.length-k+1];
        int max = -Integer.MAX_VALUE;
        int rightIndex = k;
        int[] tmp_windows = new int [k];

        for(int i=0;i<k;i++){
            max = Math.max(max,nums[i]);
            tmp_windows[i] = nums[i];
        }
        result[0]=max;


        for(int i=k;i<nums.length;i++){
            int tmp_max = nums[i];
            for(int j=0; j<k-1;j++ ){
                tmp_windows[j]=tmp_windows[j+1];
                tmp_max  =  Math.max(tmp_windows[j],tmp_max);
            }
            tmp_windows[k-1] = nums[i];

            result[i-k+1] = tmp_max;

        }

        return  result;
    }

    public  static  int []  maxSlidingWindow2(int[] nums,int k){
         int n = nums.length;
        PriorityQueue<int [] > pq  = new PriorityQueue<>(
                new Comparator<int[]>() {
                    @Override
                    public int compare(int[] o1, int[] o2) {

                        return 0;
                    }
                }

        );
        return  new int [0];

    }
    public static void main(String[] args) {

        int [] nums = {1,3,-1,-3,5,3,6,7};
        System.out.println(maxSlidingWindow(nums,3));
    }
}
