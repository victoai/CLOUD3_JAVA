package day19;

public class E {

	public static void main(String[] args) {
		 
		
		D d = new D();
		String a=d.음료();
		
		System.out.println(a);
		
		
		
		String[] g=  d.음료들();
		
		
		System.out.print( g[0] );
		System.out.print(  g[1]);
		System.out.print(   g[2]);
		
		
		for(int i=0; i< g.length; i++) {
			System.out.print( g[i] );
			
		}
		

	}

}
