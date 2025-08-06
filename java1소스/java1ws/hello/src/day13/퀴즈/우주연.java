package day13.퀴즈;

public class 우주연 extends Acorn{

	String address;
	String alias;
	
	public 우주연(String id, String name, String phone, String address, String alias) {
		
		super( id, name, phone);
		this.address =address;
		this.alias =alias;
	}
	
	
	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		
		System.out.println(address);
		System.out.println( alias);
		
	}
	
	
	public static void main( String[] args) {
		우주연 obj = new 우주연("victoai" , "우주연" ,"010-3903-1028" ,"노원" ,"우주인");
		obj.printInfo();
				
	}
}
