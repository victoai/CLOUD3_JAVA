package day05;

public class hardarr2 {

	public static void main(String[] args) {
		int[] Temperatures = { 33, 35, 32, 35, 36, 35, 34 };
		int sum = 0;

		for (int i = 0; i < Temperatures.length; i++) {
			sum += Temperatures[i];
		}
		int avg = sum / Temperatures.length;
		int cnt = 0;
		for (int i = 0; i < Temperatures.length; i++) {
			if (Temperatures[i] > avg) {
				cnt++;
			}
		}
		System.out.println("평균값보다 큰 요소의 개수 : " + cnt + "개");
	}

}
