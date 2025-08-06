package day07;

public class 배열의값넣기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stb
		int[] kors  = new int[5];				
		//배열에 (국어점수 여러개) 입력 
		//등록
		배열입력하기(kors);					
		배열조회하기(kors);				

	}


	public static void 배열입력하기(int[] a){ // 배열의 정보를 a가 담고 있다 ( 참조형변수)
		a[0]=90;
		a[1]=99;
		a[2]=77;
		a[3]=89;
		a[4]=100;
	}	


	public static void 배열조회하기(int[] kors) {
		//조회
		for( int i=0; i< kors.length ; i++) {
			System.out.println( kors[i]);
		}
	} 
	
	
	

}
