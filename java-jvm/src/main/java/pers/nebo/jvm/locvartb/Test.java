package pers.nebo.jvm.locvartb;

import java.io.IOException;

/**
 * @auther nebofeng
 * @email nebofeng@gmail.com
 * @date 2018/10/11
 * @des :
 */
public class Test
{

    public static void main(String[] args) {

            int a = 2;
            int n = 5;
            int tn =0;
            int sn=0;
            int i=1;
            while(i<=n){
                if(i==1){
                    tn = tn + a+1;
                }else{
                    tn = tn+a;
                }
                sn =sn +tn;
                a= 10*a;
                System.out.println(i+"=="+tn+"===");
                i++;
            }







    }
}
