package day07;

public class 설음식만들기 {

	public static void main(String[] args) {	 
		
		//만두만들기
		//떡국만들기
		//전만들기
	    //갈비찜만들기
		String 음식1  = 만두만들기();
		String 음식2  = 떡국만들기();
		String 음식3  = 전만들기();
		String 음식4  = 갈비찜만들기();
		
		System.out.println(" 설 상차리기 !!!!");		
		System.out.println(  "****"+음식1  +  음식2 + 음식3 +  음식4 + "****");
		
		
	}

	
	
	public static String 만두만들기 () {	
		//
		return "고기만두";
	}
	
	
	public static String 떡국만들기() {
		return  "떡국만들기";
	}
	
	
	public static String 전만들기() {
		return "산적";		
	}
	
	
	public static String 갈비찜만들기() {
		return "소고기갈비찜";
	}
}
