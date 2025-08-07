package day12.상속.CellPhone;

public class CellPhone {
	
	String model;
	String manufacturer;
	String color;
	String phoneNumber;
	
	public CellPhone(String model, String manufacturer, String color, String phoneNumber) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.color = color;
		this.phoneNumber = phoneNumber;
	}
	
	public void call() {
		System.out.println("전화 걸기");
	}
	
	public void sendMessage() {
		System.out.println("메시지 보내기");
	}
	
	public void runApplication() {
		System.out.println("앱 실행하기");
	}
	
	public void on() {
		System.out.println("핸드폰 전원 켜기");
	}
	
	public void off() {
		System.out.println("핸드폰 전원 끄기");
	}

}
