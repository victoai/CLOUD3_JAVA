package day09.학생성적;


/*
 * 학생정보를 처리할 type이 필요해   -> type을 만들어서 사용( 사용자정의 자료형)
 * 
 * 학생정보를 처리할  type을 설계, 정의하는 것 
 * 
 * 데이타  + 데이터를 다루는 함수(매서드) 
 * 
 * 캡슐화 :  1.데이타  + 데이터를 다루는 함수(매서드) 
 *         2.데이터 보호  ( 접근제한자 private, public , protected , default) , 특별한기능(함수,매서드) : 생성자가 있음 
 *         //생성자 : 객체가 생성될 때 (new 될 때) 단 한번만 호출함 
 */
public class Student3 {

	private  String name;
	private  int kor;
	private  int eng;
	private  int total;
	
	 
 /*
	public   void  input( String name, int kor, int eng ) {	
	 
		
		this.name  = name;
		this.kor  = kor;
		this.eng = eng;
		
	}
	
	*/
	//생성자는 항상 호출하는 있는 기능이 아니다 
	// new 될 때 단 한번 호출된다 .
	
	//생성자 만드는 규칙 =>
	//1.반환 type 명시하면 안됨 
	//2.반드시 클래스이름과 동일해야 한다 
	//3.생성자는 만들지 않으면 기본생성자를 제공한다 
	 
	//기본생성자
	public Student3() {
		
	}
	
	 
	//기본생성자
	public Student3(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	
	public   void calc(  ) {
		this.total = this.kor+  this.eng;
	}
	
	
	 
	public   void printInfo(  ) {
		System.out.println( this.name);
		System.out.println( this.kor);
		System.out.println( this.eng);
		System.out.println( this.total);
	}
	
}
 

