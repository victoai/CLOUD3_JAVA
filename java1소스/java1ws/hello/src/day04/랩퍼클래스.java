package day04;

public class 랩퍼클래스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// auto boxing 
		//Integer i1 = new Integer(3);
		Integer i1 = Integer.valueOf(10);
		
		
		Integer i2 = 3; 
		int sum2 = i1.intValue() + i2.intValue();
		// auto unboxing
		int sum = i1 +i2;
		System.out.println("합=" + sum + "합2=" + sum2);
		
		
		
		Object[] arrs= new Object[4]; //객체배열은 참조형변수의 집합 
		 // arrs[0] = new Integer(3); // AutoBoxing 
		arrs[0]=3;
		arrs[1]="안녕";
		arrs[2]=2.5; 
		 
		for( Object obj : arrs) {
		System.out.println(obj);
		}
	}

}
