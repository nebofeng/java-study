package pers.nebo.exercises.leetcode;

import pers.nebo.common.ListNode;

public class Q2_TwoLinkListNumAdd {
    public static void main(String[] args) {
        //输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
        ListNode l1=new ListNode(1);
//        ListNode  tmp=l1;
//        tmp.next=new ListNode(4);
//        tmp=tmp.next;
//        tmp.next=new ListNode(3);



        ListNode l2=new ListNode(8);
//        ListNode  tmp2=l2;
//        tmp2.next=new ListNode(6);
//        tmp2=tmp2.next;
//        tmp2.next=new ListNode(4);

        //addTwoNumbers(l1,l2);
        addTwoNumbers2(l1,l2);

    }


    /**
     *  优化之前
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3=new ListNode(0);
        int  tmp=0;
        ListNode listNode=l3;
        while(l1!=null && l2!=null){
            int result=0;
            result=l1.val+l2.val+tmp;
            if(result>=10){
                int val =(result%10);
                listNode.next=new ListNode(val);
                listNode=listNode.next;
                tmp=(result/10);
            }else{
                listNode.next=new ListNode(result);
                listNode=listNode.next;
                tmp=0;
            }
            l1=l1.next;
            l2=l2.next;

        }
        while(l1!=null){
            int result=0;
            result=l1.val+tmp;
            if(result>=10){
                int val =(result%10);
                listNode.next=new ListNode(val);
                listNode=listNode.next;
                tmp=(result/10);
            }else{
                listNode.next=new ListNode(result);
                listNode=listNode.next;
                tmp=0;
            }
            l1=l1.next;
        }
        while(l2!=null){

            int result=0;
            result=l2.val+tmp;
            if(result>=10){
                int val =(result%10);
                listNode.next=new ListNode(val);
                listNode=listNode.next;
                tmp=(result/10);
            }else{
                listNode.next=new ListNode(result);
                listNode=listNode.next;
                tmp=0;
            }
            l2=l2.next;

        }
        if(tmp!=0){
            listNode.next=new ListNode(tmp);
            listNode=listNode.next;
        }
        return l3.next;

    }


    public static  ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        ListNode l3=new ListNode(0);
        int  tmp=0;
        ListNode listNode=l3;
        while(l1!=null || l2!=null){
            int val1 = (l1==null)? 0:l1.val;
            int val2 = (l2==null)? 0:l2.val;

            int result =val1+val2+tmp;

            //进位
            tmp=result/10;



            int val=(tmp>0)?(result%10):result;

            listNode.next=new ListNode(val);
            listNode=listNode.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        if(tmp!=0){
            listNode.next=new ListNode(tmp);
            listNode=listNode.next;
        }

        return l3.next;

    }


















}
