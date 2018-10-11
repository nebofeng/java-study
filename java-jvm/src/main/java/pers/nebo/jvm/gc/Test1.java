package pers.nebo.jvm.gc;

import sun.applet.Main;

/**
 * @auther nebofeng
 * @email nebofeng@gmail.com
 * @date 2018/10/11
 * @des :
 */
public class Test1 {
    private Object instace;
    public Test1(){
        //byte[] byte = new  byte[];
    }
    public static void main(String[] args) {
        Test1 t1 = new Test1();
        Test1 t2 = new Test1();
        t1.instace = t2;
        t2.instace=t1;
        t1=null;
        t2=null;
        System.gc();

  // parallel

    }
}
