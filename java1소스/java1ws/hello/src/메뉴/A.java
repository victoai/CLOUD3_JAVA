package 메뉴;

import java.util.HashMap;
import java.util.Scanner;

public class A {

    // 회원 정보를 저장할 HashMap (아이디와 비밀번호)
    private static HashMap<String, String> users = new HashMap<>();
    private static boolean isLoggedIn = false;
    private static String loggedInUser = null;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        users.put("acorn", "acorn");

        while (true) {
            showMainMenu(scanner);
        }
    }

    // 메인 메뉴 (로그인 여부와 상관없이 메뉴 보여줌)
    private static void showMainMenu(Scanner scanner) {
        System.out.println("=== 메인 메뉴 ===");
        System.out.println("1. 로그인");
        System.out.println("2. 회원가입");
        System.out.println("3. 메뉴 주문");
        System.out.println("4. 종료");
        System.out.print("메뉴를 선택하세요: ");
        
        int choice = scanner.nextInt();
        scanner.nextLine();  // 엔터 처리

        switch (choice) {
            case 1:
                login(scanner);
                break;
            case 2:
                signUp(scanner);
                break;
            case 3:
                orderMenu(scanner);
                break;
            case 4:
                System.out.println("프로그램을 종료합니다.");
                System.exit(0);
                break;
            default:
                System.out.println("잘못된 선택입니다.");
        }
    }

    // 메뉴 주문 처리
    private static void orderMenu(Scanner scanner) {
        if (!isLoggedIn) {
            System.out.println("먼저 로그인 해주세요.");
            return;  // 로그인하지 않았으면 주문을 진행할 수 없음
        }

        System.out.println("=== 메뉴 주문 ===");
        System.out.println("1. 커피");
        System.out.println("2. 샌드위치");
        System.out.println("3. 음료수");
        System.out.println("4. 종료");
        System.out.print("주문할 메뉴를 선택하세요: ");
        
        int orderChoice = scanner.nextInt();
        scanner.nextLine();  // 엔터 처리
        
        switch (orderChoice) {
            case 1:
                System.out.println("커피를 주문하셨습니다.");
                break;
            case 2:
                System.out.println("샌드위치를 주문하셨습니다.");
                break;
            case 3:
                System.out.println("음료수를 주문하셨습니다.");
                break;
            case 4:
                System.out.println("메뉴 주문을 종료합니다.");
                break;
            default:
                System.out.println("잘못된 선택입니다.");
        }
    }

    // 로그인 처리
    private static void login(Scanner scanner) {
        System.out.print("아이디: ");
        String id = scanner.nextLine();
        System.out.print("비밀번호: ");
        String password = scanner.nextLine();

        if (users.containsKey(id) && users.get(id).equals(password)) {
            loggedInUser = id;
            isLoggedIn = true;
            System.out.println("로그인 성공!");
        } else {
            System.out.println("아이디 또는 비밀번호가 잘못되었습니다.");
        }
    }

    // 회원가입 처리
    private static void signUp(Scanner scanner) {
        System.out.print("아이디: ");
        String id = scanner.nextLine();
        System.out.print("비밀번호: ");
        String password = scanner.nextLine();

        if (users.containsKey(id)) {
            System.out.println("이미 존재하는 아이디입니다.");
        } else {
            users.put(id, password);
            System.out.println("회원가입 성공!");
        }
    }
}
