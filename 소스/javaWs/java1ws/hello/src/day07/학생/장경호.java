package day07.학생;

import java.util.Scanner;

public class 장경호 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Boolean loop = true;
        
        String[][] menu = menu();
        while (loop) {
            int in = home();
            switch (in) {
                case 1:
                    show(menu);
                    break;
                case 2:
                    System.out.println("추가하고 싶은 메뉴를 입력해주세요.");
                    String add_menu = sc.nextLine();
                    System.out.println("메뉴의 가격을 입력해주세요.");
                    String add_cost = sc.nextLine();
                    menu = add(add_menu, add_cost, menu);
                    break;
                case 3:
                    show(menu);
                    System.out.println("삭제하고 싶은 메뉴를 입력해주세요.");
                    int num = sc.nextInt();
                    sc.nextLine();
                    menu = delete(num, menu);
                    show(menu);
                    break;
                case 4:
                    loop = false;
                    break;
                default:
                    System.out.println("입력오류");
            }
            
        }
        System.out.println("프로그램을 종료합니다.");

    }

    public static int home() {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------메뉴-------");
        System.out.println("1: 메뉴 확인");
        System.out.println("2: 추가");
        System.out.println("3: 삭제");
        System.out.println("4: 종료");
        System.out.println("------------------");

        int input = sc.nextInt();
        sc.nextLine();

        return input;
    }

    public static String[][] menu() {
        String[][] menu = {
                { "아메리카노", "3500" },
                { "카페라떼", "4500" },
                { "딸기스무디", "6000" },
                { "그린티", "4500" },
        };

        return menu;
    }

    public static void show(String[][] menu) {
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i][0] + " " + menu[i][1]);
        }
    }

    public static String[][] add(String a, String b, String[][] menu) {
        String[][] n_menu = new String[menu.length + 1][2];
        for (int i = 0; i < menu.length; i++) {
            n_menu[i][0] = menu[i][0];
            n_menu[i][1] = menu[i][1];
        }
        n_menu[menu.length][0] = a;
        n_menu[menu.length][1] = b;
        return n_menu;
    }
    public static String[][] delete(int a, String[][] menu) {
        String[][] result = new String[menu.length-1][2];

        int copyIndex = 0;
        for (int i = 0; i < menu.length; i++) {
            if (i == a-1) {
                continue;
            }
            result[copyIndex++] = menu[i];
        }
        return result;

    }
}
