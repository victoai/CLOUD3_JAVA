package 다형성문제;

public class FirstKid extends Parent{
	int age;
	public FirstKid(String name, String info, int age) {
		super(name, info);
		this.age = age;
	}
	
	public String toString() {
		return name + " " + info + " " + age;
	}

	@Override
	public void action() {
		System.out.println("첫쨰");
	}
	
	public void firstAc() {
		System.out.println("날다");
	}
}
