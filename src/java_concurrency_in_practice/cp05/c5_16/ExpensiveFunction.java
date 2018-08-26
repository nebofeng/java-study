
package java-concurrency_in_practice.cp05.c5_16;

import java.math.BigInteger;

/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年3月6日 下午4:01:06
* 类说明
 * @param <A>
 * @param <V>
*/
public class ExpensiveFunction  implements Computable<String , BigInteger>{

	
	@Override
	public BigInteger compute(String arg)  {
		//在经过长时间的运算后
		return new BigInteger(arg);
	}
	
}
