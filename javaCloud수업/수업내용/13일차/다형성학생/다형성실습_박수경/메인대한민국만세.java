package day12_0304_상속다형성;

public class 메인대한민국만세 {

	public static void main(String[] args) {
		송일국 아빠 = new 송일국();
		아빠.say();		//얘들아
		
		송대한 dae = new 송대한();	//송대한 클래스의 객체를 dae 생성
		송민국 min = new 송민국();
		송만세 man = new 송만세();
		
		
		
		
		System.out.println("==================");
		송일국 a1 = dae;	//업캐스팅 : 송대한, 송민국, 송만세 객체를 송일국 타입으로 참조..?
		a1.say();
		
		송일국 a2 = min;	//업캐스팅 : 자식이 부모로 변하는 거
		a2.say();
		
		송일국 a3 = man;	//업캐스팅
		a3.say();
		
		System.out.println("==================");
		
		매서드(a1);
		매서드(a2);
		매서드(a3);
		
		System.out.println("==================");
		
		dae.say();
		min.say();
		man.say();
		
		
		송대한 daee = (송대한)a1;	//다운캐스팅	
		송민국 minn = (송민국)a2;	//다운캐스팅
		송만세 mann = (송만세)a3;	//다운캐스팅

	}

	public static void 매서드(송일국 송) {
		송.say();
	}
}

