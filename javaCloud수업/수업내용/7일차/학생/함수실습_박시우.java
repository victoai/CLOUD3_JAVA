package day07;

/*
 0. 두 수를 매개변수로 받아 합을 반환하는 함수 만들기
 1. subtract 함수만들어 두 수를 매개변수로 받아  큰 수에서 작은수를 뺀 결과를 반환하는 함수를 만들기
 2. ★을 세개 출력하는 함수를 만들기
 3. 투자금을 두 배로 만들어 주는 함수 만들기 
 4. 이번주 예상 로또번호를 반환하는 함수 만들기 
 5. 어른판단함수만들기 ( 나이를 매개변수로 전달받는다) 
 6. 응원의 메시지를 반환하는 함수 만들기
 */

public class 함수실습_박시우 {
	public static void main(String[] args) {
		//0.
		int sum = sum(5,2);
		System.out.println(sum);
		
		//1.
		int substraction = subtraction(5,8);
		System.out.println(substraction);
		
		//2.
		starPrint();
		
		//3.
		multiple(4600000);
		
		//4.
		int[] lotto = lotto();
		System.out.print("이번주 예상 로또번홀는 ");
		for(int nums : lotto) {
			System.out.print(nums+" ");
		}
		System.out.println("입니다");
		
		//5.
		String isAdult = isAdult(33);
		System.out.println(isAdult);
		
		//6.
		System.err.println(ganbare());
	}
	
	//0.
	public static int sum(int a, int b){
		return a+b;
	}
	
	//1.
	public static int subtraction(int a, int b) {
		if(a>b) {
			return a-b;
		} else {
			return b-a;
		}
	}
	
	//2.
	public static void starPrint() {
		System.out.println("***");
	}
	
	//3.
	public static void multiple(int investment) {
		System.out.printf("투자금이 %d원이 되었습니다\n",(investment*2));
	}
	
	//4.
	public static int[] lotto() {
		int[] arr = {5,32,23,11,22,3,29};
		return arr;
	}
	
	//5.
	public static String isAdult(int age) {
		if(age>19) {
			return "성인입니다";
		} else {
			return "미성년입니다";
		}
	}
	
	//6.
	public static String ganbare() {
		return "다들 열심히 해서 좋은곳에 취업합시다 화이팅!";
	}
}
