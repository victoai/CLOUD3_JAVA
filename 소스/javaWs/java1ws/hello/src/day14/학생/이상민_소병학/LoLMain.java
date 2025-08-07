package day14.학생.이상민_소병학;

import java.util.Scanner;

public class LoLMain {

    public static void main(String[] args) {
        new LoLMain().run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("사용할 챔피언 이름을 입력하세요 (예: Vayne, Ahri, Yasuo, LeeSin, Lux): ");
        String champName = scanner.nextLine();

        ChampInterface champion = null;
        
        // 입력된 챔피언 이름에 따라 챔피언 객체 생성
        switch (champName.toLowerCase()) {
            case "vayne":
                champion = new Vayne();
                break;
            case "ahri":
                champion = new Ahri();
                break;
            case "yasuo":
                champion = new Yasuo();
                break;
            case "leesin":
                champion = new LeeSin();
                break;
            case "lux":
                champion = new Lux();
                break;
            default:
                System.out.println("유효하지 않은 챔피언 이름입니다.");
                return;
        }
        
        System.out.println("스킬 키를 입력하세요 (Q, W, E, R, D, F): ");
        while (true) {
            String skillKey = scanner.nextLine().toLowerCase();

            switch (skillKey) {
                case "q":
                    champion.Q();
                    break;
                case "w":
                    champion.W();
                    break;
                case "e":
                    champion.E();
                    break;
                case "r":
                    champion.R();
                    break;
                case "d":
                    champion.D();
                    break;
                case "f":
                    champion.F();
                    break;
                default:
                    System.out.println("유효하지 않은 스킬 키입니다.");
            }
        }
    }
}
