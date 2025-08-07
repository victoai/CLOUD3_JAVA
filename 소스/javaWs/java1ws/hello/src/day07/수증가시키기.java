package day07;


public class 수증가시키기 {

	
	//클래스를 실행하려면 main함수가 필요함 
	public static void main(String[] args) {
		//변수선언 
		//함수안에서 변수를 선언하면 이 함수안에서만 사용할 수 있다.
		 int su=0 ;	 
		 su = su+1;	 		 
		 System.out.println(  su );				 
		 
		 su= su+1;
		 System.out.println( su);		 
		 //
		 수증가하기1(su);
		 System.out.println( su);		
		 
		 //su변수의 값을 변화시켜야 함 !!
		 su =수증가하기2(su);		 
		 System.out.println( su);
	}
	
	//수를 증가시키는 함수 만들기
	public static void 수증가하기1( int num ) {	
		 System.out.println( "수증가하기1에서 num=" + num);
		 num++; // num= num +1;		 
	}
	
	//수를 증가시키는 함수 만들기
	public static int 수증가하기2( int num ) {	
		// System.out.println( num);
		num++; // num= num +1; 
		
		//dfkdfkdfkdfjd
		//dfdflddfldfldfdf
		
	    return num;
	}

}
