package day14.라이브러리;



public class MyLib1 {
	
   //별3번 출력하기 
	public void printStar() {
		System.out.println("***");
	}
	
	
	//원하는 문자를 세번 출력하기
	public void printChar( char ch) {
		
		 for( int i=1 ; i<=3 ; i++) {
			 System.out.print(ch);
		 }
	}
	
	
	//원하는 코드를 세번 실행하기 
	//라이브러리를 만들 때 결정할 수 없는 코드가 생긴다
	//결정할 수 없는 코드  =>  인터페이스로 만든다 . 
	// (인터페이스를 활용함)
	
	public void  세번실행하기(   MyRun code  ) {
		
		for( int i=1 ; i<=3; i++) {
			code.run();
		}
		
	}
	
	
	

}
