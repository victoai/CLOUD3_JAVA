package day12.상속_inheritance.동물_다형성;

public class Cat extends Animal {
	
	
	public void 쥐를잡다() {
		System.out.println( "쥐를 잡는다");
	}
	
	
	@Override     //오버라이드 : 상속관계에서만 발생, 상속관에서 부모의 매서드의 재정의 하는 것을 말한다.
	public void 짖다() {
		 System.out.println("야옹");
	}

}
