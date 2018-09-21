
package pers.nebo.designmode.cp3.simplefactory;
/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年1月22日 下午9:16:58
* 类说明：简单工厂
*/
public class CarSimpleFactory {
	
	public static final String TOPTYPE="toptype";
	public static final String MIDTYPE="midtype";
	public static final String LOWTYPE="lowtype";
	
	public static ICar create (String mark){
		ICar obj=null;
		if(mark.equals(TOPTYPE)){
			obj=new TopCar();
		}else if(mark.equals(MIDTYPE)){
			obj=new MidCar();
		}else if(mark.equals(LOWTYPE)){
			obj=new LowCar();
		}
		return obj;
	}
	

	
	
}
