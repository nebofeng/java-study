package pers.nebo.jvm.memdis;

/**
 * @auther nebofeng
 * @email nebofeng@gmail.com
 * @date 2018/10/22
 * @des : jvm内存分配
 */
public class MemoryDistribute {
    /*vm option:   -verbose:gc
      -XX:+PrintGCDetails
      指定选用  收集器 -XX:+UseSerialGC  默认是哪个par （server ： par， client ： serialgc）

      默认两g 多核 即为 server版本jdk
    */
    public static void main(String[] args) {
        byte[] b1 = new byte[4 * 1024 * 1024];
        /*
         对象优先在eden区域分配。
         限制eden区域大小。
         大对象直接分配到老年代。

         多个小内存 对象。 当eden内存不够的时候。如果没有指定。会自己增加
         -Xms20M
         -Xmx20M
         指定堆内存大小。

         -Xmn10M
         指定新生代内存大小
         然后定义 3个 2m 一个4m的 对象。 会发生 gc 因为 对象分配不是连续的。 所以eden区域需要gc 整理内存。

         full gc 时间更长。比gc发生更少。

         */

    }
}
