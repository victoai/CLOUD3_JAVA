package day16.exception.사용자예외.실습2;

public class MyLibMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		 
		
 
			
		MyLib b = new MyLib();
		try {
			b.isAdult(35);
		} catch (미성년자예외 e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//sdfdf
			 
		}
	 
		
		System.out.println( "프로그램 종료");

	}
	
	
	 

}
