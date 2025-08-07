package day17;

public class ProxyMain {

	public static void main(String[] args) {
		 
		MyInter obj = new   MyProxy( new MyInter() {

			@Override
			public void add() {
				 System.out.println("ㅇㅇㅇ");
				
			}});
		
		
		
		
		obj.add();
		
		
		MyInter obj2  = new MyInter() {

			@Override
			public void add() {
				 System.out.println("dfdfdf");
				
			}};
			
			obj2.add();
		

	}

}
