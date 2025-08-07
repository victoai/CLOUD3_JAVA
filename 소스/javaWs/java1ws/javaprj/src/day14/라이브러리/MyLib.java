package day14.라이브러리;

interface MyRunnable{
	void run();
}


public class MyLib {

	public void 세번실행하기( MyRunnable r) {
		
		for(int i=1; i<=3 ; i++) {
			r.run();
		}
		
	}
}
