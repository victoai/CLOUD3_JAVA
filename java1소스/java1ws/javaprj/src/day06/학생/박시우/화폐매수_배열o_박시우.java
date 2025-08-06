package day06.학생.박시우;

import java.util.Scanner;

public class 화폐매수_배열o_박시우 {
	public static void main(String[] args) {
		int[] currency_unit = new int[8];
		String[] unit = new String[] {"오만원권","만원권","오천원권","천원권","오백원권","백원권","오십원권","십원권"};
		int[] unit_money = new int[] {50000,10000,5000,1000,500,100,50,10};
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사원명과 출장비를 입력하세요 : ");
		String name = sc.next();
		int expense = sc.nextInt();
		
		for(int i=0; i<unit.length; i++) {
			currency_unit[i] = expense/unit_money[i];
			expense%=unit_money[i];
		}
		
		System.out.print(name+" 님 ");
		for(int i=0; i<currency_unit.length; i++) {
			System.out.print(unit[i]+":");
			System.out.print(currency_unit[i]+"장, ");
		}
	}
}
