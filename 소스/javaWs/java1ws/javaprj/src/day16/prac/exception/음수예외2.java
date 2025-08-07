package day16.prac.exception;


// unchekced Exception을 만들고 싶다면 
// RuntimeException을 상속받자 
public class 음수예외2   extends RuntimeException {

	public 음수예외2() {
		// TODO Auto-generated constructor stub
	}
	

	public 음수예외2( String message) {
		// TODO Auto-generated constructor stub
		super(message);
		
	}
}
