package regex;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo{
	public static void main(String[] args) {
		//checkQQ();
		//splitDemo("abc.ddd.dfdf", "\\.");
		//splitDemo("c:\\abc\\a.txt", "\\\\");
		//叠词
		//第一位任意字符。第二位重用。概念组 。（）
		//splitDemo("erkktyqquio", "(.)\\1");//按照叠词完成切割
		//为了可以让规则的结果被重用。可以将规则封装成组。用()完成，组的出现都有编号
//		//从1开始，想要使用已有的组可以通过\n (n就是组的编号)的形式来获取。
//		String str="wer1234444tyui123456dfsadfads";
//		//要求将字符串中的数字换为#
//		replaceAllDemo(str, "\\d{5,}", "#");
	//	 String str1="erkkmmggaefiasjdf788809";//将叠词替换成&
		// replaceAllDemo(str1, "(.)\\1+", "&");//+ 避免出现 多个&&
		//zzz-》z
		 //replaceAllDemo(str1, "(.)\\1+", "$1");
		 //tets_1();
		//ipSort();
		checkMail();
		
	}
	
	/**
	 * 对QQ号码进行校验
	 * 要求：5-15 . 0不能开头 。只能是数字  
	 */
	public static void checkQQ(){
		String qq="1234";
		int len=qq.length();
		if(len>=5 && len<=15){
			if(!qq.startsWith("0")){
				char[] arr=qq.toCharArray();
				boolean flag= true;
				for(int i=0;i<arr.length;i++){
					if(arr[i]>='0' && arr[i]<='9'){
						flag= false;
						break;
					}
				}
				if(flag){
					System.out.println("qq:"+qq);
				}else{
					System.out.println("非法字符");
				}
				
			}
		}else{
			System.out.println("长度错误");
		}
	}
	
	
	public static void checkQQ1(){
		String qq="";
		String regex="[1-9][0-9]{4,14}";
	    boolean flag= qq.matches(regex);
	    if(flag){
	    	
	    }else{
	    	
	    }
	} 
	
	public static void splitDemo(String string ,String reg){
		String[] arr=string.split(reg);
		System.out.println(arr.length);
		
	}
	
	
	public static void replaceAllDemo(String str ,String reg,String newStr){
		str=str.replaceAll(reg, newStr);
		System.out.println(str);
	}
	
	//正则表达式的第四个功能 。获取
		/*
		 * 操作步骤 
		 * 1.将正则表达式封装成为 对象
		 * 2.让正则对象和要操作的字符串相关
		 * 3.关联后获取正则匹配的引擎
		 * 4.通过引擎对符合规则的字串进行操作。比如取出
		 */
	
	public static void getDemo(){
		String str="aaa ddd dsaf fdsf fdsfa  wewe ";
		String reg="";
		//将规则封装成对象
		Pattern p= Pattern.compile(reg);
		//获取匹配器对象
		
		Matcher m=p.matcher(str);
		
	}
	
	
	/*
	 * 需求：
	 * 将下列字符串转成：我要学编程
	 * 1.如果只想知道字符是对是错 。用匹配
	 * 2.想要将已有的字符串变成另一个字符串，替换
	 * 3.想要按照自定的方式将字符串变成多个字符串。切割。获取规则以外的子串
	 * 4.想要拿到符合要求的字符串字串，获取，获取符合规则的字串。
	 * 
	 * */
	
	public static void tets_1() {
		String str="我我我我。。我。。。。。。要要要要要。。要。。。学学。学学。。编。编编编。程程程。程。程";
		//=>我要学编程
		String newstr =str.replaceAll(("\\。{1,}"), "");
		String newstr1 = newstr.replaceAll("(.)\\1+","$1");
		System.out.println(newstr1);
	}
	/**
	 * 将ip地址进行地址段顺序的排序
	 * 192.68.1.254 102.49.23.013 10.10.10.10 2.2.2.2 8.109.90.30
	 还按照字符串自然顺序 ，只要让它们每一段都是3位即可
	 1.按照每一段需要的最多的0进行补齐。那么每一段就会至少保证3位
	 2.将每一段只保留3位，这样，所有的ip地址都是每一段3位
	 */
	
	public static void ipSort() {
		String ip="192.68.1.254 102.49.23.013 10.10.10.10 2.2.2.2 8.109.90.30";
		ip=ip.replaceAll("(\\d+)", "00$1");
		System.out.println(ip);
		ip=ip.replaceAll("0*(\\d{3})", "$1");
		System.out.println(ip);
		String[] arr=ip.split(" ");
		TreeSet<String> ts=new TreeSet<String>();
		for(String s: arr) {
			ts.add(s);
		}
		for(String s: ts) {
			System.out.println(s.replaceAll("0*(\\d+)", "$1"));
		}
	}
	/**
	 * 
	 * check email 
	 *  
	 */
	public static void checkMail(){
		String mail="abc124@sina.com.cn";
		String reg="[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+){1,3}";//较为精确的匹配
		String reg1="\\w+@\\w+(\\.\\w+)+"; //相对不太精确的匹配
		System.out.println(mail.matches(reg));
		
	}
	/**
	 * 网页爬虫
	 * 获取指定文档中的邮件地址，获取功能
	 */
	 public static void getEmail() {
		 try {
			BufferedReader bufr=
					 new BufferedReader(new FileReader("mail.txt"));
			String line=null;
			String mailreg="\\w+@\\w+(\\.\\W+)+";
			Pattern p= Pattern.compile(mailreg);
			 
			while(((line=bufr.readLine())!=null)) {
				Matcher m= p.matcher(line);
				while(m.find()) {
					System.out.println(m.group());
				}
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException e) {
		}
	 }

}

 
