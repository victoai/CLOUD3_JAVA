package day09.클래스만들고사용하기예제;

import java.util.Scanner;

public class Mile_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("마일을 입력하세요 자동으로 km로 변환됩니다.");
		Scanner sc = new Scanner(System.in);
		int mile = sc.nextInt();
		Mile ab = null;
		ab = new Mile();  // Mile  type(자료형)  변수만들기
		
		
		//ab.calCulator(mile);
		//double result  = ab.getKiloMeter();
		
		//System.out.println( result);
		double result2= ab.getKiloMeter();
		System.out.println( result2);
		
	
		//
		//System.out.println(ab.kiloMeter + "km");
	
	
		
	}

	
}
