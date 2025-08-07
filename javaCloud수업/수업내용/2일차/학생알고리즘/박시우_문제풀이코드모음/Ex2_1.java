package hello;

public class Ex2_1 {
    public static void main(String[] args) {
        final double H_INCREASE_RATE = 0.036, K_INCREASE_RATE = 0.042;
        int year = 1999;
        int h_population = 2500000, k_population = 1800000;

        while (h_population > k_population) {
            int h_tmp = (int) (h_population * H_INCREASE_RATE);
            int k_tmp = (int) (k_population * K_INCREASE_RATE);

            h_population += h_tmp;
            k_population += k_tmp;
            year++;

            if (k_population >= h_population) {
                System.out.printf("인구가 교차하는 지점은 %d년 입니다\n", year);
                break;
            }
        }
    }
}
