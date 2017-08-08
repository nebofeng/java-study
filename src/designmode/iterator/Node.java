
package designmode.iterator;
/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年3月7日 下午8:09:09
* 类说明
*/
public class Node {
	private Object data;
	private Node next;
	public Node(Object data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}
	public Object getData() {
		return data;
	}
	
	public Node getNext() {
		return next;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
}
