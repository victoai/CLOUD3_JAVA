package day13.다형성_학생.다형성_정연수;

public class Main {

	public static void main(String[] args) {
		Parent p = new Parent();
		FirstKid first = new FirstKid("갑","갑이다", 10);
		SecondKids sec = new SecondKids("을", "을이다", 12);
		ThirdKids third = new ThirdKids("병", "병이다",6);
		
		
		
		Parent a1 = first;
		Parent a2 = sec;
		Parent a3 = third;
		
		a1.action();
		a2.action();
		a3.action();
		
		Parent[] list = new Parent[3];
		
		list[0] = a1;
		list[1] = a2;
		list[2] = a3;
		
		for(int i=0; i<list.length; i++) {
			System.out.println(list[i].toString());
		}
		
		//a1.firstAc();
		
		
		
		
		
		if(a1 instanceof FirstKid) {
			FirstKid aa1 = (FirstKid)list[0];
			aa1.firstAc();		
		}

	}

}
