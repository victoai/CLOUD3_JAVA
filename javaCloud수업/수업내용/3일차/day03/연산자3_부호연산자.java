package day03;

public class 연산자3_부호연산자 {

	public static void main(String[] args) {
		 
		
	 
		//증감연산자 ++  , --   전위, 후위연산자	
		
		int c=10;
		int d=10;		
		System.out.println( c++);    //  
		System.out.println( ++d); 

		int e=20;
		int f=20;			
		int result1;
		int result2 ;		
		
		result1 =  --e;
		result2 =  f--;		
		
		System.out.println( e);
		System.out.println( f);	

		System.out.println( result1);
		System.out.println( result2);
		
		int result3  =  ++c  + d-- + e++ + --f;   //
		
		 
	}

}
