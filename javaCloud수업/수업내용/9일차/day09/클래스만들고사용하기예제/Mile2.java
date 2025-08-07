package day09.클래스만들고사용하기예제;

//데이타  + 데이타를 기능을 하나의 단위로 묶는다.
//데이타 보호  (접근제어자:private , public  , 생성자)

public class Mile2 {

	//멤버변수
	private int mile;
	private double kiloMeter;
	
	//멤버변수를 다루는 기능(함수) , 매서드라고 부름
	public double calCulator(int mile ) {
		this.mile = mile;
		this.kiloMeter = mile*1.60934;
		return kiloMeter;		
	}	
 
	
}
