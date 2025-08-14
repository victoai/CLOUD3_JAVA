package hello;

public class HapSample {

	public static void main(String[] args) {
		 
		// 1~10까지의 합 구하기
		/*
		  //자바스크립트 
		  let sum=0;		  
		  for( let i=1; i<=10;i++){
		       sum= sum+i;
		  }
		  
		  alert( sum);
		   
		 */
		 
		 int sum=0;   // int  정수형변수를 만들 때 사용
		 for( int i=1; i<=10; i++) {
			 sum+=i; // sum= sum+i; 
		 }
		 System.out.println( sum);
		

	}

}
