package day11.학생.김채운_최문길;

import java.util.Scanner;

public class DayMain {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Day[] works = new Day[3];
        int index = 0;

        while (true) {
            System.out.println("1. 등록 , 2. 조회 , 3. 변경 , 4. 종료 , 5. 오늘의 하루 정리");
            int menu = sc.nextInt();
            sc.nextLine(); // 개행 문자 처리

            switch (menu) {
                // 1. 등록
                case 1:
                    if (index >= works.length) {
                        System.out.println("더 이상 등록할 수 없습니다.");
                        break;
                    }

                    System.out.print("할 일: ");
                    String title = sc.nextLine();
                    System.out.print("날짜: ");
                    String date = sc.nextLine();
                    System.out.print("세부 사항: ");
                    String desc = sc.nextLine();

                    // 새로운 Day 객체 생성 (result 값 없이)
                    Day work = new Day(title, date, desc);
                    works[index] = work;
                    index++;
                    break;

                // 2. 조회
                case 2:
                    System.out.println("조회하기");
                    for (int i = 0; i < index; i++) {
                        System.out.println(works[i].toString());
                    }
                    break;

                // 3. 변경
                case 3:
                    if (index == 0) {
                        System.out.println("변경할 데이터가 없습니다.");
                        break;
                    }

                    System.out.print("변경할 항목의 인덱스: ");
                    int num = sc.nextInt() - 1;
                    sc.nextLine();

                    System.out.print("새 할 일: ");
                    String newTitle = sc.nextLine();
                    works[num].setTitle(newTitle);

                    System.out.print("변경 세부사항: ");
                    String newDesc = sc.nextLine();
                    works[num].setDesc(newDesc);
                    System.out.println("변경이 완료되었습니다.");
                    break;

                // 4. 종료
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    sc.close();
                    return;

                // 5. 오늘의 하루 정리 (실행 여부 입력)
                case 5:
                    if (index == 0) {
                        System.out.println("확인할 데이터가 없습니다.");
                        break;
                    }

                    for (int i = 0; i < index; i++) {
                        System.out.println("할 일: " + works[i].getTitle());
                        System.out.print("실행 여부 (O/X): ");
                        String resultStr = sc.nextLine().trim().toUpperCase();
                        boolean result = resultStr.equals("O");
                        works[i].setResult(result);
                    }

                    System.out.println("--------------------오늘의 하루--------------------");
                    for (int i = 0; i < index; i++) {
                        System.out.println(works[i].toString());
                    }
                    break;

                // 잘못된 메뉴 선택 처리
                default:
                    System.out.println("잘못된 메뉴를 선택했습니다.");
                    break;
            }
        }
    }
}
