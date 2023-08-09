package pers.nebo.exercises.leecode;

import org.junit.Test;
import pers.nebo.exercises.leetcode.Q1716_AlternatelyMrgedStrings;

import static junit.framework.Assert.assertEquals;


public class Q1716_AlternatelyMrgedStringsTest {
    @Test
    public void testmergeAlternatelyTest(){

        assertEquals("apbqrs",  new Q1716_AlternatelyMrgedStrings().mergeAlternately("ab","pqrs"));
    }




}
