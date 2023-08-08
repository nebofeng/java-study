package pers.nebo.exercises.leetcode;

import org.junit.Test;

/**

 给你两个字符串 word1 和 word2 。请你从 word1 开始，通过交替添加字母来合并字符串。如果一个字符串比另一个字符串长，就将多出来的字母追加到合并后字符串的末尾。

 返回 合并后的字符串 。

  

 示例 1：

 输入：word1 = "abc", word2 = "pqr"
 输出："apbqcr"
 解释：字符串合并情况如下所示：
 word1：  a   b   c
 word2：    p   q   r
 合并后：  a p b q c r
 示例 2：

 输入：word1 = "ab", word2 = "pqrs"
 输出："apbqrs"
 解释：注意，word2 比 word1 长，"rs" 需要追加到合并后字符串的末尾。
 word1：  a   b
 word2：    p   q   r   s
 合并后：  a p b q   r   s
 示例 3：

 输入：word1 = "abcd", word2 = "pq"
 输出："apbqcd"
 解释：注意，word1 比 word2 长，"cd" 需要追加到合并后字符串的末尾。
 word1：  a   b   c   d
 word2：    p   q
 合并后：  a p b q c   d
  

 提示：

 1 <= word1.length, word2.length <= 100
 word1 和 word2 由小写英文字母组成

 来源：力扣（LeetCode）
 链接：https://leetcode.cn/problems/merge-strings-alternately
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Q1716_AlternatelyMrgedStrings {

    public static void main(String[] args) {
        System.out.println("111");
    }
    public  String mergeAlternately(String word1, String word2) {
        //第一步首先比较哪个最长
        StringBuffer stringBuffer=new StringBuffer("");
        char [] words1=word1.toCharArray();

        char [] words2=word2.toCharArray();
        int word1_num=word1.length()-1;
        int word2_num=word2.length()-1;
        int i=0;
        for(;i<=word1_num;i++){
            stringBuffer.append(words1[i]);
            if(i<=word2_num){
                stringBuffer.append(words2[i]);
            }
        }
        while (i<=word2_num){
            stringBuffer.append(words2[i]);
            i++;

        }
        return  stringBuffer.toString();

    }

    /**
     * 更优解
     * @param s1
     * @param s2
     * @return
     */
    public String mergeAlternately2(String s1, String s2) {
        int n = s1.length(), m = s2.length(), i = 0, j = 0;
        StringBuilder sb = new StringBuilder();
        while (i < n || j < m) {
            if (i < n) sb.append(s1.charAt(i++));
            if (j < m) sb.append(s2.charAt(j++));
        }
        return sb.toString();
    }


}
