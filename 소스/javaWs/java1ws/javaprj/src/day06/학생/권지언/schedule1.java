package day06.학생.권지언;

import java.util.Scanner;

public class schedule1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int arr_size = 5;
		String[] arr = new String[arr_size];

		while (true) {
			System.out.println("1.등록 2.조회 3.변경 4.삭제 5.종료");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				System.out.println("추가할 일정을 입력하세요");
				String what = sc.next();
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] == null) {
						arr[i] = what;
						break;
					}
				}
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] != null) {
						System.out.print(arr[i] + " ");
					}
				}
				System.out.println();
				break;
			case 2:
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] != null) {
						System.out.print(arr[i] + " ");
					}
				}
				System.out.println();
				break;
			case 3:
				System.out.println("변경할 일정 인덱스를 선택하세요");
				int idx1 = sc.nextInt();
				System.out.println("변경할 일정을 입력하세요");
				String what1 = sc.next();
				arr[idx1 - 1] = what1;
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] != null) {
						System.out.print(arr[i] + " ");
					}
				}
				System.out.println();
				break;
			case 4:
				System.out.println("삭제할 일정 인덱스를 선택하세요");
				int idx2 = sc.nextInt();
				for (int i = idx2 - 1; i < arr.length - 1; i++) {
					arr[i] = arr[i + 1];
				}
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] != null) {
						System.out.print(arr[i] + " ");
					}
				}
				System.out.println();
				break;

			case 5:
				System.out.println("프로그램을 종료합니다");
				sc.close();
				System.exit(0);
				break;
			}
		}
	}
}
