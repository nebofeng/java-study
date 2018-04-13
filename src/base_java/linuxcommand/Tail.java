package base_java.linuxcommand;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Tail {
	public static void main(String[] args) throws Exception {
		String srcFilename = "G:\\tmp\\1.txt";  
		String charset = "GBK";  
		File file = new File(srcFilename);  
		InputStream fileInputStream = new FileInputStream(srcFilename);  
		//fileInputStream.skip(1); // skip n bytes if needed, filesystem may position to the offset directly but not read really.  
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream, charset));  
		String singleLine;  
		long fileSize = file.length();  
		while (true) {  
		    try {  
		        if ((singleLine = bufferedReader.readLine()) != null) {  
		            System.out.println(singleLine);  
		            fileSize = Math.max(file.length(), fileSize);  
		            continue;  
		        }  
		    } catch (IOException e) { // 文件被清空的时候FileInputStream会被close  
		        bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(srcFilename), charset));  
		        fileSize = file.length();  
		    }  
		  
		  
		    try {  
		        if (file.length() < fileSize) { // 文件被清空了  
		            bufferedReader.close();  
		            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(srcFilename), charset));  
		            fileSize = file.length();  
		        }  
		        Thread.sleep(1000L);  
		    } catch (InterruptedException e) {  
		        Thread.currentThread().interrupt();  
		        bufferedReader.close();  
		        break;  
		    }  
		}  
	}

}
