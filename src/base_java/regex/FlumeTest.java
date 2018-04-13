package base_java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FlumeTest {
	
	public static void main(String[] args) {
		String basename= "web3.log.2017-10-13" ;
		Pattern p = Pattern.compile("(.*)\\.(.*)\\.(.*)",Pattern.DOTALL);		
		if((basename.length()>0)) {			
			Matcher m = p.matcher(basename);			
			if(m.find()) {
				String type = m.group(1).toString().trim();
				String filename = m.group(3).toString().trim();
				System.out.println("type==="+type);				 
			}else {
				System.out.println("----");
			}
		}else {
			System.out.println("+++++++");
		}
	}
	

}
