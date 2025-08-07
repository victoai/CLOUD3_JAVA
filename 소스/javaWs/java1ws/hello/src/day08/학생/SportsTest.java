package day08.학생;

public class SportsTest {

	public static void main(String[] args) {
		
		Sports s1 = new Sports();
		s1.name = "축구";
		s1.teamBased = true;
		s1.playerCount = 11;
		s1.durations = 90;
		
		Sports s2 = new Sports();
		s2.name = "야구";
		s2.teamBased = true;
		s2.playerCount = 10;
		s1.durations = 210;
		
		Sports s3 = new Sports();
		s3.name = "골프";
		s3.teamBased  = false;
		s3.playerCount = 1;
		s3.durations = 240;

		getInfo(s1);
		getInfo(s2);
		getInfo(s3);

		

	}
	private static void getInfo(Sports sports){
		System.out.println(sports.name + "는 " + (sports.teamBased ? "팀 스포츠" : "개인 스포츠") + "로 "
		+ sports.playerCount +  "명의 선수가 참가하며 경기 시간은 약 " + sports.durations + "분 입니다.");
	}
}
