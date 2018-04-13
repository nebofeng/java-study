package base_java.czlianjia2018;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		HashSet hs=new HashSet<Integer>();
		for(int i=0;i<number;i++) {
			int count = s.nextInt();
			for(int j=0;j<count;j++) {
				int p=s.nextInt();
				hs.add(p);
			}
		}
		System.out.println(hs.size());
	}

}
