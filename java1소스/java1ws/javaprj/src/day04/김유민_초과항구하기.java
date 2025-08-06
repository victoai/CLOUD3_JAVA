package day04;

public class 김유민_초과항구하기 {

	public static void main(String[] args) {
		 
		
		// 1   3   5    7   9
		int n=0;
		int sum=0; 
		int k=0;
		final int MAX=20;   // 1000
		
		
		while( sum  <= MAX) {
			
			n=n+1;            //1  2  3
			k= 2*n -1;        //1  3  5
			sum  = sum  + k;  //1  4  9
			
		}
		
		
		System.out.println(  k  +"==>"+ sum);

	}

}
