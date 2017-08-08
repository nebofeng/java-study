
package think_in_java.cp_10;
/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年1月25日 下午12:24:56
* 类说明:显示文件列表
*/
import java.io.*;
public class DirList {
	public static void main(String [] args){
		try{
		File path=new File(".");
		String[] list;
		 System.out.println(path.isDirectory());
	         System.out.println(path.getAbsolutePath().toString()+"--");
			if(args.length==0){
				list=path.list();
			}else{
				
				list=path.list(new DirFilter(args[0]));
			}
		      for(int i = 0; i < list.length; i++)
		          System.out.println(list[i]);
		}catch(Exception e){
			e.printStackTrace();
		}	
    }
	
}
	class DirFilter implements FilenameFilter{
		String afn;
		
	    DirFilter(String afn) {
	    	this.afn=afn;
		}
		
		public boolean accept(File dir, String name) {
			String f=new File(name).getName();
			return f.indexOf(afn)!=-1;
		}
		
	}
	
	
