
package designmode.chain_of_responsibility;

import java.util.ArrayList;
import java.util.List;

/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年3月7日 下午4:19:29
* 类说明
*/
public class FilterChain  implements Filter{
	List<Filter> filters=new ArrayList();
	
	public FilterChain addFilter(Filter f){
		this.filters.add(f);
		return this;
	}
	
	public String doFilter(String str){
		String r=str;
		for(Filter f:filters){
			r=f.doFilter(r);
		}
		return r;
	}
}
