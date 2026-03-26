package pers.nebo.exercises.leetcode;

import pers.nebo.exercises.common.ListNode;

/**
 *
 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 示例 1：
 输入：l1 = [1,2,4], l2 = [1,3,4]
 输出：[1,1,2,3,4,4]
 示例 2：

 输入：l1 = [], l2 = []
 输出：[]
 示例 3：

 输入：l1 = [], l2 = [0]
 输出：[0]


 提示：

 两个链表的节点数目范围是 [0, 50]
 -100 <= Node.val <= 100
 l1 和 l2 均按 非递减顺序 排列
 *
 */
public class Q21_mergeTwoLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode result = new ListNode();
        ListNode pre = result;
         //  升序链表，需要判断是否到了尾部
        while(list1!=null && list2!=null){

           if(list1.val<list2.val){
               result.next= list1;
               list1 = list1.next;


           }else{
               result.next = list2;
               list2 = list2.next;

           }
            result = result.next;

        }
        if (list1==null){
            result.next = list2;
        }else{
            result.next = list1;
        }

        return  pre.next;


    }

    public static void main(String[] args) {

    }
}
