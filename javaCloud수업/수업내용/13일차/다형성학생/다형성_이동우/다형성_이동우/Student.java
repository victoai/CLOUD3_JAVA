package day13.다형성.실습1;

public class Student extends Person{

	public Student(String name) {
		super(name);
	}
	
	@Override
	public void personInfo() {
		System.out.println(name + "의 역할은 열심히 공부하는 일이다.");
	}
}
