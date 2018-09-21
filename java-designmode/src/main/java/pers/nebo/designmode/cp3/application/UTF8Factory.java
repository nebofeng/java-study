
package pers.nebo.designmode.cp3.application;
/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年1月24日 下午11:37:45
* 类说明
*/
public class UTF8Factory extends AbstractFactory{

	
	public IRead create() {
		return new UTF8Read();
	}
}
