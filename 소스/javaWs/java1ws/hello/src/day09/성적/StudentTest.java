package day09.성적;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Student a;  //a 참조형변수, a객체 
		a= new Student();
		
		
		a.input("주형준", 100, 99);
		a.printInfo();
		
		a.calcGrade(); 
		
		a.printInfo();
		
		
		Student b = new Student();
		b.input("홍길동", 50, 60);
		b.calcGrade();
		b.printInfo();
		
		
	}

}
