package day14.인터페이스.라이브러리;

public class SSB implements MyRunnable{

	@Override
	public void run() {
		
		for(int i=1; i<10; i++) {
			//1부터 10까지 제곱구하깅
			System.out.println(i*i);
		}
		
	}

}
