package day12.상속_inheritance.춤추기;

public class Jh extends Student{
	
	public void 플라멩코() {
	System.out.println("스페인 남부 안달루시아 지역에서 유래한 춤으로, 강렬한 리듬과 정열적인 발동작이 특징입니다.");
}
	public void 탱고() {
		System.out.println("아르헨티나와 우루과이에서 시작된 춤으로, 감성적이고 밀착된 파트너 댄스입니다.");
	}
	public void 살사() {
		System.out.println("쿠바에서 기원한 라틴 댄스로, 활기차고 열정적인 리듬이 특징입니다.");
	}
	public void 발레() {
		System.out.println("이탈리아에서 시작되어 프랑스와 러시아에서 발전된 고전 무용으로, 우아하고 정교한 동작이 특징입니다.");
	}
	public void 카포에이라() {
		System.out.println("브라질에서 유래한 무술과 춤이 결합된 형태로, 음악과 함께 이루어지는 독특한 움직임이 특징입니다.");
	}
	public void 카투크() {
		System.out.println("인도의 전통 춤으로, 발리우드 댄스에도 영향을 미친 정교한 발동작과 회전이 특징입니다.");
	}
	public void 막춤() {
		System.out.println("막춘다");
	}
	
	@Override
	public void 춤추기() {
		플라멩코();
		탱고();
		살사();
		발레();
		카포에이라();
		카투크();
		막춤();
		
	}
	
	
}