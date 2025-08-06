package day05;

public class 배열_2차원 {

	public static void main(String[] args) {
		 
		
		String[][] teams = {
				
				{"권지언" ,  "김민환",  "김보성" , "김유민"  },   //0행
				{"박수경" ,  "박시우" ,"박예린" , "오윤석"},    //1행
				{ "윤현기" , "이동우" ,  "이수민" ,     "이정호" } , //2행
				{ "임형택" , "정연수" ,  "최지태" ,     "최하은" ,    "황예지" },  //3행
				
		};
		
		
		
		//1조 
		
		System.out.println(teams[0][0] );
		System.out.println(teams[0][1] );
		System.out.println(teams[0][2] );
		System.out.println(teams[0][3] );
		
		
		//2조 
		
		System.out.println( "2조");
		System.out.println( teams[1][0]);
		System.out.println( teams[1][1]);
		System.out.println( teams[1][2]);
		System.out.println( teams[1][3]);
		
		
		
		//3조
		System.out.println( "3조");
		System.out.println( teams[2][0]);
		System.out.println( teams[2][1]);
		System.out.println( teams[2][2]);
		System.out.println( teams[2][3]);
		
		
		//3조
		System.out.println( "4조");
		System.out.println( teams[3][0]);
		System.out.println( teams[3][1]);
		System.out.println( teams[3][2]);
		System.out.println( teams[3][3]);
		System.out.println( teams[3][4]);
		
		
		
		
		for( int i=0; i< teams.length ; i++) {  // 2차원배열의 크기는 행의 개수 
			
			System.out.println( (i+1) +"조");
			for( int j=0; j< teams[i].length ; j++) {
				System.out.println( teams[i][j]);
				
			}
		}
		
		
		
	}

}
