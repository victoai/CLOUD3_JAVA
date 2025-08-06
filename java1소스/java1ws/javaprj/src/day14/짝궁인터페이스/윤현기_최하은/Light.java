package day14.짝궁인터페이스.윤현기_최하은;

public class Light implements HomeControl {

	@Override
	public void turnOn() {
		System.out.println("거실의 불이 켜졌습니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("거실의 불이 꺼졌습니다.");
	}

	@Override
	public void timer() {
		
	}

}
