package day08;

import com.acorn.lhj.LHJ;

public class Program8 {

	public static void main(String[] args) {
		 
	
		boolean result  = LHJ.isAdult( 15);
		
		if( result) {
			System.out.println("술 구매가능 ");
		}else {
			System.out.println("술 구매안됨 !  ");
		}
	}

}
