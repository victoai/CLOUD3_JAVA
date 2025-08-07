package day12.학생.team.team;

public class Coach extends Team{

	String coachName;
	String coachPosition;
	
	public Coach() {	}
	public Coach(String teamName, String coachName, String coachPosition) {
		super(teamName);
		this.coachName = coachName;
		this.coachPosition = coachPosition;
	}
	
	public void coachGame() {
		System.out.println("코치");
	}
	
	@Override
	public void info() {
		super.info();
		System.out.println( "이름 : " + coachName + ", 포지션 : " + coachPosition);
	}
	
	
	
	
	
}
