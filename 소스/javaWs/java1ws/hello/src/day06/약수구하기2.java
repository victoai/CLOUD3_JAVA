package day06;

import java.util.Arrays;
import java.util.Scanner;

public class 약수구하기2 {

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
	  System.arraycopy(약수, 0, 약수결과, 0, index); 
	  
	  System.out.println( Arrays.toString( 약수결과));
	  System.out.println( Arrays.toString( Arrays.copyOf(약수, index)));
	  
	  

	}

}
