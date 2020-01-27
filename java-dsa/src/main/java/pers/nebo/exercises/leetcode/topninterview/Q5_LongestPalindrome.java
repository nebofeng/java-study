package pers.nebo.exercises.leetcode.topninterview;

/**
 * @ author fnb
 * @ email nebofeng@gmail.com
 * @ date  2020/1/27
 * @ des :

 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。

 示例 1：

 输入: "babad"
 输出: "bab"
 注意: "aba" 也是一个有效答案。
 示例 2：

 输入: "cbbd"
 输出: "bb"

 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/longest-palindromic-substring
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。



 */
public class Q5_LongestPalindrome {

    public static void main(String[] args) {

        String source="\"ccc\"";
        System.out.println(longestPalindrome(source));


    }

    /**
     *
     * @param source 传入原始字符串
     * @return 返回字符串中包含的最长回文子字符串
     */
    public static String  longestPalindrome(String source){
        if (source == null || source.length() < 1) return "";
        int start = 0, end = 0;
        for(int i=0;i<source.length()-1;i++){
            //因为存着奇数，偶数的情况，所以 奇数可能当前i 为 中心 字符 ，则为len1
            // 偶数则为len2 情况
            int len1=expandAroundCenter(source,i,i);
            int len2=expandAroundCenter(source,i,i+1);

            int len=Math.max(len1,len2);
            if(len>(end-start+1)){
                /**
                 如果是len 为奇数 。则两个距离是一样的  即（len-1）/2  与len/2
                 如果len 为偶数， 则 坐标距离 i 为 一般(len-1)/2 右边为 len/2 （与i的距离比左边+1）
                 */
               start=i-((len-1)/2);
               end=i+(len/2);
            }
        }


        return  source.substring(start,end+1);
    }

    /**
     *
     * @param source
     * @param start
     * @param end
     * @return
     * java 基本类型是值传递，所以可以直接更改，不会影响原来的值
     */
    public static int expandAroundCenter(String source,int start,int end){

        while(start>=0 && end<source.length() && source.charAt(start)==source.charAt(end)){
            start--;
            end++;
        }
        return  end-start-1; //end -start 比实际的位置多了两个,因为最后都分别往前往后移动了一个坐标,本来是 end-start+1,需要减去 2

    }
}



