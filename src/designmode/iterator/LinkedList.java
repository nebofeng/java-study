
package designmode.iterator;
/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年3月7日 下午8:08:56
* 类说明
*/
public class LinkedList {
	Node head=null;
	Node tail=null;
	int size=0;
	
	public void add(Object o){
		Node n=new Node(o,null);
		if(head==null){
			head=n;
			tail=n;
		}
		tail.setNext(n);
		tail=n;
		size++;
	}
	
	public int size(){
		return size;
	}
}
