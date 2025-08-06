package day09;
// Cafe 클래스를 정의 (설계)
public class Cafe {
	
	//멤버변수 
	//인스턴스 변수 
	private String name;
	private int price;
	private String coffeeBeans;
	private String tartness;
	
	
	//인스터스 매서드 
	//지역변수와 인스턴스 변수의 이름이 같으면
	//this를 사용하여 인스턴스 매서드임을 표시해야함
	public void input(String name, int price, String coffeeBeans , String tartness) {
		this.name  = name;
		this.price  = price;
		this.coffeeBeans = coffeeBeans;
		this.tartness =  tartness;		
	}
	
	//	
	
	public void printInfo() {
		
		System.out.println( name );
		System.out.println( price );
		System.out.println( coffeeBeans );
		System.out.println( tartness );
		 
		
		
	}
	
}
