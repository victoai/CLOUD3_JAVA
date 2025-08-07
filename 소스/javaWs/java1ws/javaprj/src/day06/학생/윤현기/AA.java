package day06.학생.윤현기;

import java.util.Scanner;

public class AA {

	public static void main(String[] args) {
		 
		
		Scanner sc = new Scanner( System.in);
		
		while( true) {
			
			String name = sc.next();
			if( name.equals("stop")) break;		
			
			System.out.println( name);
			
			
			//핵심		
			
			
			 int[] unit  = { 50000,10000,5000,1000,500,100,50,10};
	         
	            
             //int money =  166640;
			 int money  = sc.nextInt();
             int temp = money;
             
             
             
             for( int i=0; i< unit.length; i++) {
                 int w50000 = temp /  unit[i];
                 temp %= unit[i]; 
                 
                 System.out.println(w50000 );
             }
             
             
			
			
			
		}
		
		
		
	}

}
