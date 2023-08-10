package pers.nebo.exercises.leetcode;

/**
 1071. 字符串的最大公因子

 对于字符串 s 和 t，只有在 s = t + ... + t（t 自身连接 1 次或多次）时，我们才认定 “t 能除尽 s”。

 给定两个字符串 str1 和 str2 。返回 最长字符串 x，要求满足 x 能除尽 str1 且 x 能除尽 str2 。



 示例 1：

 输入：str1 = "ABCABC", str2 = "ABC"
 输出："ABC"
 示例 2：

 输入：str1 = "ABABAB", str2 = "ABAB"
 输出："AB"
 示例 3：

 输入：str1 = "LEET", str2 = "CODE"
 输出：""


 提示：

 1 <= str1.length, str2.length <= 1000
 str1 和 str2 由大写英文字母组成


 */

public class Q1071_GcdOfStrings {


     public String gcdOfStrings(String str1, String str2) {
         /**
          * 思路： 如果存在最大公因子，则两个字符串，长的一定包含短的，
          *    1. 刚好整数 倍 ， 则短字符串为返回值。
          *    2.1 不包含，则返回值为空
          *    2.2 包含，但是不整除，
          *        则使用结果与 短的字符比较
          *           2.2.1 能够整除 ，短的一方为返回值
          *           2.2.1 不能整除，返回
          * 则短的字符串一定包含多个 差值 或者等于  差值、
          * 使用递归实现
          * 时间复杂度：   每次需要替换字符串， n, 递归3次 o(n*3)
          * 空间复杂度：  递归调用3次
          */


         int num1=str1.length();
         int num2=str2.length();

         if(num1>=num2){

             str1=str1.replace(str2,"");
             int new_num1=str1.length();
             if(new_num1==0){
                 return  str2;
             }else{
                 if(new_num1<num2){
                     return gcdOfStrings(str2,str1);
                 }else{
                     return "";
                 }


             }
         }else {
             return  gcdOfStrings(str2,str1);
         }

     }

    /**
     * 较优解
     * @param str1
     * @param str2
     * @return
     */
    public String gcdOfStrings2(String str1, String str2) {
        /**

         如果存在最大因子，则
          str1=n个因子
          str2=m个因子
          所以str1+str2=str2+str1
         */
        if(!str2.concat(str1).equals(str1.concat(str2))){
            return "";
        }

        int num1=str1.length();
        int num2=str2.length();
        int   result=getNum(num1,num2);

        return  str2.substring(0,result);

    }
    public  static  int getNum(int num1,int num2){
        //这里num1 如果小于 num2 ，两者会发生替换，所以不用判断哪个大
        int result=num1%num2;
        while (result!=0){
            num1=num2;
            num2=result;
            result=num1%num2;
        }
        return num2;

    }






}
