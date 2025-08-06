package day20.비동기.실습;


// Runnable 인터페이스를 구현하는 방법으로 스레드 만들기 ( 별도의 흐름  시작 ~ 끝)
// Runnable 인터페이스를 익명클래스로 구현하는 방법
public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		for( int i=1 ; i<  1000 ; i++) {
			System.out.println(" hi");
		}
		
		*/
		
	
	    //스레드 객체 만들기
		//Thread  t = new Thread(  new  Runnable() {} );   //  new  익명클래스 작성   ( 작성한 익명클래스로 객체생성하기)
		
		 Thread  t = new Thread(  new  Runnable() {

			@Override
			public void run() {
				for( int i=1 ; i<  1000 ; i++) {
					System.out.println(" hi");
				}
				
			}} );
		
		//스레드 실행하기  ( run 매서드 호출하면 별도의 흐름으로 만들어지지 않는다)
		t.start();   
		
		
		/*
		for( int i=1 ; i<1000 ; i++) {
			
			System.out.println("bye");
		}

		 */
		
		
	  Thread t2 = new  Thread(  new  Runnable() {

		@Override
		public void run() {
			for( int i=1 ; i<1000 ; i++) {
				
				System.out.println("bye");
			}  
			
		}});
	  t2.start();
	}

}



