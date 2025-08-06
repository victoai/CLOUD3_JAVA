package day17;

public class MyProxy   implements MyInter{
	
	MyInter obj;

	public MyProxy(MyInter obj) {
		super();
		this.obj = obj;
	}

	@Override
	public void add() {
		
		  System.out.println("부가기능1");
		  obj.add();
		  System.out.println("부가기능2");
		
	}
	
	
	//
	
	
	
	
	

}
