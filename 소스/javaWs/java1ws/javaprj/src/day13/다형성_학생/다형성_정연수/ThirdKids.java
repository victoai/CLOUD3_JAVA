package day13.다형성_학생.다형성_정연수;

public class ThirdKids extends Parent{
	int age;
	
	public ThirdKids(String name, String info, int age) {
		super(name, info);
		this.age = age;
	}
	
	public String toString() {
		return name + " " + info + " " + age;
	}

	@Override
	public void action() {
		System.out.println("셋째");
	}
	
	public void thirdAction() {
		System.out.println("뛰다");
	}
}
