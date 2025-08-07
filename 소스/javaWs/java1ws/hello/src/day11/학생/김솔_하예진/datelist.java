package day11.학생.김솔_하예진;

public class datelist {

	static String title;
	static String date;
	static int enddate;

	public datelist(String title, String date, int enddate) {
		this.title = title;
		this.date = date;
		this.enddate = enddate;
	}

	public static void printTitle(){
		System.out.println(date);
		System.out.println();
		System.out.println("일정 내용: " + title);
		System.out.println("남은 날짜: " + enddate + "일");
		System.out.println();
	}
}
