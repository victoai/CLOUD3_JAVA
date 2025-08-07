package day16.exception.사용자예외.실습;

//필수예외가 되는 법
//Exception 상속 

public class NegativeNumberException  extends Exception{

	public NegativeNumberException() {
		 
		 super( "음수안돼 !!");
		
	}
}
