package pers.nebo.container.map;

import sun.reflect.generics.tree.Tree;

import java.io.Serializable;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @auther nebofeng@gmail.com
 * @date 2018/9/30 11:20
 * @des: map 容器学习类
 */
public class MapStudy {
	/**
	 HashMap<K,V> extends AbstractMap<K,V> implements Map<K,V>, Cloneable, Serializable

	 abstract class AbstractMap<K,V> implements Map<K,V>

	 */
	HashMap  map;

	      /**
	           LinkedHashMap<K,V>   extends HashMap<K,V> implements Map<K,V>
	           双向链表。
	      */
			   LinkedHashMap linkedHashMap;

	/**
	 TreeMap<K,V>  extends AbstractMap<K,V>   implements NavigableMap<K,V>, Cloneable, java.io.Serializable
	  interface NavigableMap<K,V> extends SortedMap<K,V>
	  interface SortedMap<K,V> extends Map<K,V>


	 */

	 TreeMap treeMap;


	/**
	 class ConcurrentHashMap<K,V> extends AbstractMap<K,V> implements ConcurrentMap<K,V>, Serializable
	 */
	ConcurrentHashMap concurrentHashMap;




}
