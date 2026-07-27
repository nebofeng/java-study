package pers.nebo.exercises.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Q76_MinWindow {


    /*
    * 76. 最小覆盖子串
    困难
    相关标签
    premium lock icon
    相关企业
    提示
    给定两个字符串 s 和 t，长度分别是 m 和 n，返回 s 中的 最短窗口 子串，使得该子串包含 t 中的每一个字符（包括重复字符）。如果没有这样的子串，返回空字符串 ""。

    测试用例保证答案唯一。



    示例 1：

    输入：s = "ADOBECODEBANC", t = "ABC"
    输出："BANC"
    解释：最小覆盖子串 "BANC" 包含来自字符串 t 的 'A'、'B' 和 'C'。
    示例 2：

    输入：s = "a", t = "a"
    输出："a"
    解释：整个字符串 s 是最小覆盖子串。
    示例 3:

    输入: s = "a", t = "aa"
    输出: ""
    解释: t 中两个字符 'a' 均应包含在 s 的子串中，
    因此没有符合条件的子字符串，返回空字符串。


    提示：

    m == s.length
    n == t.length
    1 <= m, n <= 105
    s 和 t 由英文字母组成


    进阶：你能设计一个在 O(m + n) 时间内解决此问题的算法吗？
    * */
    public  static String minWindow(String s,String t){

        if(t.length()>s.length()){
            return  "";
        }
        //统计t的 key与value
        Map<Character,Integer> tMap = new HashMap<>();
        Map<Character,Integer> winMap = new HashMap<>();
        for(int i=0;i<t.length();i++){
            tMap.put(t.charAt(i),tMap.getOrDefault(t.charAt(i),0)+1);
        }

        int  ansL = -1, ansR = -1;
        //遍历，每一个当前字符结尾的i
        //      判断，当前i结尾对应的子串，是否包含子串的所有字符（字符数量大于等于）
        int l =0, r=-1;
        //当前r 小于 s.length的时候，一直保持窗口移动
        int sLen = s.length();
        int minLen = Integer.MAX_VALUE;
        while (r<sLen){
            // 移动右侧窗口
            r++;
            //移动右侧，然后逐个放到滑动窗口中
            if(r<sLen){
                winMap.put(s.charAt(r),winMap.getOrDefault(s.charAt(r),0)+1);

            }

            //如果包含的话，则需要记录l与r
            while(check(tMap,winMap)){
                if(r-l+1 < minLen){
                    minLen = r - l + 1;
                    ansR =r;
                    ansL =l;
                }

                winMap.put(s.charAt(l),winMap.getOrDefault(s.charAt(l),0)-1);
                l++;
            }

        }

        return ansL == -1? "" : s.substring(ansL,ansR+1);


    }

    public  static  boolean check(Map<Character,Integer> a, Map<Character,Integer> b){

        for (Map.Entry<Character, Integer> entry :  a.entrySet()) {
            char key = entry.getKey();
            int required = entry.getValue();
            int actual = b.getOrDefault(key, 0);  // 处理key不存在的情况
            if (actual < required) {
                return false;
            }
        }
        return true;
//        Set<Character> keys = a.keySet();
//        for(Character c:keys){
//            if (a.get(c) < b.getOrDefault(c,0)){
//                return  false;
//            }
//
//        }
//        return true;

    }

    public static void main(String[] args) {
        String s = "cabwefgewcwaefgcf", t = "cae";
        System.out.println(minWindow(s,t));
        String s1 = "a", t1 = "b";
        System.out.println(minWindow(s1,t1));

    }
}
