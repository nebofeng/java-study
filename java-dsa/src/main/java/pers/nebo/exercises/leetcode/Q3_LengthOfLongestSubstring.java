package pers.nebo.exercises.leetcode;

import java.util.*;

/**

 3. 无重复字符的最长子串
 已解答
 中等
 相关标签
 premium lock icon
 相关企业
 提示
 给定一个字符串 s ，请你找出其中不含有重复字符的 最长 子串 的长度。



 示例 1:

 输入: s = "abcabcbb"
 输出: 3
 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。注意 "bca" 和 "cab" 也是正确答案。
 示例 2:

 输入: s = "bbbbb"
 输出: 1
 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 示例 3:

 输入: s = "pwwkew"
 输出: 3
 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。


 提示：

 0 <= s.length <= 5 * 104
 s 由英文字母、数字、符号和空格组成


 */
public class Q3_LengthOfLongestSubstring {

    public static  int lengthOfLongestSubstring(String s ){
        /**
         这不应该用list用set , 不然时间复杂度就是n的三次方
         */
        int result =0;
        if (s.length()==0){
            return  result;
        }
        if (s.length()==1){
            return 1;
        }
        //思路：对于一个最长无重复子串，遍历每一个 i 开始的子串，确定开始索引为i的串不重复的最大长度，然后取最大的
        for(int i=0;i<s.length();i++){

            List<Character> tmp_list = new ArrayList<>();

            for(int j=i;j<s.length();j++){
                if(tmp_list.contains(s.charAt(j))){

                    break;
                }else{
                    tmp_list.add(s.charAt(j));
                    result = Math.max(result,tmp_list.size());
                }

            }

        }
        return result ;
    }
    public static  int lengthOfLongestSubstring2(String s ){
        /**
          滑动窗口，时间复杂度2n的思路
         */

        Set<Character> result = new HashSet<>();

        int max = 0;
        int right = 0;

        for(int i=0; i< s.length();i++){
            //开始移动的时候，如果不是 i=0,则需要从result开始移除
            if(i!=0) {
                result.remove(s.charAt(i-1));
            }
            //右边开始移动，直到开始出现重复字符。
            while ( right < s.length() && !result.contains(s.charAt(right))){
                result.add(s.charAt(right));
                right++;
            }

            max = Math.max(max,right-i);


        }
        return  max;

    }
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring2("a"));
    }
}
