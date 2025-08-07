package day11.변수종류_변수초기화;


//모든 객체가 공유해야하는 값이 있다면 
//각 객체가 만들어질 떄마다 가지지 않고 
//한 번만 만들어지게 static변수로 만들고 사용할 수 있다 


  class Acorn {

	//인스턴스 변수     => new에 의해서 메모리 확보됨 
	String id;
	String pw;
	String name;
	
	//static변수     => new랑 무관하다 
	               //프로그램 실행시 단 한번 
	static int cnt;
	
	
	{
		cnt++;
		
	}
	
	//생성자
	public Acorn() {
		// TODO Auto-generated constructor stub
	 
		this.id="임시아이디";
		this.pw="임시비번";
		this.name="";
	}
	
	public Acorn(String id, String pw, String name) {	
		 
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
 
	
	//객체의 정보를 반환하는 매서드 
	public String toString() {
		return "Customer [id=" + id + ", pw=" + pw + ", name=" + name + "]";
	}
	
	
	public static void printCnt() {
		
		System.out.println( cnt);
	}
		
	
	 
	
	
}
public class 클래스변수활용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Acorn a1= new Acorn("포도" ,"1234","이수민");
		Acorn a2= new Acorn("딸기" ,"9090","박예린");
		Acorn a3= new Acorn( );
		Acorn.printCnt();

	}

}
