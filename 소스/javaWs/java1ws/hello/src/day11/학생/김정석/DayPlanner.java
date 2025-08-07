package day11.학생.김정석;

import java.util.Scanner;

public class DayPlanner {

	private static int idx = 0;
	Day[] days = new Day[3];
	

	Scanner sc = new Scanner(System.in);

	public void run() {
		while (true) {
			System.out.println("메뉴선택 1.추가, 2.전체조회, 3.수정, 4.삭제, 5.검색, 6.종료");
			
			int menu = Integer.parseInt(sc.next());
			
		//	int menu = sc.nextInt();
			sc.nextLine();
			switch (menu) {
			case 1:
				System.out.println("추가");
				add();
				break;
			case 2:
				System.out.println("전체조회");
				printAll();
				break;

			case 3:
				System.out.println("수정");
				update();
				break;

			case 4:
				System.out.println("삭제");
				delete();
				break;
			case 5:
				System.out.println("검색");
				break;
			case 6:
				System.out.println("종료");
				System.exit(0);
				break;
			default:
				System.out.println("잘못 입력");
			}
		}
	}

	//추가
	public void add() {
		if (idx == days.length) {
			System.out.println("글을 추가할수 없습니다");
			return;
		}
		
		System.out.println("일정입력(제목, 내용, 예정일)");
		String title = sc.nextLine();
		
		if(isSearchTitleExist(title)) {
			System.out.println("이미 존재합니다"); 
			return;
		}
		String desc = sc.nextLine();
		String dueDate = sc.nextLine();
		
		Day day = new Day(idx + 1, title, desc, dueDate);
		days[idx++] = day;
		System.out.println("입력완료");
	}

	// 전체조회
	public void printAll() {
		for (int i = 0; i < idx; i++) {
			System.out.println("-------------------------------------------");
			System.out.println("[" + days[i].getTitleNum() + "]");
			System.out.println("[제목] : " + days[i].getTitle());
			System.out.println("[작성일] : " + days[i].getCreatedAt());
			System.out.println("[내용] : " + days[i].getDesc());
			System.out.println("[예정일] : " + days[i].getDueDate());
			System.out.println("-------------------------------------------");
		}
	}

	//수정
	public void update() {
		System.out.println("수정할 글 제목 : ");
		String searchTitle = sc.nextLine();
		
		if(!isSearchTitleExist(searchTitle)) {
			System.out.println("수정할 글이 없습니다");
			return;
		}

		System.out.println("제목 수정 : ");
		String updateTitle = sc.nextLine();
		for (int i = 0; i < idx; i++) {
			String title = days[i].getTitle();
			if (searchTitle.equals(title)) {
				days[i].setTitle(updateTitle);
			}
		}

	}
	
	//검색
//	public void search() {
//		int searchIdx;
//		System.out.println("검색할 글 제목 : ");
//		String searchTitle = sc.nextLine();
//		
//		if(!isSearchTitleExist(searchTitle)) {
//			System.out.println("글이 존재하지 않습니다");
//			return;
//		}
//		
//		
//		for (int i = 0; i < idx; i++) {
//			String title = days[i].getTitle();
//			if (searchTitle.equals(title)) {
//				searchIdx = i;
//			}
//		}
//		
//		System.out.println("-------------------------------------------");
//		System.out.println("[" + days[searchIdx].getTitleNum() + "]");
//		System.out.println("[제목] : " + days[searchIdx].getTitle());
//		System.out.println("[작성일] : " + days[searchIdx].getCreatedAt());
//		System.out.println("[내용] : " + days[searchIdx].getDesc());
//		System.out.println("[예정일] : " + days[searchIdx].getDueDate());
//		System.out.println("-------------------------------------------");
//	}	

	//삭제
	public void delete() {
		 System.out.println("삭제할 글 번호 : ");
	        int deleteTitleNum = sc.nextInt();
	        sc.nextLine();

	        int deleteIdx = findIndexByTitleNum(deleteTitleNum); // titleNum을 통해 인덱스 찾기

	        if (deleteIdx == -1) {
	            System.out.println("해당 번호를 가진 글이 없습니다.");
	            return;
	        }

	        for (int i = deleteIdx; i < idx - 1; i++) {
	            days[i] = days[i + 1]; 
	        }
	        days[--idx] = null; 
	        System.out.println("삭제 완료");

	}
	
	
	
	//타이틀 인덱스를 받아서 객체배열을 순회하면서 타이틀 인덱스를 검색하는 메서드
	public int findIndexByTitleNum(int titleNum) {
        for (int i = 0; i < idx; i++) {
            if (days[i].getTitleNum() == titleNum) {
                return i; 
            }
        }
        return -1;
    }
	
	
	// 객체배열안에 매개변수로 받은 타이틀이 있는지 찾는 메서드
	public boolean isSearchTitleExist(String searchTitle) {
		boolean found = false;

		for (int i = 0; i < idx; i++) {
			String title = days[i].getTitle();
			if (searchTitle.equals(title)) {
				found = true;
			}
		}

		if (!found) {
			found = false;
		}
		
		return found;
	}
	
	// 타이틀 인덱스로 검색한게 존재하는지 아닌지 반환하는 메서드
	public boolean isSearchTitleNumExist(int titleNum) {
        return findIndexByTitleNum(titleNum) != -1;
    }

}
