package day11.학생.김무궁.일정관리;

public class Schedule {

	String day;
	String work;
	
	public Schedule() {
		
	}
	
	public Schedule(String day, String work) {
		this.day = day;
		this.work = work;
	}

	@Override
	public String toString() {
		return "Schedule [요일=" + day + ", 할 일=" + work + "]";
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}
	
	


	
}
