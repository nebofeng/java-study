package base_java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GetBeforeNumResex {
	
	public static void main(String[] args) {
		String string ="31-32层";
		   String regex = "\\d+(?=-|至)";
		   String regex1="(\\d+).*";
		   Pattern p =Pattern.compile(regex1);
		   
		   Matcher m = p.matcher(string);
		   if(m.find()) {
			   System.out.println(m.group(1).toString());
		   }
		   
	}
   

}
