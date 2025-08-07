package day06.학생.박시우;

import java.util.Scanner;

public class 일주일_일정관리_박시우 {
    public static void main(String[] args) {
        String[][] schedule = new String[7][7];
        Scanner sc = new Scanner(System.in);
        int[] idx_each = new int[7];

        loop:
        while (true) {
            System.out.print("일정을 추가하려면 요일을 입력 후 일정을 입력하고 \n" +
                    "조회, 삭제, 종료를 하려면 '조회', '삭제', '종료' 를 입력하세요: ");
            String day = sc.next();

            switch (day) {
                case "월": case "화": case "수": case "목": case "금": case "토": case "일":
                    int dayIndex = getDayIndex(day);
                    if (idx_each[dayIndex] >= 7) { // 최대 7개 일정 제한
                        System.out.println("더 이상 일정을 추가할 수 없습니다.");
                        continue;
                    }
                    System.out.print("추가할 일정을 입력하세요: ");
                    schedule[dayIndex][idx_each[dayIndex]] = sc.next();
                    idx_each[dayIndex]++;
                    break;

                case "조회":
                    System.out.print("월요일부터 일요일까지 1~7의 숫자로 조회할 날짜를 입력하세요: ");
                    int when_check = sc.nextInt();
                    if (when_check < 1 || when_check > 7 || idx_each[when_check - 1] == 0) {
                        System.out.println("조회할 일정이 없습니다.");
                        continue;
                    }
                    System.out.println("해당 요일 일정:");
                    for (int i = 0; i < idx_each[when_check - 1]; i++) {
                        System.out.println((i + 1) + ". " + schedule[when_check - 1][i]);
                    }
                    break;

                case "삭제":
                    System.out.print("월요일부터 일요일까지 1~7의 숫자로 일정을 삭제할 날짜를 입력하세요: ");
                    int when_delete = sc.nextInt() - 1;
                    if (when_delete < 0 || when_delete > 6 || idx_each[when_delete] == 0) {
                        System.out.println("삭제할 일정이 없습니다.");
                        continue;
                    }

                    System.out.println("삭제할 일정의 번호를 입력하세요: ");
                    for (int i = 0; i < idx_each[when_delete]; i++) {
                        System.out.println((i + 1) + ". " + schedule[when_delete][i]);
                    }
                    int what_delete = sc.nextInt() - 1; 

                    if (what_delete < 0 || what_delete >= idx_each[when_delete]) {
                        System.out.println("잘못된 번호입니다.");
                        continue;
                    }

                    for (int i = what_delete; i < idx_each[when_delete] - 1; i++) {
                        schedule[when_delete][i] = schedule[when_delete][i + 1];
                    }
                    schedule[when_delete][idx_each[when_delete] - 1] = null;
                    idx_each[when_delete]--;
                    System.out.println("일정이 삭제되었습니다.");
                    break;

                case "종료":
                    System.out.println("종료합니다.");
                    break loop;

                default:
                    System.out.println("올바른 입력이 아닙니다. 다시 입력하세요.");
            }
        }
        sc.close();
    }

    // 요일을 숫자로 변환하는 함수
    public static int getDayIndex(String day) {
        switch (day) {
            case "월": return 0;
            case "화": return 1;
            case "수": return 2;
            case "목": return 3;
            case "금": return 4;
            case "토": return 5;
            case "일": return 6;
            default: return -1;
        }
    }
}
