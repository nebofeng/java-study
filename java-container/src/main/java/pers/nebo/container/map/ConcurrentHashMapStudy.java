package pers.nebo.container.map;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @auther nebofeng
 * @email nebofeng@gmail.com
 * @date 2018/11/13
 * @des :ConcurrentHashMapStudy
 */
public class ConcurrentHashMapStudy {
    /**
     ConcurrentHashMap<K,V> extends AbstractMap<K,V>
                          implements ConcurrentMap<K,V>, Serializable
     底层采用分段的数组+链表实现，线程安全
     通过把整个Map分为N个Segment，可以提供相同的线程安全，但是效率提升N倍，默认提升16倍。(读操作不加锁，由于HashEntry的value变量是 volatile的，也能保证读取到最新的值。)
     Hashtable的synchronized是针对整张Hash表的，即每次锁住整张表让线程独占，ConcurrentHashMap允许多个修改操作并发进行，其关键在于使用了锁分离技术
     有些方法需要跨段，比如size()和containsValue()，它们可能需要锁定整个表而而不仅仅是某个段，这需要按顺序锁定所有段，操作完毕后，又按顺序释放所有段的锁
     扩容：段内扩容（段内元素超过该段对应Entry数组长度的75%触发扩容，不会对整个Map进行扩容），插入前检测需不需要扩容，有效避免无效扩容
     * */
    ConcurrentHashMap concurrentHashMap;


}
