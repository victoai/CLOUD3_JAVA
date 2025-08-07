package day06.학생.윤현기;
import java.util.Scanner;

public class CurrencyPurchase_usearray1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 화폐단위 배열
        int[] units = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
        int[] counts = new int[units.length]; // { 0, 0, 0, 0, 0, 0, 0, 0}

        while (true){
            System.out.print("사원명을 입력하세요( 종료를 입력하면 종료 됩니다 ) : ");
            String name = scanner.next();

            if (name.equals("종료")){
                System.out.println("프로그램을 종료합니다");
                break;
            }

            System.out.print("출장비를 입력하세요: ");
            int money = scanner.nextInt();

            System.out.println("\n" + name + "님의 출장비 " + money + "원의 화폐매수:");
            int temp = money;

            // 각 화폐단위별 매수 계산
            for (int i = 0; i < units.length; i++) {
                counts[i] = temp / units[i]; // 만약 10만원을 입력 받았다 // units[0] 50000 , 10만 /5만 = 2만
                temp %= units[i];            // temp = 2만  2만을 나눈 나머지 값이 5만이 되야하므로 5만 * 2만
            }

            // 결과 출력
            for (int i = 0; i < units.length; i++) {
                System.out.println(units[i] + "원권: " + counts[i] + "매");
            }

        }

    }
}

