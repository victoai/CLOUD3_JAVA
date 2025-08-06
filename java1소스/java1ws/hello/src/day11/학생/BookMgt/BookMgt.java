package day11.학생.BookMgt;

import java.util.Scanner;

public class BookMgt {

	Scanner sc = new Scanner(System.in);

	public void run() {

		Book bk1 = new Book("제목1", "작가1", "A", true);
		Book bk2 = new Book("제목2", "작가2", "B", true);
		Book bk3 = new Book("제목3", "작가3", "C", true);
		Book bk4 = new Book("제목4", "작가4", "D", true);
		Book bk5 = new Book("제목5", "작가5", "E", true);

		Book[] list = new Book[10];
		list[0] = bk1;
		list[1] = bk2;
		list[2] = bk3;
		list[3] = bk4;
		list[4] = bk5;

		int index = 5;
		Boolean bool = true;
		while (bool) {
			System.out.println("1. 대출하기 2. 수정하기 3. 추가하기 4. 반납하기 5. 삭제하기 6. 관리자 변경하기 7. 종료하기");

			int input = sc.nextInt();
			sc.nextLine();

			switch (input) {
				case 1: // 대출하기
					rent(list, index);
					break;
				case 2: // 수정하기
					change(list, index);
					break;
				case 3: // 추가하기
					add(list, index);
					break;
				case 4: // 반납하기
					re_Book(list, index);
					break;
				case 5: // 삭제하기
					delete(list, index);
					break;
				case 6: // 관리자 변경하기
					change_manager();
					break;
				case 7: // 종료
					bool = false;
					break;
			}
		}

	}

	public void rent(Book[] list, int index) {

		for (int i = 0; i < index; i++) {
			list[i].printInfo();
		}
		System.out.println("대출하고 싶은 책의 제목을 입력해주세요");
		String title = sc.nextLine();
		for (int i = 0; i < index; i++) {
			if (title.equals(list[i].getTitle())) {
				if (list[i].getIsRent()) {
					list[i].setIsRent(false);
				} else {
					System.out.println("대출 불가능");
				}
			}
		}
		// int title = sc.nextInt() - 1; sc.nextLine();
		// if(list[title].getIsRent()){
		// list[title].setIsRent(false);
		// }else{
		// System.out.println("대출 불가능")
		// }
		sc.close();
	}

	public void change(Book[] list, int index) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < index; i++) {
			list[i].printInfo();
		}
		System.out.println("수정하고 싶은 책의 제목을 입력해주세요");
		String title1 = sc.nextLine();
		for (int i = 0; i < index; i++) {
			if (title1.equals(list[i].getTitle())) {
				System.out.println("새로 입력할 제목: ");
				String newTitle = sc.nextLine();
				list[i].setTitle(newTitle);

				System.out.println("새로 입력할 작가: ");
				String newAuthor = sc.nextLine();
				list[i].setAuthor(newAuthor);

				System.out.println("새로 입력할 위치: ");
				String newLocation = sc.nextLine();
				list[i].setLocation(newLocation);
			}
		}
		sc.close();
	}

	public void add(Book[] list, int index) {
		System.out.println("새로 추가할 도서 정보를 입력해 주세요");
		System.out.println("제목: ");
		String addTitle = sc.nextLine();
		System.out.println("작가: ");
		String addAuthor = sc.nextLine();
		System.out.println("장소: ");
		String addLocation = sc.nextLine();

		Book bk = new Book(addTitle, addAuthor, addLocation, true);

		list[index] = bk;
		index++;

		System.out.println("추가완료");
	}

	public void re_Book(Book[] list, int index) {
		for (int i = 0; i < index; i++) {
			list[i].printInfo();
		}
		System.out.println("반납하고 싶은 책의 제목을 입력해주세요");
		String title2 = sc.nextLine();
		for (int i = 0; i < index; i++) {
			if (title2.equals(list[i].getTitle())) {
				if (!(list[i].getIsRent())) {
					list[i].setIsRent(true);
				} else {
					System.out.println("반납 불가능");
				}
			}
		}
	}

	public void delete(Book[] list, int index) {
		for (int i = 0; i < index; i++) {
			list[i].printInfo();
		}
		System.out.println("삭제하고 싶은 책의 제목을 입력해주세요");
		String deleteTitle = sc.nextLine();
		for (int i = 0; i < index; i++) {
			if (deleteTitle.equals(list[i].getTitle())) {
				for (int j = i; j < index; j++) {
					list[j] = list[j + 1];
				}
				index--;
			}
		}
		System.out.println("삭제 완료");
	}

	public void change_manager() {
		System.out.println("현재 관리자: " + Book.manager);

		System.out.println("새로 변경할 관리자의 이름을 입력하세요: ");
		String newManger = sc.nextLine();

		Book.manager = newManger;

		System.out.println("변경된 관리자 이름: " + Book.manager);
	}

}
