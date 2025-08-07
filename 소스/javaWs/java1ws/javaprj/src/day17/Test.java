package day17;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		 
		ArrayList<Score> list = new ArrayList<>();
		
		
		
		list.add(new Score("홍길동",100));
		list.add(new Score("홍길동",90));
		
		list.add(new Score("홍길동",100));
		
		list.add(new Score("홍길동",100));
		
		
		
		/*
		for( Score  s : list) {
			if( s.kor==90) list.remove(s);
		}
		*/
		
		
		
		/*
		for( int i=0; i< list.size() ;i++) {
			Score s = list.get(i);
			if(s.kor==90 ) {
				list.remove(s);
			}
		}
		
		*/
		 
		
		for( Score s: list) {
			System.out.println(s);
		}
		
		
		
		Iterator<Score>  it  =  list.iterator();
		
		while( it.hasNext()) {
			
			Score s   = it.next();
			System.out.println(s);
			
			if(s.kor==90) {
				it.remove();
			}
		}
		
		//
		
		System.out.println("=====>");
		for( Score s: list) {
			System.out.println(s);
		}
		
		
	}

}
