package day08.학생;


public class Student1 {
	public static void main(String[] args) {
		StudentInfo student1 = new StudentInfo();
		student1.setName("홍길동");
		student1.setAge(15);
		student1.setGrade(3);
		
		System.out.println(student1.toString());
		System.out.println();
		
		StudentInfo student2 = new StudentInfo("뽀빠이", 17, 5);
		System.out.println(student2.toString());
	}
}