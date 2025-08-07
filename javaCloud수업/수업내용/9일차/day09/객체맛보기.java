package week01.day10;

public class 객체맛보기 {

	public static void main(String[] args) {	
		//고객의 정보
		String name="장유나";
		String addr="인천";
		int age =30;	
		String hobby="공부";
		
		printInfo(name, addr, age , hobby);		
		
		
		//고객정보를 담을 수 있는 변수 생성하는 코드 
		Customer c = new Customer();
		//c변수는 참조형변수형입니다. 
		
		c.name="장유나";
		c.addr="인천";
		c.age=30;
		c.habby="공부";
		
		 	
		printInfo(c);
		
	}
	
	
	
	public static void printInfo(  String name, String addr , int age , String hobby) {		
		System.out.println( name);
		System.out.println( addr);
		System.out.println( age);
	}
	 
	public static void printInfo(Customer c) {
		System.out.println( c.name);
		System.out.println( c.addr);
		System.out.println( c.age);
		System.out.println( c.habby);
		
	}

}
