package day16.exception.unchecked;

public class 테스트 {

	public static void main(String[] args) {


		Object o  = new ArrayIndexOutOfBoundsException();
		Exception o2  = new ArrayIndexOutOfBoundsException("배열의 범위를 벗어남");
		
		
		
		System.out.println( o);
		System.out.println( o2.getMessage());
		
	}

}
