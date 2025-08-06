package day07.학생;

import java.util.Scanner;

public class CalculateWage2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String employeeName;
		int travelExpenses;
		int totalExpenses = 0;

		while (true) { // stop 입력 전 까지 반복
			System.out.print("사원명 입력: ");
			employeeName = scan.nextLine();

			if (employeeName.equalsIgnoreCase("stop")) {
				break;
			}

			System.out.print("출장비 입력: ");
			if (scan.hasNextInt()) {
				travelExpenses = scan.nextInt();
				scan.nextLine();
			} else {
				String input = scan.next();
				if (input.equalsIgnoreCase("stop")) {
					break;
				} else {
					System.out.println("잘못된 출장비 입력. 다시 시도하세요.");
					scan.nextLine();
					continue;
				}
			}

			totalExpenses += travelExpenses; // 출장비를 총임금에 누적
			Calculate(travelExpenses); // 각 횟수의 화폐계수 계산 함수
		}
		scan.close();

		System.out.println("\n----최종 필요한 화폐 갯수----");
		Calculate(totalExpenses); // 위에서 누적한 총 출장비에 대한 화폐 계산 함수

		String result = Calculate2(totalExpenses);
		System.out.println(result);

		int totalCount = Calculate3(totalExpenses);
		System.out.println("총 화폐 개수: " + totalCount);
	}

	public static void Calculate(int travelExpenses) {
		int[] money = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 1 }; // money 배열
		String[] moneyWon = { "오만", "만", "오천", "천", "오백", "백", "오십", "십", "일" }; // 한글화폐단위 배열

		for (int i = 0; i < money.length; i++) { // money 배열 끝까지 반복
			int amount = travelExpenses / money[i]; // 출장비에 money[i]만큼 몫 계산해 대입
			travelExpenses = travelExpenses % money[i];// 몫 계산 후 , 맨 앞자리 날림
			// 예 ) travelExpenses=123456 123456 / (money[0]) = 2 123456 % (money[0]) = 23456
			System.out.print(moneyWon[i] + ":" + amount + " ");

		}
		System.out.println();
	}

	public static String Calculate2(int travelExpenses) {
		int[] money = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 1 }; // money 배열
		String[] moneyWon = { "오만", "만", "오천", "천", "오백", "백", "오십", "십", "일" }; // 한글화폐단위 배열

		String result = ""; // 결과를 저장할 String

		for (int i = 0; i < money.length; i++) { // money 배열 끝까지 반복
			int amount = travelExpenses / money[i]; // 출장비에 money[i]만큼 몫 계산해 대입
			travelExpenses = travelExpenses % money[i]; // 몫 계산 후, 나머지 계산

			if (amount > 0) { // 화폐 개수가 0보다 큰 경우만 문자열에 추가
				result += moneyWon[i] + ":" + amount + " ";
			}
		}

		return result.trim(); // 최종 문자열 반환
	}

	public static int Calculate3(int travelExpenses) {
		int[] money = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 1 }; // 화폐 단위 배열
		int totalCount = 0; // 화폐 총 개수

		for (int i = 0; i < money.length; i++) { // money 배열 끝까지 반복
			int amount = travelExpenses / money[i]; // 각 화폐 단위로 몇 개가 필요한지 계산
			travelExpenses = travelExpenses % money[i]; // 남은 금액 계산

			totalCount += amount; // 화폐 개수를 누적
		}

		return totalCount; // 총 화폐 개수 반환
	}

}
