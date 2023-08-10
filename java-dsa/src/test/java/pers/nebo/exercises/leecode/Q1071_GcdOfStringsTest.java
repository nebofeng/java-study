package pers.nebo.exercises.leecode;

import org.junit.Test;
import pers.nebo.exercises.leetcode.Q1071_GcdOfStrings;

import static junit.framework.Assert.assertEquals;

public class Q1071_GcdOfStringsTest {

    @Test
    public void testGcdofString(){
//        示例 1：
//
//        输入：str1 = "ABCABC", str2 = "ABC"
//        输出："ABC"
//        示例 2：
//
//        输入：str1 = "ABABAB", str2 = "ABAB"
//        输出："AB"
//        示例 3：
//
//        输入：str1 = "LEET", str2 = "CODE"

//        输出：""
        System.out.println(3%2);
        assertEquals("ABC",  new Q1071_GcdOfStrings().gcdOfStrings("ABCABC","ABC"));
        assertEquals("AB",  new Q1071_GcdOfStrings().gcdOfStrings("ABABAB","ABAB"));
        assertEquals("",  new Q1071_GcdOfStrings().gcdOfStrings("LEET","CODE"));
        assertEquals("",  new Q1071_GcdOfStrings().gcdOfStrings("AABB","AB"));

    }
}
