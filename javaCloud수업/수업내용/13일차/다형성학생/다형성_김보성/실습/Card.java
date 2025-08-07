package day12.상속.다형성.실습;

public class Card extends Payment {

	@Override
	public void pay(int Payment) {
		System.out.println( "신용카드로 "+Payment+"원 결제하셨습니다.");
	}
	
}
