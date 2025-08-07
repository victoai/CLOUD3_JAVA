package day11.상속.생성자;

public class Person {
	
	protected String name;
	protected String id;
	
	 
	public Person() {
		// TODO Auto-generated constructor stub
		
		System.out.println("기본생성자 call");
	}
	 
	public Person(String name, String id) {
		System.out.println("매개변수 생성자 call");
		this.name = name;
		this.id = id;
	}
	
	public void disp()	{
	System.out.println("이름=" + name+ "\t 아이디=" + id);
	}


}
