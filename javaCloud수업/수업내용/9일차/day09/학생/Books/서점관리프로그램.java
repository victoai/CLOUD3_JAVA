package day09.학생.Books;

import java.util.Arrays;
import java.util.Scanner;

public class 서점관리프로그램 {

	public static void BooksList(Books[] b) {
		for (int i = 0; i < b.length; i++) {
			if (b[i] == null) {
				break;
			}
			System.out.println((i + 1) + "." + b[i].title);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Books[] basket = new Books[5]; // 장바구니 목록

		Books a1 = new Books();
		Books a2 = new Books();
		Books a3 = new Books();
		a1.input(202108130001L, "자바의 정석", "남궁성", "도우출판", "2016년 01월 27일", 30000, true);
		a2.input(201803210002L, "모던자바스크립트", "이웅모", "위키북스", "2020년 09월 25일", 40500, true);
		a3.input(202002130003L, "HTML/CSS 입문 예제 중심", "황재호", "인포앤북", "2020년 11월 25일", 25000, false);
//		Books[] arr = new Books[3]; // 책 목록 
// 	    arr[0] = a1;
//		arr[1] = a2;
//		arr[2] = a3;
		Books[] arr = { a1, a2, a3 };

		Scanner sc = new Scanner(System.in);
		int index;
		int count = 0;

		menu: while (true) {
			System.out.println();
			System.out.println("1.책 정보 2.장바구니에 추가 3.장바구니 삭제 4.장바구니 조회 5.종료");
			int option = sc.nextInt();
			switch (option) {
			case 1:
				BooksList(arr);
				sc.nextLine();
				System.out.println("정보를 확인하실 책의 번호를 선택하세요");
				index = sc.nextInt();
				if (arr[index - 1] == null) {
					System.out.println("책 정보가 없습니다.");
					continue menu;
				}
				arr[index - 1].printInfo();
				break;
			case 2:
				if (count == 5) {
					System.out.println("장바구니가 가득 찼습니다");
					continue menu;
				}
				BooksList(arr);
				sc.nextLine();
				System.out.println("추가할 책의 번호를 입력하세요.");
				index = sc.nextInt();
				if (arr[index - 1] == null) {
					System.out.println("책 정보가 없습니다.");
					continue menu;
				}
				basket[count] = arr[index - 1];
				System.out.println(arr[index - 1].title + "이 장바구니에 추가됐습니다");
				count++;
				break;
			case 3:
				sc.nextLine();
				if (basket[0] == null) {
					System.out.println("장바구니가 비어있습니다");
					continue menu;
				}
				BooksList(basket);
				System.out.println("삭제할 책의 번호를 입력하세요.");
				index = sc.nextInt();
				if (basket[index - 1] == null || index > basket.length) {
					System.out.println("잘못된 입력입니다");
					continue menu;
				}
				System.out.println("삭제되었습니다");
				basket[index - 1] = null;
				for (int i = index - 1; i < basket.length; i++) {
					if (i + 1 == basket.length) {
						basket[i] = null;
						break;
					}
					basket[i] = basket[i + 1];
				}
				count--;
				break;
			case 4:
				sc.nextLine();
				if (basket[0] == null) {
					System.out.println("장바구니가 비어있습니다");
					continue menu;
				}
				BooksList(basket);
				break;
			case 5:
				System.out.println("종료합니다");
				break menu;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}

	}

}
