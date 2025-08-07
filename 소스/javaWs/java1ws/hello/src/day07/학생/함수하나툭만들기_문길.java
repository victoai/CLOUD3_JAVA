package day07.학생;

import java.util.Scanner;

public class 함수하나툭만들기_문길 {

    private static String studentName;
    private static int studentAge;
    private static int studentGrade;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("메뉴: 1.등록, 2.조회, 3.변경, 4.종료");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    registerStudent(sc);
                    break;
                case 2:
                    viewStudent();
                    break;
                case 3:
                    changeStudent(sc);
                    break;
                case 4:
                    System.out.println("종료");
                    sc.close();
                    return; 
            }
        }
    }

    private static void registerStudent(Scanner sc) {
        System.out.println("학생 이름을 입력하세요:");
        studentName = sc.next();
        System.out.println("학생 나이를 입력하세요:");
        studentAge = sc.nextInt();
        System.out.println("학생 학년을 입력하세요:");
        studentGrade = sc.nextInt();
        System.out.println("학생 정보가 등록되었습니다.");
    }

    private static void viewStudent() {
        if (studentName == null) {
            System.out.println("등록된 학생이 없습니다.");
        } else {
            System.out.println("학생 이름: " + studentName);
            System.out.println("학생 나이: " + studentAge);
            System.out.println("학생 학년: " + studentGrade);
        }
    }

    private static void changeStudent(Scanner sc) {
        if (studentName == null) {
            System.out.println("학생을 등록해주세요.");
        } else {
            registerStudent(sc);
            System.out.println("학생 정보가 변경되었습니다.");
        }
    }
}
