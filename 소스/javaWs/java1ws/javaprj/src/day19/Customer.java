package day19;

public class Customer {
	
	String name;
	String id;
	String pw;
	int height;
	int weight;
	String bmi;
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public Customer(String name, String id, String pw, int height, int weight, String bmi) {
		super();
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.height = height;
		this.weight = weight;
		this.bmi = bmi;
	}
	@Override
	public String toString() {
		return " name=" + name + ", id=" + id + ", pw=" + pw + ", height=" + height + ", weight=" + weight
				+ ", bmi=" + bmi + " ";
	}
	
	
	//생성자
	
	
	
	
	//toString
	

}
