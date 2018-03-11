package base_java.proxy;
/**
 * 
 * @author *** nebo
 * @date   *** 2018年3月11日
 * @email  *** nebofeng@gmail.com
 * @des    ***
 */
public class DoProxy implements IDo{
    //这个缺点在于 。代理内部的代理类是写死的。
	private IDo dothing;
	public DoProxy(IDo dothing){
	  this.dothing=dothing; 
   }
	@Override
	public void doThing() {
		System.out.println("before base things"); 
		dothing.doThing();
		System.out.println("end   base things");
	}

	 
}
