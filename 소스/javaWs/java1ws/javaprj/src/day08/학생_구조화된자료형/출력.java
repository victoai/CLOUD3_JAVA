package day08.학생_구조화된자료형;

public class 출력 {

	public static void main(String[] args) {
		data k = new data();
		
		//입력하기
		/*k.a = "ㅇㅇ";
		k.b = 21432;
		k.c = 4253;
		
		*/
		입력하기(k);

		//데이터 출력하기 
		//System.out.println(k.a+","+k.b+","+k.c);
		출력하기(k);
		
	}
	
	
	
	public static void 입력하기( data k) {
		
		k.a = "ㅇㅇ";
		k.b = 21432;
		k.c = 4253;
	}
	
	
	public static void  출력하기(data k) {
		System.out.println(k.a+","+k.b+","+k.c);
	}
	
	
	

}
