
package  book.java_concurrency_in_practice.cp05.c5_16;



import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年3月6日 下午4:30:50
* 类说明
*/
public class Memoizer3<A, V> implements  book.java_concurrency_in_practice.cp05.c5_16.Computable<A,V> {

	private final Map<A,Future<V>> cache=new ConcurrentHashMap<A,Future<V>>();
	private final  book.java_concurrency_in_practice.cp05.c5_16.Computable<A,V> c;
	
	
	public Memoizer3( book.java_concurrency_in_practice.cp05.c5_16.Computable<A,V> c) {
		this.c=c;
	}
	public V compute(final A arg) throws InterruptedException {
		Future<V> f=cache.get(arg);
		if(f==null){
			Callable<V> eval=new Callable<V>(){
				
				public V call() throws InterruptedException  {
					return c.compute(arg);
				}
			};
		
		FutureTask<V> ft=new FutureTask<V> (eval);
		f=ft;
		cache.put(arg, ft);
		ft.run();//在这里将要调用c.compute
	   }
//	   try{
//		    return f.get();
//	   }catch(ExecutionException e){
//		   e.printStackTrace();
//	   }	
		try {
			return f.get();
		} catch (ExecutionException e) {
			throw new IllegalStateException() ;
		}
	}
}
