package day03;

public class 변수 {

	public static void main(String[] args) { 		
		
		//변수  : 값을 저장하기 위한 메모리 공간 (일정량의 바이트를 가진다)	
		//자료형은 크기와 해석의 정보를 가지고 있다 
		
		
		int a =10;         // 4byte  , + , -21억 , 정수데이터
		double b =253.23;  // 8byte, 실수형데이터를 저장  , 소수이하 15자리 정밀도 
		boolean c =true;   // 1byte, 참/ 거짓 데이터를 저 장
		char d= 'J';  //  ' ', 한 문자 저장 , 'a', '한'
		
		//문자열은 문자집합이다 !		
		//자바는 문자열을 위한 클래스를 제공한다 
		
		String s ="hello java";  	
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(s);		 

	}

}
