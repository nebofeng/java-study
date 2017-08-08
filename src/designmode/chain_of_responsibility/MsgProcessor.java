
package designmode.chain_of_responsibility;
/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年3月7日 下午3:51:32
* 类说明
*/
public class MsgProcessor {
	public String msg;
	FilterChain fc;
	
	public FilterChain getFc() {
		return fc;
	}

	public void setFc(FilterChain fc) {
		this.fc = fc;
	}

	public String process(){
		
		return fc.doFilter(msg);
	}
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
}
