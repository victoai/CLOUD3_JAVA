package day12.학생.team.team;

public class Team {

	String teamName;
	
	public Team() {	}
	public Team(String teamName) {
		this.teamName = teamName;
	}

	public void info() {
		System.out.println(teamName + " 팀 입니다.");
	}
	
}
