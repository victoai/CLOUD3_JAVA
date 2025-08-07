package day07;

public class 변수_지역 {

	public static void main(String[] args) {
		 
		
		//지역변수 :  해당지역에서만 사용가능하다. (함수-매서드에서 만든 변수 )  - 스택영역
		
		//함수가시작되면 메모리 확보되고 
		//함수가 끝나면 메모리에서 제거됨
		
		//함수지역 (스코프) 
		//블럭지역 (스코트)
		 int su=0;		 
		 su= 수증가하기(su);
		 System.out.println( su);
		
		 
		 int number=0;		 
		 for(int i=1; i<=3; i++) {
			 int k=5;
			 System.out.println("하이");			 
			 number++;
		 }
		 
		 
		 for(int i=1; i<=3; i++) {
			 System.out.println("hi");
			 number++;
		 }
		 
		 System.out.println( number);
		// System.out.println( k);  불가능
		 
	}

	
	// 
	public static  int 수증가하기( int a) { // 매개변수 => 지역변수 
		a=a+1;
		return a;	
		
	}
}
