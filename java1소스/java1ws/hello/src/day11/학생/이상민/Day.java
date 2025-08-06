package day11.학생.이상민;

public class Day {
	private String title;
	private String date;
	private String desc;
	
	public Day(String title, String date, String desc) {
		super();
		this.title = title;
		this.date = date;
		this.desc = desc;
	}
	public Day(String title, String date) {
		super();
		this.title = title;
		this.date = date;
	}
	public Day() {
		super();
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "----------------------\n" + " 제목 : " + this.title + "\n 날짜 : " + this.date + "\n 메모 : " + this.desc + "\n----------------------\n";
	}
}
