package day13.다형성.실습1;

public class Propessor extends Person{

	public Propessor(String name) {
		super(name);
	}
	
	@Override
	public void personInfo() {
		
		System.out.println(name + "의 역할은 학생들을 가르치는 일이다.");
	}
}
