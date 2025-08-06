package day14.인터페이스;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		
		우주연  a= new 우주연();
		//a.많이먹다();
		
		많이먹는게가능한 b =a;		
		//b.많이먹다();		
		
		
		용지민 c= new 용지민();
		
		
		//
		ArrayList<많이먹는게가능한> list = new ArrayList<>();
		list.add(a);
		list.add(c);
		
		
		
		for( int i=0 ; i< list.size() ; i++) {
			list.get(i).많이먹다();
		}
		
		
		
		
		
	}

}
