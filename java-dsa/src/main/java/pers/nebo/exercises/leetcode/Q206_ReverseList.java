package pers.nebo.exercises.leetcode;

import pers.nebo.exercises.common.ListNode;

/**
 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。


 示例 1：


 输入：head = [1,2,3,4,5]
 输出：[5,4,3,2,1]
 示例 2：


 输入：head = [1,2]
 输出：[2,1]
 示例 3：

 输入：head = []
 输出：[]



 */
public class Q206_ReverseList {

    // 1->2->3->null
    // 1->null
    public ListNode reverseList(ListNode head) {
        //首先定义pre 与curr
        ListNode pre = null;
        ListNode curr = head;
        while(curr!=null){
            //先获取下一个节点，然后存储
            ListNode next = curr.next;
            // 将上一个元素的指针指向当前的下一个,反转顺序
            curr.next = pre;
            // 重新赋值pre上一个指针,为当前的值，方便下一次继续指向
            pre = curr;
            curr = next;


        }
        return  pre;
    }

    public static void main(String[] args) {

    }


}
