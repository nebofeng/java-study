
package leetcode.weekly_contest_31;
/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年5月7日 上午10:46:26
* 类说明:
* Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
*/
/*
			 Subtree of Another Tree
			
			    User Accepted: 772
			    User Tried: 883
			    Total Accepted: 785
			    Total Submissions: 1873
			    Difficulty: Easy
			
			Given two non-empty binary trees s and t, check whether tree t has exactly the same structure
			 and node values with a subtree of s. A subtree of s is a tree consists of a node in s and all 
			 of this node's descendants. The tree s could also be considered as a subtree of itself.
			
			Example 1:
			Given tree s:
			
			     3
			    / \
			   4   5
			  / \
			 1   2
			
			Given tree t:
			
			   4 
			  / \
			 1   2
			
			Return true, because t has the same structure and node values with a subtree of s.
			
			Example 2:
			Given tree s:
			
			     3
			    / \
			   4   5
			  / \
			 1   2
			    /
			   0
			
			Given tree t:
			
			   4
			  / \
			 1   2
			
			Return false. 
 */
public class SolutionTwo {
	 public boolean isSubtree(TreeNode s, TreeNode t) {
	     TreeNode treeNode=serach(s,t);
		 return equal(s,t);
		
	 }
	 public boolean equal(TreeNode s,TreeNode t){
		 boolean answer=true;
		 if(s!=null&&t!=null&&s.val==t.val){
			 equal(s.left,t.left);
			 equal(s.right,t.right);
		 }
		 else{
			 answer=false;
		 }
		
		 
		 
		 return answer;
	 }
	 
	 
	 public TreeNode serach(TreeNode s,TreeNode t){
		 
		 if(s.val!=t.val){
			 TreeNode answer=serach(s.left,t);
			 TreeNode answer1=serach(s.right,t);
			 if(answer!=null){
				 return answer;
			 }
			 if(answer1!=null){
				 return answer1;
			 }
			 else{
				 return null;
			 }
		 }else{
			 return s;
		 }
		 
	 }
	 
	 
	 
	 class TreeNode {
	     int val;
	      TreeNode left;
	     TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
}
 
