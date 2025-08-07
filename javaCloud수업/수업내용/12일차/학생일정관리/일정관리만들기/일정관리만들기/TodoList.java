package Todo주석달기완료;

public class TodoList {
	private String day; // 요일
	private Todo[] todoArray; // 일정 배열 (동적으로 작동할 예정)

	public TodoList(String day) {
		this.day = day;
		this.todoArray = null;
	}

	public String getDay() {
		return this.day;
	}

	// ⭐️핵심 메서드 : 배열의 크기를 동적으로 변경하는 메서드
	private Todo[] resizeArray(int newSize) {
		// 새로운 배열 생성
		Todo[] newArray = new Todo[newSize];
		// 기존 배열이 null이 아닐 경우에만 데이터 복사
		if (todoArray != null) {
			// Math.min()을 사용해 더 작은 길이만큼만 복사
			for (int i = 0; i < Math.min(todoArray.length, newSize); i++) {
				newArray[i] = todoArray[i];
			}
		}
		return newArray;
	}

	// ⭐️ 일정추가 메서드
	public void addTodo(String title, String content, int time) {
		// todoArray가 빈 값이 true면 1 , 아니면 todoArray전체길이에 +1
		// 처음 일정을 추가할 때는 크기가 1인 배열을 만들고
		// 그 이후부터는 현재 배열 크기보다 1 큰 배열을 만들어서 일정을 추가할 공간을 만듬
		todoArray = resizeArray((todoArray == null) ? 1 : todoArray.length + 1);
		// 배열은 0부터시작,배열의 끝을 불러올려면 -1을 해줘야함
		todoArray[todoArray.length - 1] = new Todo(title, content, time);
	}

	// ⭐️일정삭제 메서드
	public void deleteTodo(int arrayIndex) {
		// todoArray가 배열에서 빈 값 이거나
		// 해당메서드의 매개변수인 arrayIndex가 1보다 작거나
		// arrayIndex가 todoArray의 전체길이보다 클 경우
		// 추가 일정선택 validateTodoIndex메서드 반환을 인덱스 -1 반환을 받기에 비교문 수정
		// 근데 이미 validateTodoIndex에서 유효성 검사를 했는데 지워도 될듯
		// if (todoArray == null || arrayIndex < 0 || arrayIndex >= todoArray.length) {
		// System.out.println("일정 번호를 확인해주세요.");
		// return;
		// }

		// 삭제할 인덱스부터 마지막 요소 전까지 반복
		for (int i = arrayIndex; i < todoArray.length - 1; i++) {
			// 현재 위치에 다음 요소를 덮어씌워서 삭제할 요소를 제거
			// Ex1: todoArray[0] = todoArray[1] (1번 요소를 0번으로 이동)
			// Ex2: todoArray[1] = todoArray[2] (2번 요소를 1번으로 이동)
			todoArray[i] = todoArray[i + 1];
		}
		// 배열의 크기를 1 줄여서 새로운 배열 생성 및 데이터 복사
		todoArray = resizeArray(todoArray.length - 1);
		System.out.println("삭제가 완료 되었습니다!");
	}

	// ⭐️일정수정 메서드
	// 에러난 이유 사용자는 1부터 시작하는 배열을 보고 선택하는데 정작 배열은 0부터 시작해서 인덱스 -1 해줘야 합니다.
	// 해결 TodoManager에 있는 validateTodoIndex메서드를 인덱스 -1 하고 반환
	public void modifyTodo(int arrayIndex, String title, String content, int time) {
		todoArray[arrayIndex].modifyTodo(title, content, time);
		System.out.println("수정이 완료 되었습니다!");
	}

	// ⭐️일정 유무 확인 메서드
	// 추가 일정 추가하고 삭제하면 배열 크기는 있는데 값은 없는 상태 발생
	// 예) todoArray = null -> todoArray = { }
	// 배열 자체가 없는 상태와 배열의 크기가 0인 상태 (zero-length 상태)
	// 이런 경우를 대비해서 메서드 보완
	public boolean isNullTodo() {
		if (this.todoArray == null) {
			return true;
		} else {
			if (this.todoArray.length == 0)
				return true;
		}
		return false;
	}

	// ⭐️일정 출력 메서드
	public String toString() {
		if (todoArray == null) {
			return "일정이 없습니다.";
		}
		String result = "";
		for (int i = 0; i < todoArray.length; i++) {
			result += (i + 1) + "번\t" + todoArray[i].toString() + "\n";
		}
		return result;
	}
}
