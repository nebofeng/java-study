package pers.nebo.exercises.leetcode.topninterview;

/**
 * @ author fnb
 * @ email nebofeng@gmail.com
 * @ date  2020/1/27
 * @ des : 整数翻转

 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。

 示例 1:

 输入: 123
 输出: 321
  示例 2:

 输入: -123
 输出: -321
 示例 3:

 输入: 120
 输出: 21
 注意:

 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。

 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/reverse-integer
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。


 */
public class Q7_IntegerReverse {

    public static void main(String[] args) {

    }

    public static int IntegerReverse(int  source){
        int ans=0;

        int x=source;
        while (x!=0){

            int pop= x%10;
            if(ans>Integer.MAX_VALUE/10 || (ans==Integer.MAX_VALUE/10 && pop >7 ) ){
                return  0;
            }
            if(ans<Integer.MIN_VALUE/10 || (ans==Integer.MAX_VALUE/10 && pop <-8 )){
               return 0;
            }
            ans=ans*10 + pop;
            x=x/10;
        }
        return  ans;

    }



}
