package day14.라이브러리;

import java.util.Random;

public class JYS implements MyRun{

	@Override
	public void run() {
		Random random = new Random();
		
		System.out.println("9단");
		for(int i=1; i<=9; i++) {
			int result = 9*i;
			int rr = random.nextInt(99);
			if(result == rr) {
				System.out.println("좋은일이 있을거 같다");
			}
			
		}
		
		
		
		
		
		
	}

}
