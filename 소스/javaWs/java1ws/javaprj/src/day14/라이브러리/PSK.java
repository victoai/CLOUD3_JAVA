package day14.라이브러리;

public class PSK implements MyRun{

	@Override
	public void run() {
		
		
		int num0=1;
		int num1=1;
		int sum=0;
		
		for(int i=2; i<11; i++) {
			sum=num0+num1;
			num0=num1;
			num1=sum;
			System.out.print(sum+"\n");
		}
		
		
		/*
		System.out.println("2단");
		for(int i=1; i<10; i++) {
			System.out.println(2*i);
		}
		*/
	}

}
