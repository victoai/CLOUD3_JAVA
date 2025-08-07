package day06;

import java.util.Scanner;

public class 화폐매수_배열o_박시우2 {
	public static void main(String[] args) {
		int[] currency_unit = new int[8];
		String[] unit = new String[] {"오만원권","만원권","오천원권","천원권","오백원권","백원권","오십원권","십원권"};
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사원명과 출장비를 입력하세요 : ");
		String name = sc.next();
		int expense = sc.nextInt();
		
		currency_unit[0] = expense/50000;
		expense%=50000;
		currency_unit[1] = expense/10000;
		expense%=10000;
		currency_unit[2] = expense/5000;
		expense%=5000;
		currency_unit[3] = expense/1000;
		expense%=1000;
		currency_unit[4] = expense/500;
		expense%=500;
		currency_unit[5] = expense/100;
		expense%=100;
		currency_unit[6] = expense/50;
		expense%=50;
		currency_unit[7] = expense/10;
		expense%=10;
		
		System.out.print(name+" 님 ");
		for(int i=0; i<currency_unit.length; i++) {
			System.out.print(unit[i]+":");
			System.out.print(currency_unit[i]+"장, ");
		}
	}
}
