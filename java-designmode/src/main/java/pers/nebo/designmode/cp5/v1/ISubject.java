
package pers.nebo.designmode.cp5.v1;
/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年2月12日 下午4:53:23
* 类说明:主题接口
*/
public interface  ISubject {
	public void register(IObserver obs);//注册观察者
	public void unregister(IObserver obs);//撤销观察者
	public void notifyObservers();
	
}
