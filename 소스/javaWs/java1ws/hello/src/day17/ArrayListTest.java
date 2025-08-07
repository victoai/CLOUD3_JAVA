package day17;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {

		
		
		ArrayList<String>  list = new ArrayList<>();
		
		
		list.add("dfdf");
		list.add("hegdg");
		
		
		list.remove(0);
		
		System.out.println( list.size());
		
		//list.remove(0);
		int  deleteIndex=-1;
		for( int i=0  ;i< list.size() ; i++) {
			if( list.get(i).equals("hegdg")) {
				deleteIndex =i;
			}
			
		}
		
		
		list.remove(deleteIndex);
		
		
		
		System.out.println( list.size());
		
		
		
		
	}

}
