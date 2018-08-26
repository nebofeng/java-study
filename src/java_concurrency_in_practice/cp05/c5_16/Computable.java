
package java-concurrency_in_practice.cp05.c5_16;
/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年3月6日 下午4:01:32
* 类说明
*/
public interface Computable<A,V>{
	V compute(A arg) throws InterruptedException;
}
