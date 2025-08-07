package day13.객체배열_2인짝궁.권지언;

public class Manage {

	String name;
	String title;
	String date;
	String desc;
	boolean result;

	public Manage() {

	}

	public Manage(String name, String title, String date, String desc) {
		this.name = name;
		this.title = title;
		this.date = date;
		this.desc = desc;
	}

	public String toString() {
		return "작성자 : " + name + " 제목: " + title + " 작성날짜 : " + date + "\n상세내용 : " + desc;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setDate(String date) {
		this.title = date;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getName() {
		return name;
	}

	public String getTitle() {
		return title;
	}

	public String getDate() {
		return date;
	}
}
