package pers.nebo.exercises.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * 438. 找到字符串中所有字母异位词
 * 中等
 * 相关标签
 * premium lock icon
 * 相关企业
 * 给定两个字符串 s 和 p，找到 s 中所有 p 的 异位词 的子串，返回这些子串的起始索引。不考虑答案输出的顺序。
 *
 *
 *
 * 示例 1:
 *
 * 输入: s = "cbaebabacd", p = "abc"
 * 输出: [0,6]
 * 解释:
 * 起始索引等于 0 的子串是 "cba", 它是 "abc" 的异位词。
 * 起始索引等于 6 的子串是 "bac", 它是 "abc" 的异位词。
 *  示例 2:
 *
 * 输入: s = "abab", p = "ab"
 * 输出: [0,1,2]
 * 解释:
 * 起始索引等于 0 的子串是 "ab", 它是 "ab" 的异位词。
 * 起始索引等于 1 的子串是 "ba", 它是 "ab" 的异位词。
 * 起始索引等于 2 的子串是 "ab", 它是 "ab" 的异位词。
 *
 *
 * 提示:
 *
 * 1 <= s.length, p.length <= 3 * 104
 * s 和 p 仅包含小写字母
 * */

public class Q438_FindAnagrams {

    //滑动差窗口对比
    public  static  List<Integer>  findAnagraoms(String s,String p){
        List<Integer> result = new ArrayList<>();

        if(s.length()<p.length()){
            return  result;
        }
        //定义字母位置的数量
        int []  pNums =  new int[26];
        int [] sNums = new int [26];
        for(int i=0;i<p.length();i++){
            int pNum =  p.charAt(i)-'a';
            int sNum =  s.charAt(i)-'a';
            pNums[pNum]=pNums[pNum]+1;
            sNums[sNum]=sNums[sNum]+1;

        }
        //如果两个相等，则代表符合
        if (Arrays.equals(pNums,sNums)){
            result.add(0);

        }

        for(int i = p.length() ; i< s.length();i++){

            int tmpSnum = s.charAt(i)-'a';
            int oldSnum  = s.charAt(i-p.length())-'a';
            sNums[oldSnum] --;
            sNums[tmpSnum] ++;

            if(Arrays.equals(sNums,pNums)){
                result.add(i-p.length()+1);
            }

        }





       return  result;
    }


    // 增量diff 方法对比
    public  static  List<Integer>  findAnagraoms1(String s,String p){
        return  null;
    }

    public static void main(String[] args) {

        System.out.println(findAnagraoms("abab","ab"));

    }
}
