package Todo주석달기완료;

public class Todo {
	private String title; // 제목
	private String content; // 내용
	private int time; // 시간 (00시 ~ 24시)

	// 객체 생성 시 제목, 내용, 시간을 초기화하는 생성자
	public Todo(String title, String content, int time) {
		this.title = title;
		this.content = content;
		this.time = time;
	}

	// 객체의 제목, 내용, 시간을 수정하는 메서드
	public void modifyTodo(String title, String content, int time) {
		this.title = title;
		this.content = content;
		this.time = time;
	}

	public String toString() {
		return title + "\t" + content + "\t" + time + "시\t";
	}
}
