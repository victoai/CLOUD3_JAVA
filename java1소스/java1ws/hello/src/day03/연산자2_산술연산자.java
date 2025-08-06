package day03;

public class 연산자2_산술연산자 {

	public static void main(String[] args) {
		 
		
		int su1=10;
		int su2=3;
		
		
		//연산은 정수연산과 실수연산으로 수행된다.		
		System.out.println( su1+su2);
		System.out.println( su1-su2);
		System.out.println( su1*su2);
		
		//주의 !!  연산의 결과가 정수로 계산됨 
		//연산의 결과를 실수연산으로 수행하고 싶다면  double형을 형변환해서 사용할 수 있다. cast연산, 형변환 연산 이용
		System.out.println( su1 /su2);
		System.out.println( su1 /(double)su2);
		System.out.println( su1 % su2);
		 
	}

}
