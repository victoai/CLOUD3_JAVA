package hello2;

import java.util.Scanner;

public class 수맞추기 {

	public static void main(String[] args) {
		 
		Scanner sc  = new Scanner( System.in);
		int  randomSu;		 
		int  input;
		
		
		//사용자입력		
		randomSu  =   (int) (Math.random() *100) +1;  //0~99 사이의 임의 수  +1 
		
			
		System.out.println("수입력");
		input = sc.nextInt();
		System.out.println( input);
		
		while(  randomSu != input) {
			
			
			if( input  > randomSu) {
				
				System.out.println(" 더 작은 수 입력");
			}else if( input <  randomSu){
				
				System.out.println(" 더 큰 수  입력");
			}
			
			System.out.println("수입력");
			input = sc.nextInt();	
			
		}
		
		
		
		
		System.out.println( "수를 맞줬습니다");
		System.out.println( randomSu  ); 
		
	}

}
