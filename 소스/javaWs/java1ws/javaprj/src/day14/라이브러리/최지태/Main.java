package day14.라이브러리.최지태;

public class Main {
	public static void main(String[] args) {
		MyLib1 lib = new MyLib1();
		int[] list = { 5, 2, 6, 3, 7 };

		lib.정수형오름차순정렬출력(new CJT(list));
		lib.정수형내림차순정렬출력(new CJT(list));

	}
}
