package chap_05.day05;
// 배열의 평균값보다 큰 요소의 개수 구하기
// int[]  Temperatures  =  { 33 , 35 , 32 , 35  , 36 , 35 , 34  }  ;
public class Array_practice5 {
    public static void main(String[] args) {
    int[] Temperatures = { 33 , 35 , 32 , 35 , 36 , 35 , 34};
    int hap = 0;

        for (int i = 0; i < Temperatures.length; i++) {
            hap += Temperatures[i];
            }

        int avg = hap/Temperatures.length;
        System.out.println("평균값은 "+avg);

        System.out.println("평균보다 큰 값들은");
        for (int i = 0; i < Temperatures.length; i++) {
            if(Temperatures[i] > avg) {
                System.out.println(Temperatures[i]);
            }
        }

    }
}
