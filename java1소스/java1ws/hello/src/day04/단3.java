package day04;

import java.util.Scanner;

public class 단3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		int num;
		
		Scanner sc = new Scanner( System.in);
         do {
        	 
        	 num = sc.nextInt();
        			 if( num <0  || num  >100)
        				 System.out.println("dfdfd");
            
        	 
         } while (num < 0  || num >100); // 1~9까지 반복
	}

}
