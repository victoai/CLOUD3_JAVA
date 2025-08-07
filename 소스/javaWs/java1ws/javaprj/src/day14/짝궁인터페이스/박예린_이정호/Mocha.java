package day14.짝궁인터페이스.박예린_이정호;

public class Mocha implements Menu
{

	@Override
	public String name() {
		return "카페모카";
		
	}

	@Override
	public int price() {
		return 5500;
		
	}

	@Override
	public int totalPrice(int count) {
		return count * 5500;
	}
}