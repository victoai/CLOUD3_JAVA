package day14.객체관계.hasA포함;


//약한결합 (느슨한결합)

public class C {
	
	
	D d;
	
	
	//약한 결합 
	//외부에서 생성된 D객체를 주입받는 방법 
	
	//주입받는방법
	//생성자
	//세터 
	public C() {
		
	}
	
	/*
	//생성자주입
	public C( D d) {
		this.d  = d;
		
	}
	*/
	
	//세터주입
	public void setD( D d) {
		this.d  = d;
	}
	
	
	
	public void C매서드() {
		System.out.println("C매서드");
		d.D매서드();
	}
	
	 

}
