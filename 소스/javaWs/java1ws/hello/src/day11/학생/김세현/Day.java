package day11.학생.김세현;

public class Day {

	String  title;
    String  date;
    String  desc;
    boolean  result;
    
    
    
    public Day() {	// 생성자
    	
    }
	public Day(String title, String date) {		// 생성자
		this.title = title;
		this.date = date;
	}
	
	

	@Override
	public String toString() {
		return "일정:" + title + ", " + "날짜:" + date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setDate(String date) {
		this.date = date;
	}
	public String getDate() {
		return this.date;
	}

	public String getDesc() {
		return desc;
	}

	public boolean isResult() {
		return result;
	}
	
	
	
	
    
    
}
