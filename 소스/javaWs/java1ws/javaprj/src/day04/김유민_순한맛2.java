package day04;

public class 김유민_순한맛2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1    2       3        4 
		// 1  (1+2)  (1+2+3)  (1+2+3+4) ..... 100
		
		
		final int MAX=100;
		int sum =0;  //항
		int total =0;// 항의 누적 
		int num=0 ;   //항의 순번 
		
		while(num <= MAX ) {
			
			num=num+1;
			
			//항 구하기
			sum = sum +num;
			
			System.out.print( sum +",");
			
			//항의 누적하기
			total = total+ sum;
						 
			
		}
		
		System.out.println( total);
		
		
		

	}

}
