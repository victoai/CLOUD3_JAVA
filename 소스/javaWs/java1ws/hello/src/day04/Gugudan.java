package day04;

public class Gugudan {
    public static void main(String[] args) {
        int dan = 2; // 2단부터 시작

        do {
            int num = 1; // 곱해지는 숫자 (1~9)
            do {
                System.out.println(dan + " x " + num + " = " + (dan * num));
                num++;
            } while (num <= 9); // 1~9까지 반복

            System.out.println(); // 단 사이에 줄바꿈
            dan++;
        } while (dan <= 9); // 2~9단까지 반복
    }
}
