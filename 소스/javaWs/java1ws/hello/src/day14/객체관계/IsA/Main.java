package day14.객체관계.IsA;

public class Main {

	public static void main(String[] args) {
		 
		
		B b = new B();
		
		
		A a = null;   //a 참조형변수   ( 참조형변수의 기본값은  null)
		
		
		a=b; //업캐스팅  , 부모만큼만 해석된다.
		
		
		Object o=b;   // 업캐스팅  
		
		
		//
		
		((B)o).B매서드();
		
		
		B tmp ;
		tmp = (B) o;
		tmp.B매서드();
		
		
		
		
		

	}

}
