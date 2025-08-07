package day07.학생.이정호;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 화폐매수 {

	public static void main(String[] args) {
		ArrayList<Integer> money = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		int[] unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		int[] sum = new int[7];
		
		while(true) {
			System.out.print("사원명을 입력하세요 : ");
			String name = scan.nextLine();
			
			if(name.equals("stop")) {
				System.out.println("종료되었습니다");
				break;
			}
			
			System.out.print("출장비을 입력하세요 : ");
			int wage = Integer.parseInt(scan.nextLine());
			
			int remain = wage;
			
			for(int i = 0; i < unit.length; i++) {
				money.add(remain / unit[i]);
				remain = remain % unit[i];
			}
			System.out.println();

			System.out.println(name + "님의 급여 화페매수");
			for(int i = 0; i < unit.length; i++) {
				System.out.println(unit[i] + "원 : " + money.get(i) + "장");
			}
			System.out.println();
			
			for(int i = 0; i < 7; i++) {
				sum[i] += money.get(i); 
			}
			
			money.clear();
		}
		
		for(int i = 0; i < sum.length; i++) {
			System.out.println(unit[i] + "원 : " + sum[i] + "장");
		}
	}

}
