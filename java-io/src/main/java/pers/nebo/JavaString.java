package pers.nebo;

public class JavaString {

	public static void main(String[] args) {


		String data  = " ";
		data ="fdaf";
		int id =1;
		switch(id){
			case 1:
				data="new data";
		}
		String str="dfaf";
		String newdata =str;
		new Thread(()->new JavaString().test(newdata)).start();
		new Thread(){
			@Override
			public void run() {
				new JavaString().test(newdata);
//				new JavaString().test(data);
			}
		}.start();



		System.out.printf(data);
	}

	void test(String data){
		System.out.print(data);
	}
}
