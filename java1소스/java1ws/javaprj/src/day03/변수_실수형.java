package day03;

public class 변수_실수형 {

	public static void main(String[] args) {
		 
		
		//float :4byte  : 소수이하 7자리
		//double :8byte  : 소수이하 15자리  ( 대표)
		
		
		// float f=  35.4;    // 오류발생  ( 35.4 는 double   저장됨,   
		                      // double 데이터가  더 작은 float 에 저장이 되지 않는 문제임 
		
		 //해결방안 , 아래 두 가지로 해결할 수 있다 		
		// 1 ) float f = 35.4f;
		// 2)) float f  = (float) 35.4 ; 
		
		double d = 35.4;
		
		
		
		
		System.out.println( d);

	}

}
