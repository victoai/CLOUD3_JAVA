package chap_05.day05;
import java.util.Scanner;
// 임의의 수가 입력되고  입력한 수에 대한 약수를 배열에 저장하고 출력하기
//       - 배열사용하지 않기
//       - 배열을 사용하여 약수를 모두 구한 후 한꺼번에 출력하기

//  * 약수란? 12의 약수 : 1~12 중에서 12를 나누어 떨어지게 하는 수
//  (배열은 입력되 수의 개수로 정한다)
//   입력된 수 15   => 배열을 15개로 한다
//   어떤 수 입력  ->  어떤수에 대한 약수를 배열에 저장하고
//                  한꺼번에 출력하는 프로그램 작성
//   12  -> 1  2  3  4  6 12  출력되어야 함
public class Array_practice6 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // 숫자 입력 받기
            System.out.print("숫자를 입력하세요: ");
            int number = scanner.nextInt();

            // 약수의 개수 먼저 계산
            int count = 0;
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    count++;
                }
            }

            // 약수를 저장할 배열 생성
            int[] divisors = new int[count];

            // 약수 찾아서 배열에 저장
            int index = 0;
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    divisors[index] = i;
                    index++;
                }
            }

            // 결과 출력
            System.out.println(number + "의 약수: ");
            for (int divisor : divisors) {
                System.out.print(divisor + " ");
            }
        }
    }
