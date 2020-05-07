package pers.nebo.exercises.leetcode;

/**
 * @ author fnb
 * @ email nebofeng@gmail.com
 * @ date  2020/5/2
 * @ des :
 */
public class Q415_AddStrings {


    public static void main(String[] args) {

        System.out.println(stringsAdd("123","456"));
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
