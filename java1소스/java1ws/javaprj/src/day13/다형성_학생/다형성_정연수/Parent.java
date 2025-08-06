package day13.다형성_학생.다형성_정연수;

public class Parent {

	String name;
	String info;
	
	public Parent() {
		
	}
	
	public Parent(String name, String info) {
		this.name = name;
		this.info  = info;
	}
	
	public void action() {
		System.out.println("안녕");
	}
	
	public String toString() {
		return name + info;
	}
}
