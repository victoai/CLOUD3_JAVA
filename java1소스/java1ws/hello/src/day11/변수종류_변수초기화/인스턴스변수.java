package day11.변수종류_변수초기화;

class Studuent{
	String name;
	int age;
	
	//매서드 (방법)
	
	public Studuent() {
		
	}
	//객체의 값을 넣는 방법
	public Studuent( String name, int age) {
		this.name  =name;
		this.age =age;
	}
	
	//객체의 값을 얻어오는 방법
	public String toString() {
		return name + age;
	}
}


public class 인스턴스변수 {

	public static void main(String[] args) {
		
		
		// 클래스에 정의된 대로 객체가 만들어질 때 변수가 공간에 할당되고 
		// 참조를 잃으면 사라짐  (반환됨)
		
		
		
		//1.만드는 위치
		//클래스내부에 만들어 짐 
		
		//2.언제 생성되는가?
		// new에 의해서 생성됨 
		// new될 때 마다 생김 (인스턴스 변수라고 한다)
		
		
		//3.언제 사라질까 ?(언제 메모리가 반납될까")		
		
		
		//4.용도 
		// 각 객체마다 가져야 하는 값이 있을 때 
		// 스낵정보 3개는 각 스낵정보를 모두 가지고 있어야 한다 
		// 맛동산,4500   ,오징어땅콩,2800  ,  새우깡 ,1200
		
		// 객체를 생성할 때마다 생김 
		
		
		
		

	}

}
