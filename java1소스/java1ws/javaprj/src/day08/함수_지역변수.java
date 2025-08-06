package day08;

public class 함수_지역변수 {

	public static void main(String[] args) {
		
		 int sum;
		 
		 int a=10;
		 int b=20;
		 
		 //sum=  a+b;
		 //System.out.println(sum);
		 
		 sum  =adder(a, b);
		 System.out.println(sum); 
		 

	}
	
	
	
	//
	//기능: 두수합의 구하기
	//입력(매개변수 ) :   두 수 
	//반환: 두 수의 덧한 값 
	
	//지역변수 :함수안에서 만들어지는 변수를 지역변수라고 한다 
	//지역변수 :함수호출시에 만들어지고 함수가 반환될 때 모두 정리된다 ( 스택영역에 할당됨) 
	//함수안에서 만든 변수는 그 함수안에서만 사용가능하다 
	
	public static  int  adder(int num1, int num2) {  //매개변수  => 지역변수 (함수가 호출되면 만들어짐)
		 
		int sum;
		sum  = num1+ num2;
		return sum ;		
	}

}
