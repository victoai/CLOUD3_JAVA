package day12.학생.CellPhone;

public class Main {
	
	public static void main(String[] args) {
		
		CellPhone[] cellphones = new CellPhone[2];
		
		// 업캐스팅
		cellphones[0] = new IPhone("아이폰15", "애플", "블랙", "010-1234-5678", "qwer1234");
		cellphones[1] = new Galaxy("갤럭시S23", "삼성", "라벤더", "010-9876-5432", "asdf5678");
		
		for(int i=0; i<cellphones.length; i++) {
			cellphones[i].on();
			
			// 다운캐스팅
			if(cellphones[i] instanceof IPhone) {
				((IPhone)cellphones[i]).appleLogin();
			} else if(cellphones[i] instanceof Galaxy) {
				((Galaxy)cellphones[i]).googleLogin();
			}
			
			cellphones[i].call();
			cellphones[i].sendMessage();
			cellphones[i].runApplication();
			
			System.out.println();
		}
	
	}

}
