package day11.학생.이상민;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
   
   Scanner sc = new Scanner(System.in);
   ArrayList<Day> list = new ArrayList<>(10);
   
   public void run() {
      loop:while (true) {
    	 System.out.println("----------------------");
         System.out.println("  1. 일정 추가\n  2. 일정 삭제\n  3. 일정 수정\n  4. 전체 일정\n  5. 일정 검색\n  6. 종료");
    	 System.out.println("----------------------");
    	 System.out.print(">>> ");
         int menu = sc.nextInt();
         System.out.println();
         sc.nextLine();
         switch (menu) {
         case 1:
            DayAdd();
            break;
         case 2:
            DayDelete();
            break;
         case 3:
            Modify();
            break;
         case 4:
            PrintAll();
            break;
         case 5:
            Print();
            break;
         case 6:
            System.out.println(" message) 종료합니다");
            break loop;
         default:
            break;
         }
      }
      
   }
   
   public void DayAdd() {
	   System.out.println(" message) 일정을 추가합니다.");
       System.out.println("----------------------");
       System.out.print(" 일정 제목 : ");
       String name = sc.nextLine();
       System.out.print(" 일정 날짜 : ");
       String date = sc.nextLine();
       System.out.print(" 일정 내용 : ");
       String desc = sc.nextLine();
       System.out.println();
       list.add(new Day(name, date, desc));
       System.out.println(" message) 일정이 무사히 추가되었습니다.");
       System.out.println("----------------------");
       System.out.println();
   }
   
   public void DayDelete() {
      PrintAll();
      System.out.print("삭제할 일정의 제목을 입력해주세요 : ");
      String name = sc.nextLine();
      System.out.println("----------------------");
      System.out.println();
      for (int i = 0; i < list.size(); i++) {
         if(name.equals(list.get(i).getTitle())) {
            list.remove(i);
            System.out.println(" message) 일정이 무사히 제거되었습니다.");
            break;
         } else if (i == list.size()-1) {
        	 System.out.println(" message) 제목을 다시 확인해주세요!");
         }
      }
      System.out.println("----------------------");
      System.out.println();
   }
   
   public void Modify() {
	   PrintAll();
       System.out.print("수정하고자 하는 메모의 제목을 입력해주세요 : ");
       String input = sc.nextLine();
       System.out.println("----------------------");
         for (Day d : list) {
            if (d.getTitle().equals(input)) {
               System.out.println();
               sc.toString();
               loop: while (true) {
            	   System.out.println("----------------------");
                  System.out.println("  1 : 제목 수정");
                  System.out.println("  2 : 날짜 수정");
                  System.out.println("  3 : 내용 수정");
                  System.out.println("  0 : 수정 종료");
                  System.out.println("----------------------");
                  System.out.println();
                  System.out.print("수정할 요소를 선택해주세요 : ");
                  int inputNum = sc.nextInt();
                  sc.nextLine();
                  System.out.println();
                  System.out.println("----------------------");
                  switch (inputNum) {
                  case 1:
                     System.out.print("수정할 제목을 입력해주세요 : ");
                     String inputTitle = sc.nextLine();
                     d.setTitle(inputTitle);
                     System.out.println(" message) 수정되었습니다.");
                     System.out.println();
                     break;
                  case 2:
                     System.out.print("수정할 날짜를 입력해주세요 : ");
                     String inputDate = sc.nextLine();
                     d.setDate(inputDate);
                     System.out.println(" message) 수정되었습니다.");
                     System.out.println();
                     break;
                  case 3:
                     System.out.print("수정할 내용을 입력해주세요 : ");
                     String inputDesc = sc.nextLine();
                     d.setDesc(inputDesc);
                     System.out.println(" message) 수정되었습니다.");
                     System.out.println();
                     break;
                  case 0:
                     break loop;
                  default:
                     break;
               }
               }
               System.out.println(" message) 수정이 모두 종료되었습니다.");
               System.out.println("----------------------");
               System.out.println();
            }
         }
      }
   
   public void PrintAll() {
         for (Day d : list) {
            System.out.println(d.toString());
         }
      }
   
    public void Print() {
         System.out.print("찾고자 하는 일정의 제목을 입력해주세요 : ");
         String input = sc.nextLine();
         for (Day d : list) {
            if (d.getTitle().equals(input)) {
              System.out.println(d.toString());
            }
         }
      }

   public static void main(String[] args) {
	   Main main = new Main();
       main.run();
   }
}

