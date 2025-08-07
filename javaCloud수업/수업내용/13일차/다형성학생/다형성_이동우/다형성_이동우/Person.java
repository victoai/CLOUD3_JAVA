package day13.다형성.실습1;

public class Person {

	String name;
	
	
	public Person() {
		
	}
	
	public Person(String name) {
		this.name = name;
		
	}

	public void personInfo() {
		System.out.println("사람들은 모두 다양한 역할의 일을 한다.");
	}
}
