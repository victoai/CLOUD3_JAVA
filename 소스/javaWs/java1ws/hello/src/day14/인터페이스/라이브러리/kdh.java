package day14.인터페이스.라이브러리;

public class kdh implements MyRunnable{

	@Override
	public void run() {
		for(int i=1;i<=9;i++) {
			System.out.println('A'*i);
		}
		
	}
	

}
