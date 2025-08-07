package day08.화폐;

import java.util.Arrays;

public class 화폐구하기 {

	public static void main(String[] args) {


		//화폐구하기 
		
		
		//오만원
		//만원
		//오천원
		//천원
		//오백원
		//백원
		//오십원
		//십원
		
		int 오마원;
		int 만원;
		int 오천원;
		int 천원;
		int 오백원;
		int 백원;
		
		
	    int money=364100;
	    
	    int[] unit= { 50000,10000,5000,1000,500,100,50,10};
	    int[] qty= new int[8];
	    
	    int i=0;
	    while( money >=10) {
	    	
	    	
	    	qty[i]  = money /unit[i];
	    	money  = money % unit[i];
	    	
	    	
	    	i++;
	    	
	    	
	    }
	    
	    
	    
	    
	    System.out.println(  Arrays.toString(qty));
	    
	 
		
		
		

	}

}
