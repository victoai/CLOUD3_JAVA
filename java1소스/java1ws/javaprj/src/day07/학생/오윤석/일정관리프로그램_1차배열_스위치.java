package day07.학생.오윤석;

import java.util.Scanner;

public class 일정관리프로그램_1차배열_스위치 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		final int MAX = 5;
//		int scheduls = MAX;
		String[] daily = new String[MAX];
		int cnt = 0;

		loop: while (true) {

			System.out.println("1.등록, 2.조회, 3.변경, 4.삭제, 5.종료");
			int schedul = sc.nextInt();

			sc.nextLine();

			switch (schedul) {
			case 1:
				System.out.println("일정을 입력하세요(최대5개)");

				if (cnt < MAX) {
					String day = sc.nextLine();
					daily[cnt] = day;
					cnt++;
				} else {
					System.out.println("일정을 더 이상 등록할 수 없습니다.");
				}

				break;

			case 2:
				System.out.println("일정표 내용입니다");

				for (int i = 0; i < cnt; i++) {

					System.out.println((i + 1) + "." + daily[i]);

				}

				break;

			case 3:
				System.out.println("변경할 일정 번호를 입력해주세요");
				int updateNo = sc.nextInt();

				sc.nextLine();

				// 새로운 일정 등록
				System.out.println("변경 내용을 입력해주세요");
				String new_daily = sc.nextLine();

				daily[updateNo - 1] = new_daily;

				System.out.println("변경이 완료되었습니다");

				break;

			case 4:
				System.out.println("삭제할 일정 번호를 입력해주세요");
				int deleteNo = sc.nextInt();

				sc.nextLine();

				// 배열에서 삭제한다
				if (deleteNo > 0 && deleteNo <= cnt) {
					// 삭제할 자리를 비우고, 뒤에 있는 항목들을 앞으로 당겨서 빈 자리를 채운다
					for (int i = deleteNo - 1; i < cnt - 1; i++) {
						daily[i] = daily[i + 1];
					}
					daily[cnt - 1] = null; // 마지막 항목을 0로 설정 (배열 크기 유지)
					cnt--; // 일정 수를 하나 줄인다
					System.out.println("삭제가 완료되었습니다");
				}

				break;

			case 5:
				System.out.println("종료합니다");
				break loop;

			default:
				System.out.println("잘못된 입력입니다. 다시 시도하세요.");
				break;
			}

		}

	}
}
