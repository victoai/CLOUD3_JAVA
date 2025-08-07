package day12.상속.다형성.실습;

public class Cash extends Payment{

	@Override
	public void pay(int Payment) {
		System.out.println( "현금으로 "+Payment+"원 결제하셨습니다.");
	}
	
}
