package day20.test;

import java.util.Arrays;
import java.util.Comparator;

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
		
		
		
        Acorn2[] list2   = new Acorn2[3];
		
		list2[0] = new  Acorn2( "권지언"  , "서울" ,3);
		list2[1] = new  Acorn2( "이동우"  , "인천" ,1);
		list2[2] = new  Acorn2( "오윤석"  , "수원" ,2);
		
		
		
		for( Acorn2 acorn : list2) {
			System.out.println( acorn );
		}
		
		
		//Arrays.sort(list2);
		
		//정렬후 
		

		for( Acorn2 acorn : list2) {
			System.out.println( acorn );
		}
		
		
		
		
		
		Arrays.sort( list2, new Comparator<Acorn2>() {

			@Override
			public int compare(Acorn2 o1, Acorn2 o2) {
				 
				return  o1.no - o2.no;
			}});
		
		
		System.out.println("정렬후  ==>");
		
		for( Acorn2 acorn : list2) {
			System.out.println( acorn );
		}
		
		
		
	}

}
