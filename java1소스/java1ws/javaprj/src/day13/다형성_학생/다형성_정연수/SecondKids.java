package day13.다형성_학생.다형성_정연수;

public class SecondKids extends Parent{
	int age;
	public SecondKids(String name, String info, int age) {
		super(name, info);
		this.age = age;
	}
	
	public String toString() {
		return name + " " + info + " " + age;
	}

	@Override
	public void action() {
		System.out.println("둘쨰");
	}
	
	public void secAction() {
		System.out.println("구르다");
	}
}
