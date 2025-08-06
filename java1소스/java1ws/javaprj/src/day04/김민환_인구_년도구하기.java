package day04;

public class 김민환_인구_년도구하기 {

	public static void main(String[] args) {
		 
		
		int i=1999;
		double H=2500000;
		double K  =1800000;
		
		while(  K <=H) {
			
			i=i+1;
			
			H = H * 1.036;   // H *= 1.036;
			K= K * 1.042;    // K += 1.042;
			 
		}
		
		System.out.println( i);
		

	}

}
