package pers.nebo.exercises.niuke.hw;

/**
 * @ author fnb
 * @ email nebofeng@gmail.com
 * @ date  2020/1/13
 * @ des :
 */

import java.util.Scanner;

/**
*
* 题目描述
写出一个程序，接受一个十六进制的数，输出该数值的十进制表示。（多组同时输入 ）

输入描述:
输入一个十六进制的数值字符串。

输出描述:
输出该数值的十进制字符串。
* */
public class Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String ts=sc.nextLine();

            ts=ts.substring(2,ts.length());
            int size=ts.length();
            int num=0;
            for(int i=size;i>0;i--){

                int tmp;
                System.out.println(ts.charAt(i-1));
                if(ts.charAt(i-1)-48>=0&&ts.charAt(i-1)-48<=9){
                    tmp=Integer.parseInt(String.valueOf(ts.charAt(i-1)));
                }else{
                    tmp=ts.charAt(i-1)-'A'+10;
                }
                for(int j=i;j<size;j++){
                    tmp=tmp*16;
                }
                num=num+tmp;

            }
            System.out.println(num);

        }

    }
}
