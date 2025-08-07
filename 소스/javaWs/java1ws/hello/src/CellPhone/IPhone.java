package day12.학생.CellPhone;

public class IPhone extends CellPhone {
	
	String appleID;
	
	public IPhone(String model, String manufacturer, String color, String phoneNumber, String appleID) {
		super(model, manufacturer, color, phoneNumber);
		this.appleID = appleID;
	}
	
	@Override
	public void on() {
		System.out.println("아이폰 전원 켜기");
	}
	
	public void appleLogin() {
		System.out.println("애플 로그인");
	}

}
