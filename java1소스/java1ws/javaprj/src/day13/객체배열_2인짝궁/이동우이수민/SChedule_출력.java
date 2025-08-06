package day13.객체배열_2인짝궁.이동우이수민;

import java.util.Scanner;



public class SChedule_출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 Schedule sch = new Schedule();
	        
	        
	        while(true) {
	        	 System.out.println("1. 일정 조회, 2. 일정 등록, 3. 일정 변경, 4. 일정 삭제, 5. 종료");
	             int menu = sc.nextInt();
	             
	             switch(menu) {
	             case 1:
	            	sch.printSchedule();
	            	break;
	            	
	             case 2:
	            	 System.out.println("등록하실 카테고리를 입력해 주세요");
	            	 System.out.println("1. 취미, 2. 공부, 3. 개인일정");
	            	 int categoryNum = sc.nextInt();
	            	 
	            	 //일정제목 입력하고 날짜 입력 할 수 있게 nextLine();을 사용할 때는 초기화가 될 수 있게 
	            	 // 한번 더 사용해 주어야 한다 (즉 버퍼를 지워줘야 한다)
	            	 sc.nextLine();
	            	 
	            	 System.out.println("일정 제목을 입력하세요:");
	                    String title = sc.nextLine();
	                    
	                    System.out.println("일정 날짜를 입력하세요 (3월 1일):");
	                    String date = sc.nextLine();
	                    
	                    Schedule newSchedule = new Schedule(title, date);
	                 
	                
	                    String category = getCategoryName(categoryNum);
	                    if (category.isEmpty()) {
	                        System.out.println("잘못된 입력입니다.");
	                        break;
	                    }
	                    
	                    sch.addSchedule(category, newSchedule);
	                    break;
	                    
	             case 3:
	            	 System.out.println("변경할 일정의 카테고리를 선택해 주세요");
	            	 System.out.println("1. 취미, 2. 공부, 3. 개인일정");
	            	 int updateNum = sc.nextInt();
	            	 sc.nextLine();
	            	 
	            	 System.out.println("변경할 일정의 번호를 입력하세요 (0부터 시작):");
	            	 int updateIndex = sc.nextInt();
	            	 
	            	 sc.nextLine();
	            	 
	            	 System.out.println("새로운 일정 제목을 입력하세요:");
	            	 String newTitle = sc.nextLine();
	            	 
	            	 String updateCategory = getCategoryName(updateNum);
	            	 if (updateCategory.isEmpty()) {
	            	     System.out.println("잘못된 입력입니다.");
	            	 }
	            	    
	            	 sch.setSchedule(updateCategory, updateIndex, newTitle);  // 일정 변경
	            	 
	            	 break;
	            	 
	             case 4:
	            	 System.out.println("변경할 일정의 카테고리를 선택해 주세요");
	            	 System.out.println("1. 취미, 2. 공부, 3. 개인일정");
	            	 int deleteNum = sc.nextInt();
	            	 sc.nextLine();
	            	 
	            	 System.out.println("삭제할 일정의 번호를 입력하세요 (0부터 시작):");
	            	 int deleteIndex = sc.nextInt();
	            	 
	            	 String deleteCategory = getCategoryName(deleteNum);
	            	 if (deleteCategory.isEmpty()) {
	            	     System.out.println("잘못된 입력입니다.");
	            	 }
	            	    
	            	 sch.deleteSchedule(deleteCategory, deleteIndex );  // 일정 변경
	            	 
	            	 break;
	             }
	        }
	}
	
	
	//카테고리 숫자를 문자열로 바꿔줌
	 private static String getCategoryName(int categoryNum) {
	        if (categoryNum == 1) return "취미";
	        if (categoryNum == 2) return "공부";
	        if (categoryNum == 3) return "개인일정";
	        return "";
	    }

}
