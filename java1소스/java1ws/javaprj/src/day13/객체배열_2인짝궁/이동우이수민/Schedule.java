package day13.객체배열_2인짝궁.이동우이수민;

import java.util.Scanner;

public class Schedule {
	 Scanner sc = new Scanner(System.in);
	    
	    String title;
	    String date;
	    String[] categories = {"취미", "공부", "개인일정"};

	    Schedule[] hobbyIndex = new Schedule[5];
	    Schedule[] studyIndex = new Schedule[5];
	    Schedule[] perIndex = new Schedule[5];

	    int indexH = 0;
	    int indexS = 0;
	    int indexP = 0;

	    public Schedule() {
	    }

	    public Schedule(String title, String date) {
	        this.title = title;
	        this.date = date;
	    }
	    
	    public String toString() {
	    	return "제목 : " + title + ", " + "날짜 : " + date;
	    }
	    
	 // 카테고리 배열에서 인덱스 반환 (찾지 못하면 -1)
	    public int selectCategory(String category) {
	        for (int i = 0; i < categories.length; i++) {
	            if (categories[i].equals(category)) {
	                return i;
	            }
	        }
	        return -1;
	    }
	    
	    //일정 조회
	    public void printSchedule() {
	    	  System.out.println("=== 일정 조회 ===");
	          
	          // 취미 일정 출력
	          System.out.println("[취미]");
	          if (indexH == 0) {
	              System.out.println("등록된 일정이 없습니다.");
	          } else {
	              for (int i = 0; i < indexH; i++) {
	                  System.out.println("=> " + hobbyIndex[i]);
	              }
	          }

	          // 공부 일정 출력
	          System.out.println("\n[공부]");
	          if (indexS == 0) {
	              System.out.println("등록된 일정이 없습니다.");
	          } else {
	              for (int i = 0; i < indexS; i++) {
	                  System.out.println("=> " + studyIndex[i]);
	              }
	          }

	          // 개인 일정 출력
	          System.out.println("\n[개인 일정]");
	          if (indexP == 0) {
	              System.out.println("등록된 일정이 없습니다.");
	          } else {
	              for (int i = 0; i < indexP; i++) {
	                  System.out.println("=> " + perIndex[i]);
	              }
	          }
	    }
	    
	    //일정 등록
	    public void addSchedule(String category, Schedule scMemo) {
	    	int i = selectCategory(category);
	    	
	    	if (i == -1) {
	            System.out.println("해당 카테고리는 존재하지 않습니다.");
	            return;
	        }else if(i == 0) {
	        	 hobbyIndex[indexH] = scMemo;
	             indexH++;
	             System.out.println("취미 일정이 추가되었습니다.");
	            
	        }else if(i == 1) {
	        	studyIndex[indexS] = scMemo;
	        	indexS++;
	             System.out.println("공부 일정이 추가되었습니다.");
	           
	        }else if(i == 2) {
	        	perIndex[indexP] = scMemo;
	        	indexP++;
	             System.out.println("개인 일정이 추가되었습니다.");
	           
	        }
	    	
	    }
	    
	 // 일정 변경
	 // 일정 변경
	    public void setSchedule(String category, int index, String newTitle) {
	        int i = selectCategory(category);  // 카테고리 인덱스를 찾음
	        
	        if (i == -1) {
	            System.out.println("해당 카테고리는 존재하지 않습니다.");
	            return;
	        }

	        
	        if(i == 0) {
	        	 hobbyIndex[index].title = newTitle;
	        	 System.out.println("취미 일정이 변경되었습니다: " + hobbyIndex[index]);
	        }else if(i == 1) {
	        	studyIndex[index].title = newTitle;
	        	 System.out.println("취미 일정이 변경되었습니다: " + studyIndex[index]);
	        }else if(i == 2) {
	        	perIndex[index].title = newTitle;
	        	 System.out.println("취미 일정이 변경되었습니다: " + perIndex[index]);
	        }
	       
	    }


	    
	    //
	 // 일정 삭제
	    public void deleteSchedule(String category, int index) {
	        int i = selectCategory(category);  // 카테고리 인덱스를 찾음
	        
	        if (i == -1) {
	            System.out.println("해당 카테고리는 존재하지 않습니다.");
	            return;
	        }

	        // 카테고리에 따라 삭제 작업
	        if (i == 0) {  // 취미 일정
	                for (int j = index; j < indexH - 1; j++) {
	                    hobbyIndex[j] = hobbyIndex[j + 1];
	                }
	                hobbyIndex[indexH - 1] = null;  // 마지막 항목은 null로 설정
	                indexH--;  // 카운트 감소
	                System.out.println("취미 일정이 삭제되었습니다.");
	                
	            }   else if (i == 1) {  // 공부 일정
	           
	                for (int j = index; j < indexS - 1; j++) {
	                    studyIndex[j] = studyIndex[j + 1];
	                }
	                studyIndex[indexS - 1] = null;  // 마지막 항목은 null로 설정
	                indexS--;  // 카운트 감소
	                System.out.println("공부 일정이 삭제되었습니다.");
	            } else if (i == 2) {  // 개인 일정
	           
	                for (int j = index; j < indexP - 1; j++) {
	                    perIndex[j] = perIndex[j + 1];
	                }
	                perIndex[indexP - 1] = null;  // 마지막 항목은 null로 설정
	                indexP--;  // 카운트 감소
	                System.out.println("개인 일정이 삭제되었습니다.");
	            } 
	        }
	    

	    
	    
	    }
	    
	

