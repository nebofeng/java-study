package pers.nebo.exercises.niuke.hw;

/**
 * @ author fnb
 * @ email nebofeng@gmail.com
 * @ date  2020/1/13
 * @ des :
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *•连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组；
 * •长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
 */
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=2;
        List<String> list=new ArrayList<>();
        while(num-->0){

            String line=sc.nextLine();
            while (line.length()>8){
                list.add(line.substring(0,8));
                line=line.substring(8,line.length());
            }
            if(line.length()==8){
                if(!(line.trim().length()==0)){

                    list.add(line);

                }
            }else if(line.length()<8){
                if(!(line.trim().length()==0)){
                    int size=8-line.length();
                    StringBuffer tmp=new StringBuffer();
                    for (int i=0;i<size;i++){
                        tmp=tmp.append("0");
                    }
                    line=line+tmp.toString();
                    list.add(line);
                }

            }


        }
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

    }

}
