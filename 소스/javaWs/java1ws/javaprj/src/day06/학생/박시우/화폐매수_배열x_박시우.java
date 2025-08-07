package day06.학생.박시우;

import java.util.Scanner;

public class 화폐매수_배열x_박시우 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int bill50000=0,bill10000=0, bill5000=0, bill1000=0, coin500=0, coin100=0, coin50=0, coin10=0;
		System.out.println("사원명과 출장비를 입력하세요 : ");
		String name = sc.next();
		int expense = sc.nextInt();
		
		while(expense!=0) {
			//오만원권
			bill50000 = expense/50000;
			expense%=50000;
			//만원권
			bill10000 = expense/10000;
			expense%=10000;
			//오천원권
			bill5000 = expense/5000;
			expense%=5000;
			//천원권
			bill1000 = expense/1000;
			expense%=1000;
			//오백원권
			coin500 = expense/500;
			expense%=500;
			//백원권
			coin100 = expense/100;
			expense%=100;
			//오십원권
			coin50 = expense/50;
			expense%=50;
			//십원권
			coin10 = expense/10;
			expense%=10;
		}
		
		System.out.printf("%s님, 오만원 : %d, 만원 : %d, 오천원 : %d, 천원 : %d, 오백원 : %d, 백원 : %d, 오십원 : %d, 십원 : %d",
				name,bill50000,bill10000, bill5000, bill1000, coin500, coin100, coin50, coin10);
	}
}
