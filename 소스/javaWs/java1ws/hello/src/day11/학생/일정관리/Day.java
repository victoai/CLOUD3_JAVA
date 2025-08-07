package day11.학생.일정관리;

public class Day {
	private String title;
	private String date; 
	private String desc;
	private boolean result;
	//생성자 ,toString(), setter, getter로 만들자. 
	public Day(boolean a) {
		this.result =a; 
		// TODO Auto-generated constructor stub
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public void setResult(boolean result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "Day [title=" + title +"\n"+ ", date=" + date +"\n"+", desc=" + desc + "\n"+", result=" + result + "]";
	}
	
}
