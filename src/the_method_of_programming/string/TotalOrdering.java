
package the_method_of_programming.string;
/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年4月9日 下午1:54:16
* 类说明:total ordering of string 字符串的全排列
*/
public class TotalOrdering {
	
	static void totalordering(char[] string  , int from ,int to ){
		if(to<=1){
			return ;
		}
		if(from==to){
			for(int i=0;i<=to;i++){
				System.out.print(string[i]);
			}
			System.out.print("\n");

		}
		else{
			for(int j=from;j<=to;j++){
				swap(string,j,from);
				totalordering(string ,from+1,to);
				swap(string,j,from);
			}
		}
	}

	/** 
	 * @Title: swap 
	 * @Description: 交换位置
	 * @return: void
	 */
	private static void swap(char[] string, int j, int to) {
		char tmp=string[j];
		string[j]=string[to];
		string[to]= tmp;
		
		
	}
	
	public static void main(String [] args){
		
		char[] string={'a','b','c','d'};
		totalordering(string ,0,3);
		
	}
}
