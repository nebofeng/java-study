package pers.nebo.exercises.niuke.jianzhiofficer;

public class ReverseList {
	public static void main(String[] args) {
		
	}
}
 class ListNode1 {
    int val;
    ListNode1 next = null;

    ListNode1(int val) {
        this.val = val;
    }
}
 /*
 输入一个链表，反转链表后，输出链表的所有元素
 */
class SolutionReverseList {
	public ListNode1 ReverseList(ListNode1 head) {
        if (head == null)
            return null;
        if (head.next == null)
            return head;
 
        ListNode1 pPre = null;
        ListNode1 p = head;
        ListNode1 pNext = head.next;
        ListNode1 newHead = null;
 
        while (p != null) {
            pNext = p.next;//一定要记录下来后面的节点
            if (pNext == null)
                newHead = p;
            p.next = pPre;//这里的方向已经转变
            pPre = p;
            p = pNext;//将保存的后面的节点作为下一次循环的p
 
        }
        return newHead;
 
    }
}