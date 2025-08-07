package day11.변수종류_변수초기화;


class Lotto{
	
	
	static int[] lotto  = new int[5];
	
	
	static {
		
		for( int i=0; i< lotto.length ; i++) {
			
		     lotto[i] = (int)(	Math.random()*45)+1;
		}
	}
	
	
	
	public static void printLotto() {
		for( int i=0; i< lotto.length; i++) {
			System.out.print( lotto[i] +", ");
		}
	}
}
public class 클래스변수의초기화 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lotto.printLotto();
		
		
		
		
		//기본자료형 초기화
		//명시적 초기화
		//static  초기화 블럭
		
		

	}

}
