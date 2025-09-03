package pers.nebo.exercises.leetcode;

import pers.nebo.exercises.common.ListNode;

public class Q160_GetIntersectionNode {

    class ListNode{
        int val;
        ListNode next;

    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA =0;
        int lenB =0;
        ListNode startA = headA;
        ListNode startB = headB;
        while (headA.next!=null){
            lenA++;
            headA=headA.next;
        }
        while (headB.next!=null){
            lenB++;
            headB=headB.next;
        }
        //比较两个链表的长度，
        ListNode longHead = null;
        ListNode sortHead = null;
        int count = 0;

        if(lenB>lenA){
            count = lenB- lenA;
            longHead = startA;
            sortHead = startB;

        }else{
            count = lenA  -lenB;
            longHead = startB;
            sortHead = startA;
        }
        for(int i=0;i<count; i++){
            longHead = longHead.next;
        }

        while(longHead!=null){
            //这里不能直接比较value，应该比较指针地址。
            if (longHead == sortHead){
                return  longHead;
            } else {
                longHead=longHead.next;
                sortHead=sortHead.next;
            }

        }

        return null;
    }

    public static void main(String[] args) {

    }
}
