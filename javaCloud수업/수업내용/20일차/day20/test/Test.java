package day20.test;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		 
		
		
		Acorn[] list  = new Acorn[3];
		
		list[0] = new  Acorn( "송수빈"  , "구리" ,3);
		list[1] = new  Acorn( "송병화"  , "인천" ,1);
		list[2] = new  Acorn( "용지민"  , "수원" ,2);
		
		
		
		for( Acorn acorn : list) {
			System.out.println( acorn );
		}
		
		
		Arrays.sort(list);
		
		//정렬후 
		

		for( Acorn acorn : list) {
			System.out.println( acorn );
		}
		
		
		
	}

}
