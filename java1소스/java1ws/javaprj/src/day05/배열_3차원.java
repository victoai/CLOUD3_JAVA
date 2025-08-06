package day05;

public class 배열_3차원 {

	public static void main(String[] args) {
		 
		
		
		//3차원 배열
		//3차원배열 :2차원배열을 요소로 가지는 배열 
		
		//면, 행, 열  접근해야 기억장소에 접근할 수 있다 
		
	//	String[][][]  배열3차원  = new String[2][3][3];  // (3행3열 짜리 2차원 배열)을  2개 가지는 배열이다  
		
		
		
		String[][] []  배열3차원  = {
				
				
				//0면
				{
					{"★1" ,"★2" ,"★3"},
					{"★4" ,"★5" ,"★6"},
					{"★7" ,"★8" ,"★9"}
				} ,
				

				//1면
				{
					{"◎1" ,"◎2" ,"◎3"},
					{"◎4" ,"◎5" ,"◎6"},
					{"◎7" ,"◎8" ,"◎9"}
				} ,
		};
		
		
		
		System.out.print(   배열3차원[0][0][0] );
		System.out.print(   배열3차원[0][0][1] );
		System.out.println( 배열3차원[0][0][2] );
		
		
		System.out.print( 배열3차원[0][1][0]);
		System.out.print( 배열3차원[0][1][1]);
		System.out.println( 배열3차원[0][1][2]);
		
		
		System.out.print( 배열3차원[0][2][0]);
		System.out.print( 배열3차원[0][2][1]);
		System.out.print( 배열3차원[0][2][2]);
		
		
		
		
		System.out.println("2면 출력 : 2번 2차원 출력");
		
		
		System.out.print(   배열3차원[1][0][0] );
		System.out.print(   배열3차원[1][0][1] );
		System.out.println( 배열3차원[1][0][2] );
		
		
		System.out.print( 배열3차원[1][1][0]);
		System.out.print( 배열3차원[1][1][1]);
		System.out.println( 배열3차원[1][1][2]);
		
		
		System.out.print( 배열3차원[1][2][0]);
		System.out.print( 배열3차원[1][2][1]);
		System.out.print( 배열3차원[1][2][2]);
		
		
		
		
		
		//면
		System.out.println("반복문 사용");
		for( int k=0; k < 배열3차원.length; k++) {   //면이 두개   2
			
			for( int i=0; i< 3; i++) {   // 배열3차원[k].length   // 행의 개수 
				
				for( int j=0; j<3; j++) {   // 배열3차원[k][i].length  // 열의 개수 
					
					System.out.print(배열3차원[k][i][j]);
				}
				
				System.out.println();
			}
			
			
		}
		
		
		
		
		
		
		

	}

}
