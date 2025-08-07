package day13.다형성_학생.다형성_이동우;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person per = new Person("직장인");
		per.personInfo();
		
		Person doctor = new Doctor("의사");
		doctor.personInfo();
		
		//다운캐스팅
		((Doctor)doctor).personInfo();
		
		Propessor ps = new Propessor("교수");
		ps.personInfo();
		
		Student st = new Student("학생");
		st.personInfo();
	
		
		
		
	
	}
	
	
	

}
