package day21.데몬.실습;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		MyDaemon d = new MyDaemon();		
		d.start();		
		*/
		
		//데몬쓰레드로 만들기
		
		MyDaemon d  = new MyDaemon();
		d.setDaemon(true );  // 데몬쓰레드로 설정 ( 데몬쓰레드가 됨)
		d.start(); 
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		System.out.println("프로그램종료");

	}

}



class MyDaemon extends Thread{
	@Override
	public void run() {		 
		
		for( int i=1; i<=10 ; i++) {
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println( i);
		}
	}
}
