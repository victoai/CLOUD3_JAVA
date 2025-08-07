package day05;

public class 배열2차원 {

	public static void main(String[] args) {
	 
		//2차원 배열 만들기
		//행, 열의 대한 첨자가 필요하다 		
		int[][] arr  = new int[3][3];
		arr[0][0]=1;
		arr[0][1]=2;
		arr[0][2]=3;
		
		arr[1][0] =4;
		arr[1][1]=5;
		arr[1][2]=6;		
		
		
		arr[2][0]=7;
		arr[2][1]=8;
		arr[2][2]=9;
		
		
		
		
		//2차원배열 초기화
		//행, 열
		
		//1차원배열을 요소로 가지는 배열이다
		String[][]  foods  = {				
				{ "돈까스" , "김밥", "우동","라면" ,"오므라이스" },  // 1주차 점심메뉴
				{  "카레"  , "초밥"  , "돈까스"  , "순두부"  , "쫄면"  },   //2주차 메뉴
				{  "우동" , "스시" , "제육",  "치즈김밥"  , "카레"},	 // 3주차 메뉴		
				
		};
		/*
		System.out.println( foods[0][0]);	
		System.out.println( foods[0][1]);	
		System.out.println( foods[0][2]);	
		System.out.println( foods[0][3]);	
		System.out.println( foods[0][4]);	
		*/
		
		//1주차  메뉴
		System.out.println("1주차 메뉴이다");
		for( int i=0;  i<5 ; i++) {			
			System.out.print( foods[0][i] + "   ");			
		}
		
		
		//2주차 메뉴
		System.out.println("\n 2주차 메뉴이다");
		for( int i =0 ; i<5 ; i++) {
			System.out.print( foods[1][i] + "   ");
		}
		
		//3주차 메뉴 
	
		System.out.println("\n 3주차 메뉴이다 ");
		for( int i=0; i<5 ; i++) {
			System.out.print( foods[2][i]  +"  ");
		}
		/*
		System.out.println( foods[2][0]);
		System.out.println( foods[2][1]);
		System.out.println( foods[2][2]);
		System.out.println( foods[2][3]);
		System.out.println( foods[2][4]);
		*/
		
		//2차원배열 접근
		System.out.println( "전체 메뉴 ");
		for( int j=0 ;j<3 ; j++) {    //행을 반복 j:반복, 행을 접근할 첨자로 사용
			//
			for( int i=0;  i<5 ; i++) {			//열을 반복  i: 열을 접근할 첨자로 사용
				System.out.print( foods[j][i]  +"   ");			
			}
			
			System.out.println();
			
		}
		
		
		
	}

}
