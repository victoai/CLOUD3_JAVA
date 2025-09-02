package day23.추가;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ScoreArraysList정렬하기 {

	public static void main(String[] args) {
		 
		  
		ArrayList<Score> list2 = new ArrayList<>();
		list2.add( new Score("박예린", 100,90));
		list2.add( new Score("이정호", 99,90));
		list2.add( new Score("김민환", 89,100));
		list2.add( new Score("김유민", 88,77));
		list2.add( new  Score("박수경", 85,89));
		
		 
		
		Collections.sort(list2);		
		System.out.println( "===>정렬후==");
		for( Score s : list2) {
			System.out.println( s);
		}
		
		
		
		Collections.sort(list2 , new Comparator<Score>() {

			@Override
			public int compare(Score o1, Score o2) {
				// TODO Auto-generated method stub
				return o1.eng-o2.eng;
			}} );

			 
		
		System.out.println( "===>평균 오름차순 정렬 ==");
		for( Score s : list2) {
			System.out.println( s);
		}
		
		
		
		
	}

}
