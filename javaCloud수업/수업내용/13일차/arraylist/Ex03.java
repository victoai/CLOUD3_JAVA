package day13.arraylist;

import java.util.ArrayList;

public class Ex03 {

	public static void main(String[] args) {
		 
		
		ArrayList< Score> list  = new ArrayList<>();
		
		
		list.add(new Score("김채운", 100,99));
		list.add(new Score("주형준", 99,100));
		list.add(new Score("김솔", 100,99));
		list.add(new Score("송수빈", 99,99));
		list.add(new Score("이효진", 100,98));
		
		
		
		for( int i=0 ; i< list.size() ; i++) {
			
			Score s =list.get(i);
			System.out.println( s.toString());
			s.printInfo();
		}
		

	}

}
