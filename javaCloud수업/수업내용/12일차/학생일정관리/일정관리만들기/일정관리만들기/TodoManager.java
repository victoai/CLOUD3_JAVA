package Todo주석달기완료;

import java.util.Scanner;

public class TodoManager {
	Scanner sc = new Scanner(System.in);
	String[] dayArray = { "월", "화", "수", "목", "금", "토", "일" };
	TodoList[] todoList = new TodoList[7];

	// 프로그램 시작 시 7개 요일의 TodoList 객체를 자동으로 생성
	public TodoManager() {
		for (int i = 0; i < todoList.length; i++) {
			todoList[i] = new TodoList(dayArray[i]);
		}
	}

	public void run() {
		while (true) {
			System.out.println("1.일정추가, 2.일정삭제, 3.일정수정, 4.일정출력");
			int menu = sc.nextInt();
			switch (menu) {
			case 1: {
				addTodo();
				break;
			}
			case 2: {
				deleteTodo();
				break;
			}
			case 3: {
				modifyTodo();
				break;
			}
			case 4: {
				printTodo();
				break;
			}
			}
		}
	}
	//⭐️요일 선택 메서드
	private int chooseDay() {
		System.out.print("요일을 입력하세요 (월 ~ 일) : ");
		String input = sc.next();
		// 요일 배열에서 입력받은 요일과 같은 요일을 찾아서 인덱스를 반환
		for (int i = 0; i < dayArray.length; i++) {
			if (dayArray[i].equals(input)) {
				return i; // "월" return 0 , "화" return 1 .....
			}
		}
		System.out.println("요일입력을 확인해주세요.");
		return -1; // -1은 배열에서 절대 나올 수 없는 인덱스 값
	}

	//⭐️유효성 검사 메서드	
	private int validateDaySelection() {
		// 유효한 요일을 선택하면 해당 요일의 인덱스를 반환,
		// 유효하지 않은 요일을 선택하면 -1을 반환	
		int arrayIndex = chooseDay();
		if (arrayIndex == -1) {
			System.out.println("유효하지 않은 요일입니다.");
		}
		return arrayIndex;
	}

	//⭐️일정 추가 메서드
	private void addTodo() {
		int arrayIndex = validateDaySelection();
		if (arrayIndex == -1)
			return;

		String[] todoDetails = getTodoDetails();
		// todoList: 7개의 요일별 todoList객체를 담고 있는 배열
		// arrayIndex: 선택된 요일의 인덱스(0:월,~6:일)
		// todoDetails: 일정 제목, 내용, 시간을 담고 있는 배열
		// ⭐️123줄 참고⭐️ Integer.parseInt(todoDetails[2]): todoDetails[2]번째 요소를 정수로 변환
		todoList[arrayIndex].addTodo(todoDetails[0], todoDetails[1], Integer.parseInt(todoDetails[2]));
		System.out.println("입력이 완료 되었습니다!");
	}

	//⭐️일정 유무 확인 메서드
	private boolean isNullTodo(int arrayIndex) {
		if (todoList[arrayIndex].isNullTodo()) {
			System.out.println("일정이 없습니다.");
			return true;
		}
		return false;
	}

	//⭐️일정 삭제 메서드
	private void deleteTodo() {
		int arrayIndex = validateDaySelection();
		// 유효하지 않은 요일을 선택하거나 일정이 없으면 메서드 종료
		if (arrayIndex == -1 || isNullTodo(arrayIndex))
			return;	
		// 유효한 요일을 선택하고 일정이 있으면 일정 출력
		printTodo(arrayIndex);
		// 일정 번호 입력
		int todoIndex = validateTodoIndex();
		// 일정 삭제
		todoList[arrayIndex].deleteTodo(todoIndex);
	}

	//⭐️일정 수정 메서드
	private void modifyTodo() {
			int arrayIndex = validateDaySelection();
			// 유효하지 않은 요일을 선택하거나 일정이 없으면 메서드 종료	
			if (arrayIndex == -1 || isNullTodo(arrayIndex))
			return;
		// 유효한 요일을 선택하고 일정이 있으면 일정 출력		
		printTodo(arrayIndex);
		// 일정 번호 입력
		int todoIndex = validateTodoIndex();
		// 일정 수정
		String[] todoDetails = getTodoDetails();
		// 76줄과 동일
		todoList[arrayIndex].modifyTodo(todoIndex, todoDetails[0], todoDetails[1], Integer.parseInt(todoDetails[2]));
	}

	//⭐️일정 정보 입력 메서드
	private String[] getTodoDetails() {
		System.out.print("일정 제목을 입력해주세요 : ");
		String title = sc.next();
		System.out.print("일정 내용을 입력해주세요 : ");
		String content = sc.next(); 
		int time = validateTimeInput();
		return new String[] { title, content, String.valueOf(time) };
		// valueOF: 다른 데이터 타입을 String(문자열)으로 변환해주는 메서드
	}

	//⭐️ 일정 시간 입력 메서드
	private int validateTimeInput() {
		int time;
		while (true) {
			System.out.print("일정 시간을 입력해주세요(0~24) : ");
			time = sc.nextInt();
			if (time >= 0 && time <= 24)
				break;
			System.out.println("시간입력을 확인해주세요.");
		}
		return time;
	}

	//⭐️일정 번호 입력 메서드
	// 배열은 0부터 시작하니까 -1 하고 반환
	private int validateTodoIndex() {
		int todoIndex;
		while (true) {
			System.out.print("일정 번호를 입력하세요. : ");
			todoIndex = sc.nextInt();
			// 일정 번호가 1~7 사이의 숫자인지 확인
			if (todoIndex >= 1 && todoIndex <= todoList.length)
				break;
			System.out.println("일정 번호를 확인하세요.");
		}
		return todoIndex - 1;
	}

	private void printTodo() {
		for (int i = 0; i < todoList.length; i++) {
			// 일정이 없으면 출력하지 않음
			if (todoList[i].isNullTodo())
				continue;

			System.out.println(todoList[i].getDay() + "요일 일정");
			System.out.println(todoList[i].toString());
		}
	}

	private void printTodo(int index) {
		// 일정이 없으면 출력하지 않음	
		if (todoList[index].isNullTodo())
			return;

		System.out.println(todoList[index].getDay() + "요일 일정");
		System.out.println(todoList[index].toString()); 
	}
}