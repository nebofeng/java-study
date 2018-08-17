package com.nebo.exception_test;

public class Try_Exception {

	public static void main(String[] args) {

       btest();
	}

	static  void  atest(){
		while (true){
			try {
				try{
					System.out.println("a");
					int a = 2/0 ;
					System.out.println("b");
				}catch (Exception e){
					e.printStackTrace();
					System.out.println();

				}
			}catch(Exception E){
				E.printStackTrace();

			}


		}
	}
	static  void  btest(){
		while (true){
			try{
				try{
					System.out.println("a");
					ctest();
					System.out.println("b");
				}catch (Exception e){
					e.printStackTrace();
					System.out.println("aaaaaaaaaaaaaaaaaaaaaa");

				}
			}catch (Exception e){
				e.printStackTrace();
				System.out.println("aaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbb");
			}
		  	System.out.println("bbbbbbbbbbbbbbbbbbbbb");


		}
	}

	static void ctest() throws  Exception {
		int a = 2/0 ;
	}
}
