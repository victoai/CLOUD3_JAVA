package day19;

public class Main {

	public static void main(String[] args) {
		
		
		Artist a   = new Artist();//
		Artist b = new Artist(4, "이효리", "안테나");//   b: 참조형변수 
		
		System.out.println(  b.toString());  //b.toString();
		 
		//System.out.println(  b );
		
		
		Object o = b;  //업캐스팅 
	
		System.out.println( o.toString());
		
		
		
		//다운캐스팅
	    Artist d=  (Artist)o;
	    System.out.println(d.getAgency());
	   
	   
		
		
	}

}
