package day13.객체배열_2인짝궁.오윤석최하은;

import java.util.Scanner;

public class Schedule {
	private static final String[] DAYS = { "월", "화", "수", "목", "금", "토", "일" };
	private Todo[] newTodo;
	private Scanner sc;

	// Days 배열에 대한 Todo객체 초기화
	public Schedule() {
		newTodo = new Todo[7]; // 새로운 객체 생성
		for (int i = 0; i < newTodo.length; i++) {
			newTodo[i] = new Todo(); // 각 배열에 해당하는 객체를 '없음'으로 초기화
		}
		sc = new Scanner(System.in); // 비어있는 객체에 입력받기
	}

	// 요일 선택 매서드
	public int selectDay() {
		while (true) {
			System.out.print("요일을 입력하세요 (월~일): ");
			String input = sc.nextLine().trim(); // trim: 앞뒤 공백 제거

			for (int i = 0; i < DAYS.length; i++) {
				if (DAYS[i].equals(input)) {
					return i; // 입력한 요일에 해당하는 배열 인덱스 반환
				}
			}
			System.out.println("잘못된 입력입니다. 다시 입력하세요.");
		}
	}

	// 일정 추가 매서드
	public void add() {
		int day = selectDay(); // 요일 선택
		System.out.print(DAYS[day] + "요일의 할 일을 입력하세요: ");
		String task = sc.nextLine(); // 추가할 내용 입력
		newTodo[day].setTask(task); // 선택된 요일의 내용 설정
		System.out.println(DAYS[day] + "요일 일정이 추가되었습니다.");
	}

	// 일정 조회 매서드
	public void view() {
		int day = selectDay(); // 요일 선택
		System.out.println(DAYS[day] + "요일의 일정: " + newTodo[day].getTask());
	}

	// 일정 수정 매서드
	public void update() {
		int day = selectDay(); // 요일 선택
		System.out.print(DAYS[day] + "요일의 새로운 할 일을 입력하세요: ");
		String task = sc.nextLine(); // 수정 내용 작성
		newTodo[day].setTask(task); // 선택된 요일의 내용 수정
		System.out.println(DAYS[day] + "요일 일정이 수정되었습니다.");
	}

	// 일정 삭제 매서드
	public void delete() {
		int day = selectDay(); // 요일 선택
		newTodo[day].setTask("없음"); // 선택된 요일의 내용을 "없음"으로 설정
		System.out.println(DAYS[day] + "요일 일정이 삭제되었습니다.");
	}
}
