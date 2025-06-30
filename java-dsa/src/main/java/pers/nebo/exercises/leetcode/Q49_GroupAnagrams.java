package pers.nebo.exercises.leetcode;

import java.util.*;

/**
 给你一个字符串数组，请你将 字母异位词 组合在一起。可以按任意顺序返回结果列表。
 字母异位词 是由重新排列源单词的所有字母得到的一个新单词。
 示例 1:
 输入: strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
 输出: [["bat"],["nat","tan"],["ate","eat","tea"]]
 示例 2:
 输入: strs = [""]
 输出: [[""]]
 示例 3:
 输入: strs = ["a"]
 输出: [["a"]]
 提示：
 1 <= strs.length <= 104
 0 <= strs[i].length <= 100
 strs[i] 仅包含小写字母
 */
public class Q49_GroupAnagrams {
    public static  List<List<String>> groupAnagrams(String[] strs){
        //定义结果map
        Map<String, List<String>> result  = new HashMap<>();
        for(int i=0;i< strs.length;i++){
            String tmp = strs[i];
            // 转为字符并排序
            char[] chars = tmp.toCharArray();
            Arrays.sort(chars);
            String soted_str = new String(chars);

            List<String> keyList = result.getOrDefault(soted_str,new ArrayList<>());
            keyList.add(tmp);
            result.put(soted_str,keyList);

        }
        return new ArrayList<List<String>>(result.values());



    }
    public static void main(){


    }
}
