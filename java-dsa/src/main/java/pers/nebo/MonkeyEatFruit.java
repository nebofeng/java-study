
package pers.nebo;

import org.junit.Test;

/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年3月15日 下午9:02:33
* 类说明
*/
public class MonkeyEatFruit {
	
	public int eat01(int n){
		int a=1;
		for(int i=2;i<=n;i++){
			a=a*2+2;
		}
		return a;		
	}
	
	public int eat02(int n){
		System.out.println(n+"压入");
		if(n==1){
			System.out.println("函数栈达到最大深度。");
			System.out.println(n+"弹出");
			return 1;
		}else{
			System.out.println(n+"压入");

			return eat02(n-1)*2+2;
		}
		
			
	}
	
	
	@Test
	public void testo1(){
		int n=10;
	
		int result=eat01(n);
		System.out.println(result);
	}
	@Test
	public void testo2(){
		int n=10;
	
		int result=eat02(n);
		System.out.println(result);
	}
}
