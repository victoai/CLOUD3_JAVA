package day13.객체배열_2인짝궁.임형택_이정호;

public class Day {
	String title; 
	String desc; 
	boolean result; 
	
	public Day() {
		this.result = false;
	}
	public Day(String desc, String title) {
		this.desc = desc;
		this.title = title;
		this.result = false;
	}
	
	public boolean getResult() {
		return result;
	}
	
	public void setResult(boolean result) {
		this.result = result;
	}
	
	public String toString() {
		String status = result ? "완료" : "미완료";
		return "[제목: " + title + ", 일정: " + desc + ", 상태: " + status + "]";
	}

}
