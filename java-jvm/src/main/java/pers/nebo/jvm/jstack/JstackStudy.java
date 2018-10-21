package pers.nebo.jvm.jstack;

import java.util.Map;

/**
 * @auther nebofeng
 * @email nebofeng@gmail.com
 * @date 2018/10/21
 * @des :jstack
 */
public class JstackStudy {
    public static void main(String[] args) {
        Map <Thread, StackTraceElement[]> m= Thread.getAllStackTraces();
     // 遍历map

    }
}
