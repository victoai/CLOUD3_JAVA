package day23.추가;

import java.util.Scanner;
 
 

public class 상품관리프로그램작성4 {

    private Scanner sc = new Scanner(System.in);
    private String[] goods = new String[5];
    private int index = 0;

    public static void main(String[] args) {
        상품관리프로그램작성4 app = new 상품관리프로그램작성4();
        app.run();
    }

    public void run() {
        loop: while (true) {
            System.out.println("메뉴를 선택하세요 1. 등록, 2.조회 , 3.변경, 4.삭제 ,5. 종료");
            String menu = sc.nextLine();

            switch (menu) {
                case "1":
                    등록하기();
                    break;
                case "2":
                    조회하기();
                    break;
                case "3":
                    변경하기();
                    break;
                case "4":
                    삭제하기();
                    break;
                case "5":
                    System.out.println("종료");
                    break loop;
                default:
                    System.out.println("잘못된 메뉴");
                    System.exit(0);
            }
        }
    }

    public void 삭제하기() {
        System.out.println("삭제");
        조회하기();
        System.out.println("삭제할 상품을 선택하시오");
        String choice_ = sc.nextLine();
        int choice = Integer.parseInt(choice_);
        goods[choice - 1] = "0";
    }

    public void 변경하기() {
        System.out.println("변경");
        조회하기();
        System.out.println("변경할 상품을 선택하세요");
        String choice_ = sc.nextLine();
        int choice = Integer.parseInt(choice_);
        System.out.println("변경할 상품의 이름을 입력하세요");
        String newName = sc.nextLine();
        goods[choice - 1] = newName;
    }

    public void 등록하기() {
        if (index >= goods.length) {
            System.out.println("더 이상 등록할 수 없습니다.");
            return;
        }
        System.out.println("등록할 상품을 입력하세요");
        String name = sc.nextLine();
        goods[index] = name;
        index++;
    }

    public void 조회하기() {
        System.out.println("상품을 조회합니다");
        for (int i = 0; i < index; i++) {
            if (!goods[i].equals("0")) {
                System.out.println((i + 1) + ". " + goods[i]);
            }
        }
    }
}
