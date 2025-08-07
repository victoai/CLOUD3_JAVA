package day20.비동기.실습;

public class Ex05 {

	public static void main(String[] args) {
		 
		
		
		/*
		for( int i=1; i<1000 ; i++) {
			System.out.println( " ^^");
		}
		*/
		
		Thread t1 = new Thread(  new Runnable() {

			@Override
			public void run() {
			 
				
				for( int i=1; i<1000 ; i++) {
					System.out.println( " ^^");
				}
				
			}});
		t1.start();
		
		
		
		/*
		for( int i=1; i<1000 ; i++) {
			System.out.println( " ^______^");
		}
		*/
		Thread t2 = new Thread( new Runnable( ) {

			@Override
			public void run() {
				for( int i=1; i<1000 ; i++) {
					System.out.println( " ^______^");
				}
				
			}});
		t2.start();
		
		 
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("프로그램종료");

	}

}
