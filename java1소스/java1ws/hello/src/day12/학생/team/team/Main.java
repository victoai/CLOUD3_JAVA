package day12.학생.team.team;

public class Main {

	public static void main(String[] args) {
		
		Team[] arr = new Team[5];
		arr[0] = new Team("삼성 라이온즈");
		arr[1] = new Player("한화", "문동주", "투수");
		arr[2] = new Player("LAD", "오타니", "DH");
		arr[3] = new Coach("LAD", "로버츠","manager");
		arr[4] = new Coach("한화", "김경문", "감독");
		
		for(int i = 0; i<arr.length;i++) {
			arr[i].info();
			if(arr[i] instanceof Player) {
				((Player)arr[i]).playGame();
			}
			if(arr[i] instanceof Coach) {
				((Coach)arr[i]).coachGame();
			}
		}
		
		

	}

}
