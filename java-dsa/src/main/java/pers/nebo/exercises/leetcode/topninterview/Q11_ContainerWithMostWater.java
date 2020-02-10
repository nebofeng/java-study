package pers.nebo.exercises.leetcode.topninterview;

/**
 * @ author fnb
 * @ email nebofeng@gmail.com
 * @ date  2020/2/9
 * @ des :


 给定 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。

 说明：你不能倾斜容器，且 n 的值至少为 2。



 图中垂直线代表输入数组 [1,8,6,2,5,4,8,3,7]。在此情况下，容器能够容纳水（表示为蓝色部分）的最大值为 49。

  

 示例:

 输入: [1,8,6,2,5,4,8,3,7]
 输出: 49

 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/container-with-most-water
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

 题解：
 https://leetcode-cn.com/problems/container-with-most-water/solution/sheng-zui-duo-shui-de-rong-qi-by-leetcode/
 */
public class Q11_ContainerWithMostWater {

    public static void main(String[] args) {

     int [] height={1,8,6,2,5,4,8,3,7};
     System.out.println(getMost(height));


    }

    /**
     *
     * @param height
     * @return
     * 从两边开始计算
     *由于面积取决于边长短的那一端假设为m，所以要想得到比当前更大的面积，边长短的那一端必须舍弃，
     * 因为如果不舍弃，高最大就是m，而随着指针的移动宽会一直减小，因此面积只会越来越小。
     */
    public static  int getMost(int[] height){

        int result=0;
        int left=0;
        int right=height.length-1;
        while(left<right){
            int tmp=(right-left)*Math.min(height[left],height[right]);
            if(height[left]>height[right]){
                right--;
            }else{
                left++;
            }
            result=Math.max(result,tmp);

        }
        return  result;

    }



}
