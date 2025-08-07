package day12.상속_inheritance.super사용;

public class B  extends A{

	@Override
	public void 매서드() {
		 
		super.매서드();   // 부모의 매서드 
		System.out.println("자식이 추가하는내용");
	}
	
	
	public static void main(String[] args) {
		
		
		B b= new B();
		b.매서드();
		
	}
}
