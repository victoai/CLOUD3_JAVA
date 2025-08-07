package day06;

public class 배열2차원생성및출력 {

	public static void main(String[] args) {
		//2차원 배열 생성
		int[][] arr4 = new int[3][];
		arr4[0] = new int[5];
		arr4[1] = new int[3];
		arr4[2] = new int[2];
		
		
		//1행
		arr4[0][0]=1;
		arr4[0][1]=2;
		arr4[0][2]=3;
		arr4[0][3]=4;
		arr4[0][4]=5;
		
		
		//2행
		arr4[1][0]=1;
		arr4[1][1]=2;
		arr4[1][2]=3;
		
		//3행
		arr4[2][0]=1;
		arr4[2][1]=2;
				
		
		// 
		for( int i=0 ;  i< arr4.length ;  i++) {  //2차원배열의 크기 => 행의 개수			
			for( int j=0 ; j< arr4[i].length ; j++) {  //2차원배열 행의크기   => 열의 개수
				
				System.out.print( arr4[i][j]  +"  ");
			}
			
			System.out.println();			
		}
		
		

	}

}
