package day20.비동기.실습;

public class Ex06 {

	public static void main(String[] args) {		 
		
		Thread th1 = new Thread( new RunnableImpC());
		th1.start();
		
		Thread th2  = new Thread(new RunnableImpC());
		th2.start();
	}
 
	
}


//

class  RunnableImpC  implements  Runnable{

	@Override
	public void run() {
		 print();
	}

	private void print() {
		 
		Thread th  =Thread.currentThread();
		
		for( int i=1; i<=100; i++) {
			System.out.println(  "print"  +i);
			System.out.println(  th.getName() );
		}
		
		
		
	}
	
}