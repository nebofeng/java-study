package pers.nebo.jvm.jconsole;

import java.util.Scanner;

/**
 * @auther nebofeng
 * @email nebofeng@gmail.com
 * @date 2018/10/18
 * @des : Jconsole 内存、线程监控
 */
public class Main {
    // jconsole 无法连接 添加参数 -Dcom.sun.management.jmxremote
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.next();

        new Thread(new Runnable() {
            @Override
            public void run() {
              while (true){

              }
            }
        },"while true").start();

        sc.next();

        testWait(new Object());



    }

    private static void  testWait(Object obj){
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (obj){
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        },"wait").start();
    }
}
