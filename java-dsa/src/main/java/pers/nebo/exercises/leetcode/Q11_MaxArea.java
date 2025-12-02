package pers.nebo.exercises.leetcode;

import java.lang.Math;

public class Q11_MaxArea {

    /**
     *
     给定一个长度为 n 的整数数组 height 。有 n 条垂线，第 i 条线的两个端点是 (i, 0) 和 (i, height[i]) 。

     找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。

     返回容器可以储存的最大水量。

     说明：你不能倾斜容器。


     输入：[1,8,6,2,5,4,8,3,7]
     输出：49
     解释：图中垂直线代表输入数组 [1,8,6,2,5,4,8,3,7]。在此情况下，容器能够容纳水（表示为蓝色部分）的最大值为 49。


     示例 2：

     输入：height = [1,1]
     输出：1


     */




    /*
    *
    思路：
     双指针法：使用两个指针，一个指向数组的起始位置（left），另一个指向数组的末尾位置（right）。
    计算面积：计算当前两个指针所指向的线段与x轴构成的容器的面积，面积由较短的那条线的高度和两个指针之间的距离决定。
    移动指针：为了寻找可能更大的面积，移动较短的那条线的指针向内侧移动一位，因为移动较长的线的指针不会增加容器的高度，而移动较短的线的指针有可能找到更高的线，从而增加面积。
    更新最大面积：在每次移动指针后，计算新的面积，并更新最大面积。
    重复步骤：重复上述过程，直到两个指针相遇。


    */
    public static  int MaxArea(int[] input){
        int left = 0;
        int right = input.length-1;
        int max =0;
        while(left<right){
            int min = Math.min(input[left],input[right]);
            max=  Math.max(max,(right-left)*min);

            if(input[left]<input[right]){
                left++;
            }else{
                right--;
            }

        }


        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(MaxArea(arr));


    }
}
