package day13.객체배열_2인짝궁.임형택_이정호;

import java.util.ArrayList;
import java.util.Scanner;

public class 일정관리 {
    public static void main(String[] args) {
    	ArrayList<ArrayList<Day>> list = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            list.add(new ArrayList<Day>());
        }

        Scanner scan = new Scanner(System.in);
        String[] weeks = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};

        loop:
        while (true) {
            System.out.print("요일을 입력하세요 (0 ~ 6, 일 ~ 토) : ");
            int week = scan.nextInt();
            scan.nextLine(); 

            System.out.println("\n<" + weeks[week] + ">");

            System.out.print("1.등록, 2.조회, 3.변경, 4.삭제, 5.완료여부 6.종료 : ");
            int menu = scan.nextInt();
            scan.nextLine(); 

            switch (menu) {
                case 1:
                	System.out.print("제목을 입력하세요 : ");
                    String title = scan.nextLine();
                    
                    System.out.print("내용을 입력하세요 : ");
                    String desc = scan.nextLine();

                    list.get(week).add(new Day(title, desc)); 
                    System.out.println("일정이 등록되었습니다.\n");
                    break;

                case 2:
                    if (list.get(week).isEmpty()) {
                        System.out.println("등록된 일정이 없습니다.\n");
                    } else {
                        for (int i = 0; i < list.get(week).size(); i++) {
                            System.out.println((i + 1) + ". " + list.get(week).get(i)); // ✅ 변경된 부분
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.print("수정할 일정 번호를 입력하세요 : ");
                    int update = scan.nextInt();
                    scan.nextLine(); 

                    if (update < 1 || update > list.get(week).size()) {
                        System.out.println("잘못된 일정 번호입니다.\n");
                        break;
                    }

                    System.out.print("새로운 제목을 입력하세요 : ");
                    String newTitle = scan.nextLine();

                    System.out.print("새로운 내용을 입력하세요 : ");
                    String newDesc = scan.nextLine();

                    list.get(week).set(update - 1, new Day(newTitle, newDesc)); 
                    System.out.println("일정이 수정되었습니다.\n");
                    break;

                case 4:
                    System.out.print("삭제할 일정 번호를 입력하세요 : ");
                    int delete = scan.nextInt();
                    scan.nextLine(); 

                    if (delete < 1 || delete > list.get(week).size()) {
                        System.out.println("잘못된 일정 번호입니다.\n");
                        break;
                    }

                    list.get(week).remove(delete - 1); 
                    System.out.println("일정이 삭제되었습니다.\n");
                    break;
                    
                case 5:
                    System.out.print("완료할 일정 번호를 입력하세요: ");
                    int complete = scan.nextInt();
                    scan.nextLine();

                    if (complete < 1 || complete > list.get(week).size()) {
                        System.out.println("잘못된 일정 번호입니다.\n");
                        break;
                    }

                    Day day = list.get(week).get(complete - 1);
                    day.setResult(true);

                    System.out.println("일정이 완료되었습니다!\n");
                    break;

                case 6:
                    System.out.println("프로그램을 종료합니다.");
                    scan.close();
                    break loop;

                default:
                    System.out.println("올바른 메뉴 번호를 입력하세요.\n");
            }
        }
    }
}

