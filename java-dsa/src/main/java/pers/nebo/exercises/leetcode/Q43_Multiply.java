package pers.nebo.exercises.leetcode;

/**
 * @ author fnb
 * @ email nebofeng@gmail.com
 * @ date  2020/5/2
 * @ des : 字符串相乘
 *
 * 给定两个以字符串形式表示的非负整数 num1 和 num2，返回 num1 和 num2 的乘积，它们的乘积也表示为字符串形式。
 *
 * 示例 1:
 *
 * 输入: num1 = "2", num2 = "3"
 * 输出: "6"
 * 示例 2:
 *
 * 输入: num1 = "123", num2 = "456"
 * 输出: "56088"
 * 说明：
 *
 * num1 和 num2 的长度小于110。
 * num1 和 num2 只包含数字 0-9。
 * num1 和 num2 均不以零开头，除非是数字 0 本身。
 * 不能使用任何标准库的大数类型（比如 BigInteger）或直接将输入转换为整数来处理。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/multiply-strings
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 *
 */
public class Q43_Multiply {

    public static void main(String[] args) {




    }


    public String multiply(String num1, String num2) {

        if(num1.equals("0")||num2.equals("0")){
            return "0";
        }

        String res="0";


        for(int i=num1.length()-1;i>=0;i--){
            //num1的值
            int x=num1.charAt(i)-'0';
            int carry=0;
            StringBuffer tmp=new StringBuffer();


            //需要补0 ， 补0 的个数 n 为i-1

            for(int j=0;j<num1.length()-1-i;j++){
                tmp.append("0");
            }

            for(int j=num2.length()-1;j>=0||carry!=0;j--){

                int y=j<0?0:num2.charAt(j)-'0';
                tmp.append((x*y+carry)%10);
                carry=(x*y+carry)/10;
            }

            res=stringsAdd(res,tmp.reverse().toString());


        }
        return  res;

    }

    public static String  stringsAdd(String num1,String num2){
        StringBuilder builder = new StringBuilder();
        int carry = 0;

        for(int i= num1.length()-1,j=num2.length()-1;i>=0||j>=0||carry!=0;i--,j--){
            int x= i<0?0:num1.charAt(i)-'0';
            int y= j<0?0:num2.charAt(j)-'0';
            builder.append((x+y+carry)%10);
            carry=(x+y+carry)/10;

        }
        return  builder.reverse().toString();


    }



}
