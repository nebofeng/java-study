package pers.nebo.jvm.jconsole;

import pers.nebo.jvm.oom.Demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther nebofeng
 * @email nebofeng@gmail.com
 * @date 2018/10/6
 * @des :
 */
public class JConsoleTest {


    byte[] bytesA = new byte[1024*8];
    //类变量。
    JConsoleTest(){
        byte[] bytesB = new byte[1024*8];
        //局部变量
    }
    /*
     类变量与局部变量回收的时间不一样。如果是类变量与类的生命周期一致。

    */

    public static void main(String[] args) {

        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("start");
        fill(1000);
    }

    private static void fill(int n) {

        List<Demo> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list.add(new Demo());
        }
    }
}
