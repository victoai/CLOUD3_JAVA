package day12.상속.학생.박수경;


/*
1.   상속관계 is a 클래스를 두 개 만들고  (부모,  자식클래스 )  실행해 보는 예제 만들기  
2.   1번 작성시  상속관계의   생성자 호출 순서에 이해하고 생성자를  호출하자 
3.   업캐스팅해 보기 (부모형 참조형변수에 저장하기)
4.   부모형으로 참조하였을 경우 자식의 모든 내용이 보이지 않는 것을 확인하기 
5.   instanceof로 확인 후 다운캐스팅 해보기 
6.   다운캐스팅 후  객체의 고유 기능을 사용해 보기
*/

public class fruit_main {
	public static void main(String[] args) {
		Fruit f = new Fruit("복숭아",200);
		Fruit1 f1 = new Fruit1("사과",100,"빨강");
		
		f.printInfo();
		f1.printInfo();
		f1.print자식();
		
		f.voice(" 제일 싼 과일");
	}
	
	
	
}
