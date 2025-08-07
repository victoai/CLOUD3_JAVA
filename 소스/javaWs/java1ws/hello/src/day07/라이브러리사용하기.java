package day07;

public class 라이브러리사용하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b;		
		a=5;
		b=3;
		
		
		if( a>b) {
			System.out.println(a+ "가 크다");
		}else {
			System.out.println( b +"가 크다");
		}	
		
		//자바가 제공하는 기능들... 사용  기능의 단위가 클래스입니다. 
		//자바는 무조건 클래스안에다 코드를 작성합니다.
		
		int result  =Math.max(a, b);
		System.out.println( result);
		
	}
	
	
	//함수만들기 

}
