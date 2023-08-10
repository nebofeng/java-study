package pers.nebo.exercises.leecode;

import org.junit.Assert;
import org.junit.Test;
import pers.nebo.exercises.leetcode.Q1431_KidsWithCandies;

import java.util.Arrays;
import java.util.List;

import static junit.framework.Assert.assertEquals;

public class Q1431_KidsWithCandiesTest {


    /**
     * 示例 1：
     *
     * 输入：candies = [2,3,5,1,3], extraCandies = 3
     * 输出：[true,true,true,false,true]
     * 解释：
     * 孩子 1 有 2 个糖果，如果他得到所有额外的糖果（3个），那么他总共有 5 个糖果，他将成为拥有最多糖果的孩子。
     * 孩子 2 有 3 个糖果，如果他得到至少 2 个额外糖果，那么他将成为拥有最多糖果的孩子。
     * 孩子 3 有 5 个糖果，他已经是拥有最多糖果的孩子。
     * 孩子 4 有 1 个糖果，即使他得到所有额外的糖果，他也只有 4 个糖果，无法成为拥有糖果最多的孩子。
     * 孩子 5 有 3 个糖果，如果他得到至少 2 个额外糖果，那么他将成为拥有最多糖果的孩子。
     * 示例 2：
     *
     * 输入：candies = [4,2,1,1,2], extraCandies = 1
     * 输出：[true,false,false,false,false]
     * 解释：只有 1 个额外糖果，所以不管额外糖果给谁，只有孩子 1 可以成为拥有糖果最多的孩子。
     * 示例 3：
     *
     * 输入：candies = [12,1,12], extraCandies = 10
     * 输出：[true,false,true]
     */
    @Test
    public void testKidsWithCandies(){
        List<Boolean> result= Arrays.asList(  true,true,true,false,true );
        int[]  nums= { 2,3,5,1,3};
        assertEquals(result,new Q1431_KidsWithCandies().kidsWithCandies(nums,3));

    }


}
