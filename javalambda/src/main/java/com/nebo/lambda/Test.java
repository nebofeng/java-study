package com.nebo.lambda;

public class Test {

    public static void main(String[] args) {

        new Thread(new Runnable() {
            public void run() {
                System.out.println("before java");
            }
        }).start();


        //java 8
        new Thread(() -> System.out.println("java 8")).start(); ;
    }
}
