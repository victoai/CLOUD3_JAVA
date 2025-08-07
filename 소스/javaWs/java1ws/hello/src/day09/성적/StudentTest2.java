package day09.성적;

public class StudentTest2 {

	public static void main(String[] args) {
	 
		
		//학생정보 저장할 변수 선언 
		
		Student s;  //a 참조형변수, a객체 
		s= new Student();
		
		
		
		//학생성적 입력
		 String name="홍길동";
		 int kor =100;
		 int eng=99;
		 
		 
		 input(s, name, kor, eng );
		//학생성적 처리
		 성적처리하기(s);
		 
		
		
		//학생성적 출력
		 출력하기(s);

	}
	
	
	
	
	public static  void input( Student s,  
			String name, int kor, int eng ) {
		s.name = name;
		s.kor  = kor;
		s.eng =eng;	
	}
	
	
	


	public static void  성적처리하기( Student s) {
		s.total  = s.kor+s.eng;
		
	}
	
	public static void  출력하기( Student s) {
		
		System.out.print( "이름=" +s.name);
		System.out.print( "국어="+ s.kor);
		System.out.print( "영어=" +s.eng);		
		System.out.print( "총점="+ s.total);
	 
		
	}
}
