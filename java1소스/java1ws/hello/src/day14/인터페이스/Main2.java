package day14.인터페이스;

import java.util.ArrayList;

public class Main2 {

	public static void main(String[] args) {
		 
		
		
		ArrayList<Object> list = new ArrayList<>();
		list.add( new 황지영());
		list.add( new 김세중());
		list.add( new 김세현());
		list.add( new 김솔());
		list.add( new 주상길());
		list.add( new 하예진());
		list.add( new 김정석());
		list.add( new 최문길());
		list.add( new 송수빈());
		list.add( new 김도현());
		list.add( new 전우선());
		list.add( new 이상민());
		list.add( new 전지형());
		
		
		
		
		ArrayList<나는게가능한>  나는그룹 = new ArrayList<>();
		ArrayList<많이먹는게가능한>  많이먹는그룹 = new ArrayList<>();		
		ArrayList<변신가능한>  변신그룹 = new ArrayList<>();		
		ArrayList<불어가능한>  불어그룹 = new ArrayList<>();		
		ArrayList<싸움이가능한17대1>  싸움그룹 = new ArrayList<>();		
		ArrayList<장풍이가능한>  장풍그룹 = new ArrayList<>();		
		ArrayList<태권도가가능한>  태권도그룹 = new ArrayList<>();
		
		 
		
		
		for( int  i =0 ;  i<  list.size()  ;i ++) {
			
			Object o   = list.get(i);
			
			if(  o instanceof 나는게가능한 ) {
				나는그룹.add( (나는게가능한)  o);				
			}
			
			
			
			if(  o instanceof 많이먹는게가능한 ) {
				많이먹는그룹.add( (많이먹는게가능한)  o);				
			}
			
			

			if(  o instanceof 변신가능한 ) {
				변신그룹.add( (변신가능한)  o);				
			}
			

			if(  o instanceof 불어가능한 ) {
				불어그룹.add( (불어가능한)  o);				
			}
			
			
			
			if(  o instanceof 싸움이가능한17대1 ) {
				싸움그룹.add( (싸움이가능한17대1)  o);				
			}
			
			
			if(  o instanceof 장풍이가능한 ) {
				장풍그룹.add( (장풍이가능한)  o);				
			}
			
			
			
			if(  o instanceof 태권도가가능한 ) {
				태권도그룹.add( (태권도가가능한)  o);				
			}
			
		}
		
		
		// 일괄명령주기
		
		
		System.out.println( "나는그룹");
		for( int i=0 ; i< 나는그룹.size() ;i++ ) {
			나는그룹.get(i).날수있다();
		}
		
		
		
		
		for( int i=0 ; i< 많이먹는그룹.size() ;i++ ) {
			많이먹는그룹.get(i).많이먹다();;
		}
		
		

		for( int i=0 ; i< 변신그룹.size() ;i++ ) {
			변신그룹.get(i).변신하기();
		}
		
		
		

		for( int i=0 ; i< 불어그룹.size() ;i++ ) {
			불어그룹.get(i).불어를한다();
		}
		
		

		for( int i=0 ; i< 싸움그룹.size() ;i++ ) {
			싸움그룹.get(i).싸움하기();
		}
		
		

		for( int i=0 ; i< 장풍그룹.size() ;i++ ) {
			장풍그룹.get(i).장풍날리기();
		}
		
		

		for( int i=0 ; i< 태권도그룹.size() ;i++ ) {
			태권도그룹.get(i).태권도하기();
		} 
		
		
	}

}
