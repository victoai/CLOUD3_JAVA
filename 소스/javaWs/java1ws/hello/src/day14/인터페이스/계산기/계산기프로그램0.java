package day14.인터페이스.계산기;

import java.util.Scanner;

public class 계산기프로그램0 {

	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in);
		System.out.println(" 두수 입력하세요" );
		int su1 = sc.nextInt();
		int su2 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("연산자를 입력하세요" );
		
		String op  = sc.nextLine();
		
		LGCalculator  cal  = new LGCalculator();
		
		
		switch(op) {
		case "+" :
			//int result =cal.add(su1, su2);
			 int result =cal.addLg(su1, su2);
			System.out.println( result);
			break;
		case "-":
			//int result2  = cal.sub(su1, su2);
			int result2  = cal.subLg(su1, su2);
			System.out.println(result2);
			
		}		

	}

}
