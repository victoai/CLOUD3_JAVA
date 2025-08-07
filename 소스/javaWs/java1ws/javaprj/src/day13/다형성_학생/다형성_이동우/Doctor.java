package day13.다형성_학생.다형성_이동우;

public class Doctor extends Person{

	public Doctor(String name) {
		super(name);
	}
	
	 @Override
	public void personInfo() {

		System.out.println(name + "의 역할은 환자를 치료하는 일이다.");
	}
}
