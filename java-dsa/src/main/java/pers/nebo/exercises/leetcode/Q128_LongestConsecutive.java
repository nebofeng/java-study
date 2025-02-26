package pers.nebo.exercises.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Q128_LongestConsecutive {
//    给定一个未排序的整数数组 nums ，找出数字连续的最长序列（不要求序列元素在原数组中连续）的长度。
//
//    请你设计并实现时间复杂度为 O(n) 的算法解决此问题。
//
//
//
//    示例 1：
//
//    输入：nums = [100,4,200,1,3,2]
//    输出：4
//    解释：最长数字连续序列是 [1, 2, 3, 4]。它的长度为 4。
//    示例 2：
//
//    输入：nums = [0,3,7,2,5,8,4,6,0,1]
//    输出：9
//    示例 3：
//
//    输入：nums = [1,0,1,2]
//    输出：3

    public static int LongestConsecutive(int [] nums){
        Set<Integer> hashSet = new HashSet<>();
        for(int num:nums){
            hashSet.add(num);
        }
        int maxLong = 0;

        //for(int num:nums){   这里从hashset中遍历，遍历的元素更少。
        for(int num:hashSet){
            //for(int num:nums){
            if(!hashSet.contains(num-1)){
                int tmp_num = num;
                int tmpSize = 0;
                while (hashSet.contains(tmp_num)){
                    tmpSize = tmpSize +1 ;
                    tmp_num = tmp_num + 1;
                }
                maxLong = Math.max(tmpSize,maxLong);


            }

        }
        return  maxLong;


    }

    public static void main(String[] args) {
        System.out.println(LongestConsecutive(new int[]{1, 0, 1, 2}));
        System.out.println(LongestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1}));


    }
}
