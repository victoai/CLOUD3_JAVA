package day12_0304;

public class Fruit1 extends Fruit{		//자식
	public String color;
	
	public Fruit1(String name, int price, String color) {
		super(name, price);		//상속받은거 접근할때 super
		this.color=color;
	}
	public void print자식() {
		System.out.println(color);
		//System.out.println(name+price);
		
		printInfo();
	}
	
}
