package day06;

import java.util.Scanner;

public class 일정관리프로그램_1차배열 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		final int MAX = 5;
//		int scheduls = MAX;
		String[] daily = new String[MAX];
//		int cnt = 0;

//		// 일정 등록하기 1
//		String day = sc.nextLine();
//		daily[cnt] = day;
//		cnt++;

//		// 일정 등록하기 2
//		day = sc.nextLine();
//		daily[cnt] = day;
//		cnt++;
//
//		// 일정 등록하기 3
//		day = sc.nextLine();
//		daily[cnt] = day;
//		cnt++;
//
//		// 일정 등록하기 4
//		day = sc.nextLine();
//		daily[cnt] = day;
//		cnt++;
//
//		// 일정 등록하기 5
//		day = sc.nextLine();
//		daily[cnt] = day;
//		cnt++;

//		for (int i = 0; i < MAX; i++) {
//			System.out.println(daily[i]);
//		}

		// 일정 등록하기
		System.out.println("일정을 입력하세요(최대5개)");

		for (int i = 0; i < MAX; i++) {
			String day = sc.nextLine();
			daily[i] = day;
		}

		// 일정 조회하기
		for (int i = 0; i < daily.length; i++) {
			System.out.println((i + 1) + "." + daily[i]);
		}

		// 변경할 일정 번호 입력
		System.out.println("변경할 일정 번호를 입력해주세요");
		int updateNo = sc.nextInt();

		sc.nextLine();

		// 새로운 일정 등록
		System.out.println("변경 내용을 입력해주세요");
		String new_daily = sc.nextLine();

		daily[updateNo - 1] = new_daily;

		System.out.println("변경이 완료되었습니다");

		// 변경된 일정 조회하기
		for (int i = 0; i < daily.length; i++) {
			System.out.println((i + 1) + "." + daily[i]);
		}

		// 삭제할 일정 번호 입력
		System.out.println("삭제할 일정 번호를 입력해주세요");
		int deleteNo = sc.nextInt();

		sc.nextLine();

		// 배열에서 삭제한다
		daily[deleteNo - 1] = "0"; // 삭제된 요소를 의미함
		
		System.out.println("삭제가 완료되었습니다");

		// 삭제 후 일정 조회하기
		for (int i = 0; i < daily.length; i++) {
			if (!daily[i].equals("0")) {
				System.out.println((i + 1) + "." + daily[i]);
			}
		}

	}

}
