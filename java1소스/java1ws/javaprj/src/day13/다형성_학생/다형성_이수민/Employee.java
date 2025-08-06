package day13.다형성_학생.다형성_이수민;

public class Employee {
	
	protected String name;
	protected int time;
	protected int rate;
	
	int salary=0;
	
	public Employee() {
		
	}
	public Employee(String name, int time, int rate) {
		this.name = name;
		this.time = time;
		this.rate = rate;
	}
	
	public int calcSalary() {
		salary = time*rate;
		return salary;
	}
	
	
	public String toString() {
		calcSalary();
		return name+"님의 급여: "+salary;
	}
	
}
