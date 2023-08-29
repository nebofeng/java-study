package pers.nebo.exercises.leecode;

import org.junit.Test;
import pers.nebo.exercises.leetcode.Q605_CanPlaceFlowers;

import static junit.framework.Assert.assertEquals;

/**
 *
 输入：flowerbed = [1,0,0,0,1], n = 1
 输出：true
 示例 2：

 输入：flowerbed = [1,0,0,0,1], n = 2
 输出：false

 */
public class Q605_CanPlaceFlowersTest {
    @Test
    public void  testCanPlaceFlowersTest(){


//        assertEquals(true,new Q605_CanPlaceFlowers().canPlaceFlowers(new int[]{1, 0, 0, 0, 1},1));
//        assertEquals(false,new Q605_CanPlaceFlowers().canPlaceFlowers(new int[]{1, 0, 0, 0, 1},2));
        assertEquals(false,new Q605_CanPlaceFlowers().canPlaceFlowers(new int[]{1,0,0},1));



    }
}
