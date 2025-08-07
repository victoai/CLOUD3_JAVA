package day07.학생;

public class 어른판단함수_이효진 {

	public static void main(String[] args) { // 함수기본문제 05
		int age = 20;
		if(isAdult(age)) {
			System.out.println("성인입니다.");
		}else {
			System.out.println("성인이 아닙니다.");
		}
	}
	public static boolean isAdult(int age) {
		return age >=18;
	}
}
