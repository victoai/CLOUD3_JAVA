package day12.상속.다형성.실습;

public class Rewardpoint extends Payment{

	@Override
	public void pay(int Payment) {
		System.out.println( "포인트로  "+Payment+"원 결제하셨습니다.");
	}
	
}
	