package day08.학생_구조화된자료형;

public class Donuts {

	private  String name;
	private int price;
	private int kcal;
	private int weight;
	
	
	
	public Donuts() {
		
	}
	
	public Donuts(  String name, int price, int kcal, int weight) {
		this.name  =name;
		this.price  = price;
		this.kcal = kcal;
		this.weight= weight;
		
	}
	
/*
	public void input( String name, int price, int kcal, int weight) {
		 this.name="누텔라 카스텔라 도넛";
		 price=3900;
		 kcal=370;
		 weight=200;
		  
		
		this.name  =name;
		this.price  = price;
		this.kcal = kcal;
		this.weight= weight;
		
		
	}

*/

	
	public   void printInfo( Donuts this ) {
		System.out.println(this.name);
		System.out.println(this.price);
		System.out.println(this.kcal);
		System.out.println(this.weight);
	}
	
	
	
}
