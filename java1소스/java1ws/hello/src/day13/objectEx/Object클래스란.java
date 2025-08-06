package day13.objectEx;

public class Object클래스란 {

	public static void main(String[] args) {
		 
		
		//toString()
		//equals()
		
		
		
		//모든클래스는 Object클래스를 상속받게 되어 있다
		//최상위부모 역할을 함 
		
		// 모든 클래스는  Object로 다뤄질 수 있다 
		
		 Object o  = new A();
		 Object o2 = new B();
		 
		 
		 System.out.println( o);
		 System.out.println( o2);
		 
		 //toString매서드 호출됨 
		 
		 
		 
		 //우리는 toString() 오버라이드 해야함 
		 //우리는 필요에 따라  equals를 오버라이드 해야함
		 

	}

}
