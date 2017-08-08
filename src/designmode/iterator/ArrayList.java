
package designmode.iterator;
/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年3月7日 下午7:12:31
* 类说明
*/
public class ArrayList {
	Object[] objects=new Object[10];
	int index=0;
	public void add(Object o){
		if(index==objects.length){
			Object[] newObjects=new Object[objects.length*2];
			System.arraycopy(objects, 0, newObjects, 0, objects.length);
			objects=newObjects;
		}
		objects[index]=o;
		index++;
	}
	
	public int size(){
		return index;
	}
}
