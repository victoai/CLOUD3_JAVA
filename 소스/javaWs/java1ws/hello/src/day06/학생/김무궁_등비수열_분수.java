package day06.학생;

public class 김무궁_등비수열_분수 {

	public static void main(String[] args) {
		 
		
		int N=1;
		long p1=1;
		long p2=1;
		long  q1=1;
		long  q2=1;
		double sum2=1; 
		double sum1=0;
		double sum3;
		
		
		while( N< 10) {
			 N=N+1;
			 if( N %2 ==0) {
				 p1= N*(N-1);
				 p2=p2*p1;
				 
				 System.out.println("분자" +N  + "분모=>" + p2);
				 
				 sum1 += N/(double)p2;				 
			 }else {
				 q1 = N* (N-1);
				 q2  = q2 *q1;
				 
				 System.out.println("분자" +N  + "분모=>" +q2);
				 
				 sum2 +=  N /(double)q2;				 
			 }			
		}
		
		sum3= sum1-sum2;
		System.out.println( sum3);
		
		

	}

}
