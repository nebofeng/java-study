package pers.nebo.container.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 * Set的原因是Set集合不包含重复元素，HashSet、TreeSet和LinkedHashSet
 * 需求是要一个能快速访问的Set，那么就要用HashSet,
 * 如果你要一个排序Set，那么你应该用TreeSet,
 * 如果你要记录下插入时的顺序时，你应该使用LinedHashSet
 *
 */
public class SetStudy {
	/**
	  class HashSet<E>  extends AbstractSet<E>   implements Set<E>, Cloneable, java.io.Serializable

	  abstract class AbstractSet<E> extends AbstractCollection<E> implements Set<E>
	 */
    HashSet hashSet;

			/**
			 *  -->
			 class LinkedHashSet<E>  extends HashSet<E>   implements Set<E>, Cloneable, java.io.Serializable
			 */
	            LinkedHashSet linkedHashSet;

	/**
	 二叉查找树 。最坏的情况下，如果插入的子集都是有序的。
	                  a
	                b
	             c
	          d
	     ...
	 就会出现上图这种情况只有左（右） 节点 。
	 二叉查找树平衡需要很多次。
	 红黑树  插入节点平衡最多需要两次。 删除节点平衡最多需要三次。

	 TreeSet<E> extends AbstractSet<E>  implements NavigableSet<E>, Cloneable, java.io.Serializable
	 abstract class AbstractSet<E> extends AbstractCollection<E> implements Set<E>
	 abstract class AbstractCollection<E> implements Collection<E>

	 */
	TreeSet treeSet;



}
