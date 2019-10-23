
package pers.nebo.leetcode;
/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年4月12日 下午12:52:43
* 类说明 : Given an input string, reverse the string word by word.

				For example,
				Given s = "the sky is blue",
				return "blue is sky the". 
*/
public class Reverse_Words_in_a_String {
	
	 public String reverseWords(String s) {	  
		 String string=s.trim();
	     return reverse(string,0).toString(); 
	 }

	/** 
	 * @Title: reverse 
	 * @Description: TODO
	 * @return: String
	 */
	private StringBuffer reverse(String string, int index) {
		StringBuffer cur=new StringBuffer();
		int lastIndex=index;
		while(index<string.length()&&string.charAt(index)!=' '){
			cur.append(string.charAt(index++));
		}
		while(index<string.length()&&string.charAt(index)==' '){
			index++;
		}
		if(lastIndex == 0){  
	        return reverse(string,index).append(cur);
		}
		return reverse(string,index).append(cur).append(' ');
	}
}
