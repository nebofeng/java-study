package pers.nebo.designmode.chain_of_responsibility;

/**
 * @author nebo
 * @E-mail:nebofeng@gmail.com
 * @version creatTime：2017年3月7日 下午3:49:27 类说明
 */
public class Main {
	public static void main(String[] args) {
		String msg = "大家好，<script>";
		MsgProcessor mp = new MsgProcessor();
		mp.setMsg(msg);
		FilterChain fc = new FilterChain();
//		fc.addFilter(f);
		
		mp.setFc(fc);
		String result = mp.process();
		System.out.println(result);
	}
}
