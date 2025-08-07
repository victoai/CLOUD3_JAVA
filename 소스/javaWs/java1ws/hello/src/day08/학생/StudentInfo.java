package day08.학생;

public class StudentInfo {
	private String name;
	private int age;
	private int grade;

	// 생성자 단축키 -> (alt + shift) + s + o
	public StudentInfo(String name, int age, int grade) {
		super();
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	public StudentInfo() {
		super();
	}

	// getter/setter 단축키 -> (alt + shift) + s + r
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	// Override 단축키 -> (alt + shift) + s + v
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "이름 : " + this.name + "\n나이 : " + this.age + "\n학년 : " + this.grade;
	}
	
}