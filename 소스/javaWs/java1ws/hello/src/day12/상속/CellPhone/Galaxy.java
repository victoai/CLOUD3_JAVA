package day12.상속.CellPhone;

public class Galaxy extends CellPhone {
	
	String googleID;
	
	public Galaxy(String model, String manufacturer, String color, String phoneNumber, String googleID) {
		super(model, manufacturer, color, phoneNumber);
		this.googleID = googleID;
	}
	
	@Override
	public void on() {
		System.out.println("갤럭시 전원 켜기");
	}
	
	public void googleLogin() {
		System.out.println("구글 로그인");
	}

}
