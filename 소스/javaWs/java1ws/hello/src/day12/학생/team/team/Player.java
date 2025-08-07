package day12.학생.team.team;

public class Player extends Team{

	String playerName;
	String playerPosition;
	
	public Player() {	}
	
	public Player(String teamName, String name, String position) {
		super(teamName);
		this.playerName = name;
		this.playerPosition = position;
	}

	public void playGame() {
		System.out.println("야구선수");
	}


	@Override
	
	public void info() {
		super.info();
		System.out.println("이름 : " + playerName + ", 포지션 : " + playerPosition);
	}
	
	
}
