package day07;

public class 합구하기_10_함수 {

	public static void main(String[] args) {
		
		
		
		// 1 2 3 4 5 6 7 8 9 10 		
		
		getTentoal();
		int result  =getTentoal2();
		System.out.println( result);
		

	}

	
	        //함수명:getTentoal
			//기능 :1~10까지합 
			//입력 : x
			//반환 : X
	private static void getTentoal() {
		int sum =0;
		
		for(int i=1; i<=10; i++) {
		
			sum  = sum  + i; //sum += i;
		}
		
		System.out.println( sum);
	}
	
	
	        //함수명 getTentoal2
			//기능 :1~10까지합 
			//입력 : x
			//반환 : O
			
	
	private static int  getTentoal2() {
		int sum =0;
		
		for(int i=1; i<=10; i++) {
		
			sum  = sum  + i; //sum += i;
		}
		
		System.out.println( sum);
		
		return sum;
	}

}
