package day07;

public class 함수예제1 {

	public static void main(String[] args) {	
		 
		int age=12;   //  ( 업무 : 10세 미만  , 어린이 기준나이 )
		int price =10000;		
		//어린이판단  , 어린이인 경우 50% 할인 		
		if( age < 10) {
			System.out.println("어린이 할인 적용");
			System.out.println( price *0.5);
		}else {
			System.out.println( price  );
		} 
		/////
		
		
		age=9;		
		boolean result  =어린이판단(age);
		//	if( result ==true) {
		System.out.println ("결과 ==>"+  result);
		
		if( result) {
			System.out.println("어린이 할인적용  !!!!!");
			System.out.println( price *0.5);
		}else {
			System.out.println( price  );
		}		
	}
	
	
	////// 어린이 판단 기능이 있는 함수 작성
	public static boolean  어린이판단( int age) {		
		if( age <10) {
			return true;   // 어린이 이다
		}else {
			return false;  //아니다
		}			
	}
	

}
