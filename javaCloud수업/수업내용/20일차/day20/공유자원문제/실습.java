package day20.공유자원문제;


class 공유자원{

	int sum=0;              // 1  2  3
	
	//public  synchronized void 증가하기() {
		
	
	public    void 증가하기() {
		
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sum++;		
		System.out.println(  Thread.currentThread().getName()   + sum);
		
	}
	
	
	public void print() {
		System.out.println( sum);
	}
	
}


public class 실습 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		공유자원 자원  = new 공유자원();
		
		Runnable r  = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				자원.증가하기();
				
			}};
			
			
	
			
		//
		Thread th1  = new Thread( r);
		Thread th2 = new Thread( r);
		Thread th3  = new Thread( r);
		
		th1.start();
		th2.start();
		th3.start();
		
		
		try {
			th1.join();
			th2.join();
			th3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		자원.print();
		
		

	}

}


/*

Thread-12
Thread-01
Thread-23
3

*/