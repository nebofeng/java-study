
package pers.nebo.designmode.cp3.application.version2;

import java.io.File;
import java.io.FileInputStream;

/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年2月11日 上午10:55:44
* 类说明
*/
public class TextRead implements IRead<String>{//读文本文件

	public String read(String... in) {//可输入0或多个参数
		String result=null;//result是结果串
		try{
			File file=new File(in[0]);//in[0]表示文件名
			long len =file.length();
			FileInputStream input=new FileInputStream(in[0]);
			byte buf[]=new byte[(int)len];//缓冲区大小等于文件长度
			input.read(buf);//一次读完文件
			result=new String(buf,in[1]);//按照in[1]的编码方式转换成可见字符串
			input.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return result;
	}
}
