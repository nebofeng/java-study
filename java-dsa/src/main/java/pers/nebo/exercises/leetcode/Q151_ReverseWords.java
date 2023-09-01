
package pers.nebo.exercises.leetcode;

import java.util.Arrays;
import java.util.Collections;

/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年4月12日 下午12:52:43
* 类说明 : Given an input string, reverse the string word by word.

				For example,
				Given s = "the sky is blue",
				return "blue is sky the".
*/
public class Q151_ReverseWords {
	public static void main(String[] args) {
		String[] tmp={""};
		int a=tmp.length;
	}
	 public String reverseWords(String s) {
		 String string=s.trim();
	     return reverse(string,0).toString();
	 }

	public String reverseWords_2(String s) {
		String string=s.trim();
		String[] words=string.split("\\s+");
		Collections.reverse(Arrays.asList(words));
		return  String.join(" ",words);
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
