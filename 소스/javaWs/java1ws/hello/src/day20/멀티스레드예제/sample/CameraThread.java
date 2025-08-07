package day20.멀티스레드예제.sample;


//스레드를 만드는 방법
//1. 스레드를 상속받기
//2. runnable 인터페이스를 구현하는 방법
//3. -이름있는 클래스 , 익명클래스  ,  람다식 

public class CameraThread extends Thread{
	@Override
	public void run() {
		System.out.println("**********찰칵***********");
	}
}
