package pers.nebo.exercises.niuke.jianzhiofficer;

import Public_Class.ListNode;

public class FindKthToTail {
	public static void main(String[] args) {
		
	}
	
	
}

class SolutionFindKthToTail {
	
    public ListNode FindKthToTail(ListNode head,int k) {
    	int count=0;
    	ListNode listNode=head;
    	if(head==null){
    		return head;
    	}
    	while(listNode.next!=null){
    		count++;
    		listNode=listNode.next;
    	}
    	if(count<k){
    		return null;
    	}		
    	for(int i=0;i<count-k;i++){
    		head=head.next;
    		
    	}
    	return head;
    }
}

