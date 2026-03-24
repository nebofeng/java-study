package pers.nebo.exercises.leetcode;

import pers.nebo.exercises.common.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 *
 给你一个单链表的头节点 head ，请你判断该链表是否为回文链表。如果是，返回 true ；否则，返回 false 。



 示例 1：


 输入：head = [1,2,2,1]
 输出：true
 示例 2：


 输入：head = [1,2]
 输出：false


 提示：

 链表中节点数目在范围[1, 105] 内
 0 <= Node.val <= 9


 进阶：你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？


 */
public class Q234_isPalindrome {

    /**
     思路： 1. 遍历所有的元素，放到数组里面，然后数组双向比较
     */
    public boolean isPalindrome(ListNode head) {
        List<Integer> tmpList = new ArrayList<>();
         while(head!=null){
                tmpList.add(head.val);
                head=head.next;
         }


         int start = 0;
         int end = tmpList.size()-1;

         while (start<=end){


             if(tmpList.get(start)!=tmpList.get(end)){
                 return  false;
             }
             start++;
             end--;


         }
         return  true;




    }


    public static void main(String[] args) {

    }
}
