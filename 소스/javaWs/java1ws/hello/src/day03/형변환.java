package day03;

public class 형변환 {

	public static void main(String[] args) {		 
		
		// 형 ,  type,  자료형
		// 형변환  (type을 변환하는 것)
		// 자동형변환( 묵시적, 암묵적)
		// 강제형변환( 명시적)	
		
		byte b = 127;
		int result ;		
		result = b;   //     int    <=    byte     byte형으로 int형 형변환이 이루어짐 
		
		System.out.println(  result);
				
		
		//강제형변환 
		float f  =35.4f;    
		double d  =35.4;  
		
		float result2  ;
		result2 =  (float) d;   // 강제형변환  (작은타입변수)변수  , => 일시적이다 (일시적으로 형이 변환되는것이다)		
		
		
		//형변환		
		//큰변수  = 작은변수                ( 큰변수형으로 자동형변환 됨)    맥주컵  = 소주컵   
		//작은변수  = (작은변수type)  큰변수  ( 일시적으로 형을 변환하여 사용 : 강제형변환 , 명시적형변환 ) 소수컵 = 맥주컵  
		                                                                         //강제형변환이 필요함   
		                                //데이터 손실이 발생함
		
		
		
		
		
		
	}

}


 
