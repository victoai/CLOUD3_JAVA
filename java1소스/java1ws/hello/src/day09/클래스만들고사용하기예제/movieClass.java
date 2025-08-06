package day11.클래스만들고사용하기예제;

public class movieClass {

	String title;
	String genre;
	String runningtime;
	String rating;
	
	public void input (String title, String genre, String runningtime, String rating) {
		this.title=title;
		this.genre=genre;
		this.runningtime=runningtime;
		this.rating=rating;
		
	}
	public void printInfo() {
		System.out.println("제목:"+title);
		System.out.println("장르:"+genre);
		System.out.println("상영시간:"+runningtime);
		System.out.println("관람가:"+rating+"\n");
		
	}
	
}
