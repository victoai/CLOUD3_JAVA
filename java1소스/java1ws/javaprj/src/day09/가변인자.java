package day09;

public class 가변인자 {

	public static void main(String[] args) {
		 
		print( 3,5,9);
		print( 3,5 );
		

	}
	
	
	public static void print( int... list ) {
	
		for( int a : list) {
			System.out.println( a);
		}
	}

}
