package 다형성문제;

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
