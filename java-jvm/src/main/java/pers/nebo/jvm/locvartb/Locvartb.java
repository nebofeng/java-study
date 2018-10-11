package pers.nebo.jvm.locvartb;

/**
 * @auther nebofeng
 * @email nebofeng@gmail.com
 * @date 2018/10/11
 * @des : 局部变量表
 */
public class Locvartb {

    public static void main(String[] args) {
        String s1="abc";
        String s2="abc";//字节码常量

        //如果每次创建相同的字符串，都在堆内存中创建一个对象，局部变量表分别引用。
        // 则 s1 s2 不会想等。
        // 字符串的创建会放到方法区中的常量池。 字符串的常量池 实际上相当于一个hash表。

        String s3 = new String("abc");
        //new 创建一定是在堆内存中的。

        System.out.println(s1==s2);//TRUE
        System.out.println(s1==s3);//FALSE
        System.out.println(s1==s3.intern());//TRUE 转为运行时常量。
        //intern 就是


        // jdk 1.4 弥补 io性能 nio   通道 缓冲区方法。 navivate直接分配堆外内存。
        //  不受java虚拟机的限制。提高性能。 但是会受到 当前物理机的内存（直接内存）
        // nio 分配内存 。直接内存。


    }




}
