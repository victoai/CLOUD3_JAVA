package day13.다형성.음료마시기;

public class Beverage_박시우 extends AcornStudent{
 
	 
	public void 음료마시기(String drink) {
		System.out.println("저는 "+drink+"로 하겠습니다!");
	}
	
	public void 음료마시기( ) {
		System.out.println("저는 라떼로 하겠습니다!");
	}
	
	public static void main(String[] args) {
		Beverage_박시우 bev = new Beverage_박시우();
		String mybev = "Latte";
		bev.음료마시기(mybev);
	}
}
