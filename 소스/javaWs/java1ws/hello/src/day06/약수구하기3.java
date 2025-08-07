package day06;

import java.util.Arrays;
import java.util.Scanner;

public class 약수구하기3 {

	public static void main(String[] args) {
		 
		
	  Scanner sc = new Scanner( System.in);
		
	  int input = sc.nextInt();
	  int[] 약수  = new int[input];
	  
	  
	  int index=0;
	  
	  for( int i=1; i<= input ; i++) {
		  
		  if( input % i == 0) {
			  //System.out.println( i);
			  약수[ index] =  i;
			  index++;
		  }
	  }
	  
	  
	  int[] 약수결과  = new int[index];
	 
	  
	  for( int i=0; i< index; i++) {
		  
		  약수결과[i] =약수[i];
		  
	  }
	  

	}

}
