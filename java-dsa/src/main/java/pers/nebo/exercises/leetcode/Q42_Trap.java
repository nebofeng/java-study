package pers.nebo.exercises.leetcode;

public class Q42_Trap {
/*

https://leetcode.cn/problems/trapping-rain-water/description/?envType=study-plan-v2&envId=top-100-liked
* 给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。



示例 1：



输入：height = [0,1,0,2,1,0,1,3,2,1,2,1]
输出：6
解释：上面是由数组 [0,1,0,2,1,0,1,3,2,1,2,1] 表示的高度图，在这种情况下，可以接 6 个单位的雨水（蓝色部分表示雨水）。
示例 2：

输入：height = [4,2,0,3,2,5]
输出：9


提示：

n == height.length
1 <= n <= 2 * 104
0 <= height[i] <= 105
*
* */
    public static  int trap(int[] height) {

        int sum = 0;
        // 第一步： 从i+1 开始，遍历到 len-1
        for(int i=1;i<height.length-1;i++){

            int max_left = 0;
            int max_right = 0;
            for(int j=0;j<i;j++){
                //左侧需要比它高，

                max_left = Math.max(max_left,height[j]);
            }
            // 每个位置，都看左右是否有比它大的值，如果有，则计算
            for(int j= i+1; j<height.length;j++){

                max_right = Math.max(max_right,height[j]);
            }

            if (max_right > height[i] && max_left > height[i]){

                sum = sum + Math.min(max_right , max_left)-height[i];
            }

        }

        return sum;

    }



    public static  int trap2(int[] height) {

        //定义 2个数组，分别表示 包含 i 在内左右两边的max
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        int rightMax[] = new int[height.length];
        rightMax[height.length-1] = height[height.length-1];

        for(int i=1;i<height.length;i++){
            if(i==1){
                leftMax[i] = height[i-1];
            }else{
                leftMax[i] = Math.max(leftMax[i-1],height[i-1]);
            }

        }
        for(int j=height.length-2;j>=0;j--){
            if(j==height.length-2){
                rightMax[j] = height[j+1];
            }else{
                rightMax[j] = Math.max(rightMax[j+1],height[j+1]);
            }

        }

        int sum = 0;

        for(int i=0;i<height.length;i++){

            if(Math.min(rightMax[i],leftMax[i]) - height[i]>0){
                sum = sum + Math.min(rightMax[i],leftMax[i]) - height[i] ;
            }

        }
        return sum;


    }
    public static void main(String[] args) {

        int[] inputs = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap2(inputs));
        int[] inputs2 = {4,2,0,3,2,5};
        System.out.println(trap2(inputs2));

    }


}
