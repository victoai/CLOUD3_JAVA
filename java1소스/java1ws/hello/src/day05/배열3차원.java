package day05;

public class 배열3차원 {

	public static void main(String[] args) {
		
		                     //면, 행 , 열
		int[][][] a= new  int[2][3][3];
		
		
		//변수초기화 
		//3차원배열: 2차원배열을 요소로 가진다.
		
		String[][][] str = {
				
			//0면   2차원배열
				
				{
					{"★1","★2","★3"} ,
					{"★4","★5","★6"} ,
					{"★7","★8","★9"} ,
					 
				}
				,		 
			//1면	 2차원배열			
				
				{
					{"☆1" ,"☆2" ,"☆3"},
					{"☆4" ,"☆5" ,"☆6"},
					{"☆7" ,"☆8" ,"☆9"}
					 
				}	
				
		};
		
		
		
		//0면  (첫번째 2차원배열)
		
		for( int i=0; i<3 ; i++) {
			
			for( int j=0 ; j<3 ; j++) {
				
				   System.out.print( str[0][i][j]  +  "  ");				   
			}
			System.out.println( );
		}
		
		
		//1면 		
		for( int i=0 ; i<3 ; i++) {
			
			for( int j=0 ; j<3 ; j++) {
				
				System.out.print( str[1][i][j] + "  ");
			}
			
			System.out.println( );
		}
		
		
		//3차원배열 모두 출력하기 		
		for( int k=0 ; k<2 ; k++) {			
			//
			for( int i=0; i<3 ; i++) {
				
				for( int j=0 ; j<3 ; j++) {
					
					   System.out.print( str[k][i][j]  +  "  ");				   
				}
				System.out.println( );
			}	
			
		}
		
		
		
		
	}

}
