package day16.prac.exception;


//Exception 을 상속받으면   => checked Exception   ( !!) 

//RuntimeException 을 상속받은면   => unchecked Exception



public class 음수예외 extends Exception {	  // 이 예외는  checked Exception 이 된다 

	//생성자
	
	public 음수예외() {
		// TODO Auto-generated constructor stub
	}
	//매개변수 있는  생성자 	
	public 음수예외( String message) {
		 super( message);
	}

}
