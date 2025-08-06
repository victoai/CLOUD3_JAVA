package day12.상속_inheritance.음료마시기;

public class 이상민 extends AcornStudent{

	@Override
	public void 음료마시기() {
		// TODO Auto-generated method stub
		System.out.println("메가리카노 마시기...!");
	}
	
	public void 단축키() {
		System.out.println("오버라이드 : alt키와 shift키를 동시에 누른 상태에서 s를 누르고 v를 누르면 된다.");
		System.out.println("생성자 : (alt, shift) + s + o");
		System.out.println("게터, 세터 : (alt, shift) + s + r");
	}
	
}
