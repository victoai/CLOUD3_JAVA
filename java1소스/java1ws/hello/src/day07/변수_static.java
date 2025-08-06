package day07;

public class 변수_static {

	//클래스변수   : 모든매서드에서 접근이 가능한 변수 
	//클래스에서 한 개만 만들어짐 
	//프로그램 시작에서 종료시까지 유지됨
	
	
	static int su=0;
	
	public static void main(String[] args) {
		 // 수증가
		수증가하기();
		
		System.out.println( su  );
		수증가하기();
		
		System.out.println(su);
		

	}
	
	
	public static void  수증가하기() {
		su++;		
	}
	

}
