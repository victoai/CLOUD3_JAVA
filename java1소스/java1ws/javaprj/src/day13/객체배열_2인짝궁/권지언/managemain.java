package day13.객체배열_2인짝궁.권지언;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class managemain {
	static ArrayList<User> users = new ArrayList<>();
	static User loggedInUser = null;
	static ArrayList<Manage> schedules = new ArrayList<>();

	public static void main(String[] args) {
		users.add(new Admin("관리자", "admin", "admin123")); // 기본 관리자 계정 추가
		Scanner sc = new Scanner(System.in);

		while (true) {
			if (loggedInUser == null) {
				System.out.println("1. 회원가입 2. 로그인 3. 종료");
				int choice = Integer.parseInt(sc.nextLine());
				switch (choice) {
				case 1:
					signUp(sc);
					break;
				case 2:
					login(sc);
					break;
				case 3:
					System.out.println("프로그램 종료");
					return;
				default:
					System.out.println("잘못된 입력입니다");
				}
			} else {
				if (loggedInUser.isAdmin()) {
					System.out.println("1. 일정 등록 2. 일정 삭제 3. 일정 조회 4. 일정 변경 5. 일정 검색 6. 로그아웃 7. 전체 일정 삭제 (관리자)");
				} else {
					System.out.println("1. 일정 등록 2. 일정 삭제 3. 일정 조회 4. 일정 변경 5. 일정 검색 6. 로그아웃");
				}
				int choice = Integer.parseInt(sc.nextLine());
				switch (choice) {
				case 1:
					createSchedule(sc);
					break;
				case 2:
					deleteSchedule(sc);
					break;
				case 3:
					viewSchedules();
					break;
				case 4:
					updateSchedule(sc);
					break;
				case 5:
					searchSchedule(sc);
					break;
				case 6:
					logout();
					break;
				case 7:
					if (loggedInUser.isAdmin())
						adminDeleteSchedule(sc);
					break;
				default:
					System.out.println("잘못된 입력입니다");
				}
			}
		}
	}

	static void signUp(Scanner sc) {
		System.out.println("이름을 입력하세요:");
		String name = sc.nextLine();
		System.out.println("아이디를 입력하세요:");
		String id = sc.nextLine();
		System.out.println("비밀번호를 입력하세요:");
		String password = sc.nextLine();

		for (User user : users) {
			if (user.id.equals(id)) {
				System.out.println("이미 존재하는 아이디입니다.");
				return;
			}
		}

		users.add(new User(name, id, password));
		System.out.println("회원가입 성공!");
	}

	static void login(Scanner sc) {
		System.out.println("아이디를 입력하세요:");
		String id = sc.nextLine();
		System.out.println("비밀번호를 입력하세요:");
		String password = sc.nextLine();

		for (User user : users) {
			if (user.id.equals(id) && user.password.equals(password)) {
				loggedInUser = user;
				System.out.println(user.name + "님 반갑습니다!");

				if (loggedInUser.isAdmin()) {
					System.out.println("🛠 관리자 권한 활성화");
				}
				return;
			}
		}
		System.out.println("로그인 실패: 아이디 또는 비밀번호가 일치하지 않습니다");
	}

	static void logout() {
		System.out.println(loggedInUser.name + "님 로그아웃 되었습니다");
		loggedInUser = null;
	}

	static void adminDeleteSchedule(Scanner sc) {
		if (!(loggedInUser instanceof Admin)) {
			System.out.println("관리자만 사용할 수 있는 기능입니다.");
			return;
		}
		System.out.println("삭제할 일정의 번호를 입력하세요:");
		int index = Integer.parseInt(sc.nextLine()) - 1;
		((Admin) loggedInUser).deleteAnySchedule(schedules, index);
	}

	static void createSchedule(Scanner sc) {
		System.out.println("제목을 입력하세요:");
		String title = sc.nextLine();
		System.out.println("내용을 입력하세요:");
		String desc = sc.nextLine();
		schedules.add(new Manage(loggedInUser.name, title, gettingDate(), desc));
		System.out.println("일정 등록 성공!");
	}

	static void deleteSchedule(Scanner sc) {
		System.out.println("삭제할 일정의 번호를 입력하세요:");
		int index = Integer.parseInt(sc.nextLine()) - 1;
		if (index < 0 || index >= schedules.size()) {
			System.out.println("잘못된 입력입니다");
			return;
		}
		schedules.remove(index);
		System.out.println("일정 삭제 성공!");
	}

	static void updateSchedule(Scanner sc) {
		System.out.println("변경할 일정의 번호를 입력하세요:");
		int index = Integer.parseInt(sc.nextLine()) - 1;
		if (index < 0 || index >= schedules.size()) {
			System.out.println("잘못된 입력입니다");
			return;
		}
		System.out.println("새로운 제목을 입력하세요:");
		String title = sc.nextLine();
		System.out.println("새로운 내용을 입력하세요:");
		String desc = sc.nextLine();
		schedules.get(index).setTitle(title);
		schedules.get(index).setDesc(desc);
		System.out.println("일정 변경 완료!");
	}

	static void searchSchedule(Scanner sc) {
		System.out.println("검색할 문구를 입력하세요:");
		String search = sc.nextLine();
		boolean found = false;
		for (int i = 0; i < schedules.size(); i++) {
			if (schedules.get(i).toString().contains(search)) {
				System.out.println((i + 1) + ". " + schedules.get(i).toString());
				found = true;
			}
		}
		if (!found) {
			System.out.println("검색 결과가 없습니다.");
		}
	}

	static void viewSchedules() {
		if (schedules.isEmpty()) {
			System.out.println("등록된 일정이 없습니다");
			return;
		}
		for (int i = 0; i < schedules.size(); i++) {
			System.out.println((i + 1) + ". " + schedules.get(i).toString());
		}
	}

	static String gettingDate() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		return LocalDateTime.now().format(formatter);
	}
}
