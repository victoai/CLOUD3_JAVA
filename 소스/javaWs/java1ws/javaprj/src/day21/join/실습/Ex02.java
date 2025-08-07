package day21.join.실습;

public class Ex02 {

	public static void main(String[] args) {
		
		
		A a = new A();
		B b = new B();
		
		a.start();
		b.start();
		
		
		// 메인스레드의 작업이 진행		
		 /*
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		 
		*/		
		
		try {
			a.join();   //a 쓰레드의 작업이 완료될 때까지 기다라기
			b.join();	//b  쓰레드의 작업이 완료될 때까지 기다라기		 
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		int total=0;
		total = a.getSum() + b.getSum();
		
		
		System.out.println(" 프로그램 종료"  +  total); 

	}

}
;