package day13.학생.상속_정보란_실습.상속_정보란_실습;

public class Cat_mom extends 고양이키우기 {
	
	public void 분유먹일준비() {
		System.out.println("분유 먹일 준비");
	}
	
	@Override
	public void 분유먹이기() {
		System.out.println("고양이 전용 분유 가루를 넣고 미지근한 물에 희석한다");
	}

}
