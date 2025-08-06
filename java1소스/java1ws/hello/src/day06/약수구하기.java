package day06;

import java.util.Scanner;

public class 약수구하기 {

	public static void main(String[] args) {
		 
		
	  Scanner sc = new Scanner( System.in);
		
	  int input = sc.nextInt();
	  int[] 약수  = new int[input];
	  
	  for( int i=1; i<= input ; i++) {
		  
		  if( input % i == 0) {
			  System.out.println( i);
		  }
	  }
	  
	  

	}

}
