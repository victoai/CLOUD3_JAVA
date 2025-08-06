package day06.학생.윤현기;
// 1.화폐매수 구하기  문제
// 사원명과  출장비가 입력될 때  출장비에 대한 화폐매수 (고액권부터)를 구하시오
// 화폐단위는 다음과 같다  50000,10000,5000,1000,500,100, 50,10

//ex)
// 361200  - > 오만원: 7   만원:1  , 오천원: 0 , 천원: 1, 오백원: 0 , 백원: 2 , 오십원: 0 , 십원 :0

// 1)사원명과 출장비가 입력되면  화폐매수를 출력하는 프로그램을 작성하시오 (배열 사용 안하는거,  배열사용 하는 거)

// 2)stop 입력될 때 까지  사원명과 출장비가 입력되면 화폐매수를 출력하는 프로그램 작성하시오

// 3) 2과 동일하고 반복이 종료되면 각 화폐별 매수를 출력하는 프로그램을 작성하시오

import java.util.Scanner;

public class currencyPurchase_Noarray1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            while(true){

                System.out.print("사원명을 입력하세요(종료를 입력하면 종료 됩니다): ");
                String name = scanner.next();

                if (name.equals("종료")){
                    System.out.println("프로그램을 종료합니다");
                    break;
                }

                System.out.print("출장비를 입력하세요: ");
                int money = scanner.nextInt();

                System.out.println("\n" + name + "님의 출장비 " + money + "원의 화폐매수:");

                int temp = money;
                int w50000 = temp / 50000;
                temp %= 50000;  //temp를 나눈 나머지 값이 50000이다.
                // 10만원이 입력 됨
                // 100000 / 50000 = 2
                // 2 %= 50000 - - - - > 50000 * 2 = 100000이 나옴

                int w10000 = temp / 10000;
                temp %= 10000;

                int w5000 = temp / 5000;
                temp %= 5000;

                int w1000 = temp / 1000;
                temp %= 1000;

                int w500 = temp / 500;
                temp %= 500;

                int w100 = temp / 100;
                temp %= 100;

                int w50 = temp / 50;
                temp %= 50;

                int w10 = temp / 10;

                System.out.println("50000원권: " + w50000 + "매");
                System.out.println("10000원권: " + w10000 + "매");
                System.out.println("5000원권: " + w5000 + "매");
                System.out.println("1000원권: " + w1000 + "매");
                System.out.println("500원권: " + w500 + "매");
                System.out.println("100원권: " + w100 + "매");
                System.out.println("50원권: " + w50 + "매");
                System.out.println("10원권: " + w10 + "매");

            }
        }
    }


