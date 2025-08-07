package day08.학생;

public class Cafe_Info {
	
	public static void main(String[] args) {
		
		Cafe ice_A = new Cafe();
		
		ice_A.name = "요거프레소";
		ice_A.price = 1900;
		ice_A.coffeeBeans = "과테말라";
		ice_A.tartness = "strong";
		
		
//		System.out.println(ice_A.name);
//		System.out.println(ice_A.price);
//		System.out.println(ice_A.coffeeBeans );
//		System.out.println(ice_A.tartness );
		
		printCafe(ice_A);
		
		
		
		
		//
		String name = " 메가커피";
		int price = 1500;
		String coffeeBeans = " 코스타리카";
		String tartness = " medium";
		printCafe2(name, price, coffeeBeans, tartness);
		
		
		//
		String name3 = "  스타벅스";
		int price3 = 4500;
		String coffeeBeans3 = "  스타벅스 자체제작";
		String tartness3 = "  weak";
		printCafe3(name3, price3, coffeeBeans3, tartness3);
		
		
	}
	
	public static void printCafe(Cafe ice_A) {
		System.out.println(ice_A.name);
		System.out.println(ice_A.price);
		System.out.println(ice_A.coffeeBeans);
		System.out.println(ice_A.tartness);
	}
	
	
	
	public static void printCafe2(String name, int price, String coffeeBeans, String tartness) {
		System.out.println(name);
		System.out.println(price);
		System.out.println(coffeeBeans);
		System.out.println(tartness);
	}
	
	
	public static void printCafe3(String name, int price, String coffeeBeans, String tartness) {
		System.out.println(name);
		System.out.println(price);
		System.out.println(coffeeBeans);
		System.out.println(tartness);
	}
}
