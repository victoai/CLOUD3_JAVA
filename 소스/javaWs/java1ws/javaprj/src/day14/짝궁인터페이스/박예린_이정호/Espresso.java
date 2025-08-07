package day14.짝궁인터페이스.박예린_이정호;

public class Espresso implements Menu
{
	@Override
	public String name() {
		return "에스프레소";
		
	}

	@Override
	public int price() {
		return 4500;
		
	}

	@Override
	public int totalPrice(int count) {
		return count * 4500;
	}
}