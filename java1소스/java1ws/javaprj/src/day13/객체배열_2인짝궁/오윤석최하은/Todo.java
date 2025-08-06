package day13.객체배열_2인짝궁.오윤석최하은;

public class Todo {
	private String task;

	// 기본 생성자
	public Todo() {
		this.task = "없음"; // 기본값 "없음"으로 설정
	}

	// 할 일 내용 가져오기
	public String getTask() {
		return task;
	}

	// 할 일 내용 수정하기
	public void setTask(String task) {
		this.task = task;
	}
}
