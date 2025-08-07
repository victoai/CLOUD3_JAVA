package 박수경;

public class Person {
	
	private  String 이름;
	private  int 에너지;
	
	
	
	
	public Person(String 이름, int 에너지) {
		super();
		this.이름 = 이름;
		this.에너지 = 에너지;
	}

	
	//객체의 정보가 전달된다
	//객체변수의 정보가 전달된다 
//public void  공부한다( Person  this) {
	public void  공부한다() {
		this.에너지 = this.에너지 -100;
	}
	
	
	public void  밥먹기() {
		에너지  = 에너지+50;
	}

	
	public void  책읽기() {
		에너지 = 에너지 -30;
	}
	
	
	public void 산책하기() {
		에너지  = 에너지+40;
	}


	@Override
	public String toString() {
		return "Person [이름=" + 이름 + ", 에너지=" + 에너지 + "]";
	}
	
	
	
	public static  void printHi() {
		System.out.println("");
	}
	
	
	public static  void printGuGu() {
		 for( int i=1; i<=9; i++) {
			 System.out.println( 2*i);
		 }
	}
	
}
