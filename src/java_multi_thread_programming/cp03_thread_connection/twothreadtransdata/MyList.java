package java-multi_thread_programming.cp03_thread_connection.twothreadtransdata;

import java.util.ArrayList;
import java.util.List;

public class MyList {
	
	private List list=new ArrayList();
	
	public void add() {
		list.add("宁波");
	}
	public int size() {
		return list.size();
	}

}
