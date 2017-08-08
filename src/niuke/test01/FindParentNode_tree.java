
package niuke.test01;
/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年3月29日 下午4:25:12
* 类说明:返回给定的两个节点的最近父类。
*/
public class FindParentNode_tree {
	
	public static Node findParentNode(Node root ,Node mode1,Node mode2){
		
       if(root==null||root==mode1||root==mode2){
			return root;
		}
       
       Node node_left=findParentNode(root.leftChild, mode1, mode2);
       Node node_right=findParentNode(root.rightChild, mode1, mode2);
       
      
       if (node_left != null && node_right != null) return root;  
       
       return node_left!=null ? node_left : node_right; 
       
 		
	}
	
	class Node{
		public int value;
		public Node leftChild;
		public Node rightChild;
		
		public  Node(int value){
			this.value=value;			
		}
		
		public  Node(int value ,Node left,Node right){
			this.value=value;
			this.leftChild=left;
			this.rightChild=right;
		}
		

		public Node getLeftChild() {
			return leftChild;
		}

		public Node getRightChild() {
			return rightChild;
		}

		public void setLeftChild(Node leftChild) {
			this.leftChild = leftChild;
		}

		public void setRightChild(Node rightChild) {
			this.rightChild = rightChild;
		}
		
	}
	
}
