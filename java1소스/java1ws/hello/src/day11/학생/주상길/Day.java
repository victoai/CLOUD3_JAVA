package day11.학생.주상길;

public class Day {
	
	private String  title;	//제목
	private String  date;	//날짜
	private String  desc;	//설명
    boolean  result;	//결과
    
    
    {
    	
    }

    Day() {
    	
    }
    
    Day(String title, String date) {
    	this.title = title;
    	this.date = date;
    }
    
    Day(String date, String title, String desc) {
    	this.title = title;
    	this.date = date;
    	this.desc = desc;
    }
    

	public Day(String title, String date, String desc, boolean result) {
		super();
		this.title = title;
		this.date = date;
		this.desc = desc;
		this.result = result;
	}

	@Override
	public String toString() {
		return "Day [date=" + date + ", title=" + title + ", desc=" + desc + "]";
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
    
	
    
    
    
    
    
}
