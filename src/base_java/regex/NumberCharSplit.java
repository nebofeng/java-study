package base_java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * 将数字+字母组合的数字字母分开
 * @author NeboFeng
 *
 */
public class NumberCharSplit {
	
	public static void main(String[] args) {
	
		String str="2345dfghjk45678dfghjrtyui6y74567uj";
	 
 		String regex= "\\d+|[a-zA-Z]+";
 		Pattern p =Pattern.compile(regex);
 		Matcher m=p.matcher(str);
 		
 		while(m.find()) {
 			System.out.println(m.group().toString());
 		}
//		for(int i=0;i<str1.length;i++) {
//			System.out.println(str1[i]);
//		}
	}
	
	

}
