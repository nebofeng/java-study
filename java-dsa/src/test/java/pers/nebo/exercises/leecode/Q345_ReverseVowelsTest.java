package pers.nebo.exercises.leecode;

import org.junit.Test;
import pers.nebo.exercises.leetcode.Q345_ReverseVowels;

import static junit.framework.Assert.assertEquals;

public class Q345_ReverseVowelsTest {

    /*
  示例 1：

输入：s = "hello"
输出："holle"
示例 2：

输入：s = "leetcode"
输出："leotcede"

".a"

    * */

    @Test
    public void  testReverseVowels(){
        assertEquals("holle",new Q345_ReverseVowels().reverseVowels("hello"));
        assertEquals("leotcede",new Q345_ReverseVowels().reverseVowels("leetcode"));
        assertEquals("a.",new Q345_ReverseVowels().reverseVowels("a."));
    }
}
