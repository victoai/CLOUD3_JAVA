package day16.exception.사용자예외.실습2;

public class MyLib {
	
	public boolean isAdult( int age) throws 미성년자예외 {
		
		boolean flag=true;
		 	
		if( age<  18  || age  >=0) {
			throw  new  미성년자예외();
		}
		return true;
	}

}
