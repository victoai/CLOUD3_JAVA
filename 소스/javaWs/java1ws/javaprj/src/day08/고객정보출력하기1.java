package day08;

public class 고객정보출력하기1 {

	
	
	public static void main(String[] args) {
		
		
		//3개의 항목은  한 사람의 고객정보이다  
		
		String name="홍길동";
		String address="서울시 노원구";
		int age=25 ;
		
		/*
		System.out.println( name);
		System.out.println( address);
		System.out.println( age);
		*/
	
		printInfo( name, address, age);

	}
	
	
	//고객정보 출력하기
	
	public static void  printInfo(String name, String address,  int age) {
		System.out.println( name);
		System.out.println( address);
		System.out.println( age);
	}
	
	
	

}
