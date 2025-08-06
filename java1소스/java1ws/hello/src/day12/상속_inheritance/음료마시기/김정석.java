package day12.상속_inheritance.음료마시기;

class 김정석 extends AcornStudent {
	
	// field
	private String drink = "아메리카노";
	
	// method 
	@Override
	public void 음료마시기() {
		System.out.println(this.drink + "를 마십니다");
		System.out.println("샷추가 " + addShot(2) + "번");
		addVanilaFlavor();
	}
	
	//샷추가 
	public int addShot(int shot) {
		return shot;
	}
	//바닐라향 추가
	public void addVanilaFlavor() {
		System.out.println("바닐라향 추가");
	}
	
	
//	public static void main(String[] args) {
//		김정석 k = new 김정석();
//		k.음료마시기();
//	}
	
}
