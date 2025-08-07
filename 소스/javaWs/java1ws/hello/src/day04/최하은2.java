package day04;

public class 최하은2 {

	public static void main(String[] args) {
		 
		
		double sum=0 ;
	 
		
		//
		 int  분모=1;
	 
		 double  항;
		 int sw=1;
		 
		
		for( int i=1; i<=10; i++) {
			
			
			분모 *= i;
			
			항  = i/(double) 분모;
			
			항 = 항*sw;
			
			
			sw = -sw;			
			
			sum +=  항;
			
			System.out.println(sum);
			
			
		}
		
		
		
		
		
		System.out.printf( "%.2f", sum);
		
		
		
		
		 

	}

}
