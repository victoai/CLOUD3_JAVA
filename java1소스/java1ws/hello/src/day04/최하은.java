package day04;

public class 최하은 {

	public static void main(String[] args) {
		 
		
		double sum ;
		int 분자odd=1;
		int 분모odd  ;
		double oddSum=1;
		
		
		int 분자even=2;
		int 분모even ;
		double evenSum=1;
		
		
		
		while( 분자even <=10) {
			
			분자odd += 2;
			분자even +=2;
			
			
			//
			분모odd=1;
			분모even=1;
			
			for( int i=1; i<=분자odd;i++) {
				분모odd *=i;
			}
			
			
			for( int i=1; i<=분자even;i++) {
				분모even *=i;
			}
			
			
			oddSum += 분자odd/ (double)분모odd;
			evenSum += 분자even/ (double)분모even;
			
			System.out.println( oddSum);
			System.out.println( evenSum);
			
			
			
			 
		}
		
		sum = oddSum  - evenSum;
		System.out.println( sum);

		System.out.printf( "%.2f", sum);

	}

}
