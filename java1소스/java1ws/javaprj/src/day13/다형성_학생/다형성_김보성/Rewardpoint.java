package day13.다형성_학생.다형성_김보성;

public class Rewardpoint extends Payment{

	@Override
	public void pay(int Payment) {
		System.out.println( "포인트로  "+Payment+"원 결제하셨습니다.");
	}
}
	