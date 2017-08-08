
package java_concurrency_in_practice.cp05.c5_16;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年3月6日 下午4:13:49
* 类说明
*/
public class Memoizer2<A, V> implements Computable<A,V>{

	private final Map<A,V> cache=new ConcurrentHashMap<>();
	private final Computable<A,V> c;
	
	
	public Memoizer2(Computable<A,V> c) {
		this.c=c;
	}
	public V compute(A arg) throws InterruptedException {
		V result=cache.get(arg);
		if(result==null){
			result=c.compute(arg);
			cache.put(arg, result);
		}
		return result;
	}
}
