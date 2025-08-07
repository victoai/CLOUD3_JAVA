package day20.sleep;

public class 실습1 {

	public static void main(String[] args) {
		 
		
		System.out.println("3초후 공개");
		
		////sleep
		//현재 스레드를 지정된 시간동안 멈추게 한다. 잠잘시간 제공 ( 천분의 일초) 3000 => 3초
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("짜잔 !!!   당첨 축하 축하");

	}

}
