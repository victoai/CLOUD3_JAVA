package day14.라이브러리;

public class CJT1 implements MyRun {
	int i = 1;

	@Override
	public void run() {
		System.out.println((i + 1) + "번 실행");
		i++;
	}
}
