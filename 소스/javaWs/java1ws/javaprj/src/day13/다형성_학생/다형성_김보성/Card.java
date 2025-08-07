package day13.다형성_학생.다형성_김보성;

public class Card extends Payment {

	@Override
	public void pay(int Payment) {
		System.out.println( "신용카드로 "+Payment+"원 결제하셨습니다.");
	}
	
}
