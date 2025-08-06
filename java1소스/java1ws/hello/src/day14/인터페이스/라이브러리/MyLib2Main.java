package day14.인터페이스.라이브러리;

public class MyLib2Main {

	public static void main(String[] args) {
		 
		
		
		MyLib2 lib = new MyLib2();
		lib.코드2번실행하기(new MyRunnable() {

			@Override
			public void run() {

				System.out.println("하이");
				
			}});
		
		
		
		MyLib2 lib2 = new MyLib2();
		lib2.코드2번실행하기( new WJY());

	}

}
