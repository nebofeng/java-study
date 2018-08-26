package java-concurrency_in_practice.cp05.c5_16;

import java.util.HashMap;
import java.util.Map;

/**
 * @author nebo
 * @E-mail:nebofeng@gmail.com
 * @version creatTime：2017年3月6日 下午4:06:19 类说明
 */
public class Memoizer1<A, V> implements Computable<A, V> {
	private final Map<A, V>			cache	= new HashMap<A, V>();
	private final Computable<A, V>	c;

	public Memoizer1(Computable<A, V> c) {
		this.c = c;
	}
	
	public synchronized V compute(A arg) throws InterruptedException {
		V result=cache.get(arg);
		if(result==null){
			result=c.compute(arg);
			cache.put(arg, result);
		}
		return result;
	}
}
