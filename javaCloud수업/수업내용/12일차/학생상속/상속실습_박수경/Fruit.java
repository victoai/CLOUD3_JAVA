package day12_0304;

public class Fruit{	//부모
	private String name;
	private int price;
	
	
	public Fruit(String name, int price) {
		this.name=name;
		this.price=price;
	}
	
	public String toString() {
		return name+" "+price;
	}
	
	public void voice(String voice) {
		System.out.println("세상에서"+voice);
	}
	
	public void printInfo() {
		System.out.println("이름 : "+name);
		System.out.println("가격 : "+price+"원");
	}
	
	
}
