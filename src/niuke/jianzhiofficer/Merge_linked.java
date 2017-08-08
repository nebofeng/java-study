package niuke.jianzhiofficer;

import Public_Class.ListNode;

/*
问题描述：有两个链表都是从小到大排好顺序的，要求将两个链表合并，并且也是按照顺序


解决思路：
 
 比较两个链表的首个值得大小 ，使一个句柄（指针） 指向较小的一个，然后比较指针后面节点的数值与另一个链表的头结点。
 此时为了记录指针指向的位置，明白，应当多设置两个指针。分别指向当前链表比较的节点。第三个指针指向新和成链表的节点
 


*/
public class Merge_linked {
	
	    public ListNode Merge(ListNode list1,ListNode list2) {
//	        //新建一个头节点，用来存合并的链表。
//	        ListNode head=new ListNode(-1);
//	        head.next=null;
//	        ListNode root=head;
//	        while(list1!=null&&list2!=null){
//	            if(list1.val<list2.val){
//	                head.next=list1;
//	                head=list1;
//	                list1=list1.next;
//	            }else{
//	                head.next=list2;
//	                head=list2;
//	                list2=list2.next;
//	            }
//	        }
//	        //把未结束的链表连接到合并后的链表尾部
//	        if(list1!=null){
//	            head.next=list1;
//	        }
//	        if(list2!=null){
//	            head.next=list2;
//	        }
//	        return root.next;
	        
	        
	        ListNode head1=new ListNode(-1);
	        
	            head1.next=null;
	            ListNode root =head1;
		        
	        while(list1!=null&&list2!=null){
	        	if(list1.val>list2.val){
	        		head1.next=list2;
	        		head1=list2;
	        		list2=list2.next;
	        				
	        	}else{
	        		head1.next=list1;
	        		head1=list1;
	        		list1=list1.next;
	   
	        	}
	        	
	        }
	        if(list1!=null){
	        	head1.next=list1;
	        }
	        if(list2!=null){
	        	head1.next=list2;
	        }
	        
	        return root.next;
	        
	    }
}
