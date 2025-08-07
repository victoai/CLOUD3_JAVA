package day14.인터페이스;

public class 김정석 implements 나는게가능한, 변신가능한{
	//field
	김정석 k;
	boolean stateFly = false;
	
	//method
	@Override
	public void 변신하기() {
		k = new 김정석();
		System.out.println("날개달음");
		k.setFly(true);
		
	}

	@Override
	public void 날수있다() {
		String str = "\\\\\r\n"
				+ " \\\\\r\n"
				+ "  \\\\ \r\n"
				+ "   <(')";
		System.out.println("김정석 : ");
		System.out.println(str);
	}
	
	public void 날수있다(김정석 k) {
		if(k.getFly() == true) {
			System.out.println("김정석 : 하늘을 난다");
		} else {
			System.out.println("김정석 : 하늘을 못난다");
		}
	}
	
	//getter,setter
	public boolean getFly() {
		return stateFly;
	}
	
	public void setFly(boolean state) {
		this.stateFly = state;
	}
	
	
	//test
	
	/*
	 * public static void main(String[] args) { 김정석 a = new 김정석(); a.날수있다(a);
	 * 
	 * a.변신하기(); a.날수있다(); }
	 */
	 

}
