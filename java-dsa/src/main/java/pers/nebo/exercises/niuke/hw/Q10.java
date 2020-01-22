package pers.nebo.exercises.niuke.hw;

import java.util.*;

/**
 * @ author fnb
 * @ email nebofeng@gmail.com
 * @ date  2020/1/15
 * @ des :
 */
public class Q10 {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String line=sc.nextLine();
            StringBuffer sb=new StringBuffer();
            String[] words=line.split(" ");
            for(int i=words.length-1;i>=0;i--){
                if(i==0){
                    sb.append(words[i]) ;
                }else{
                    sb.append(words[i]+" ");
                }


            }
            System.out.println(new String(sb));



        }


    }


}
