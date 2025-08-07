package day14.짝궁인터페이스.박예린_이정호;

public class Latte implements Menu
{
	@Override
	public String name() {
		return "카페라떼";
		
	}

	@Override
	public int price() {
		return 5000;
		
	}

	@Override
	public int totalPrice(int count) {
		return count * 5000;
	}
}