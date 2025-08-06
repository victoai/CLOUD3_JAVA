package day13.stringEx;

public class 대소문자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String str="hello";   //대문자로 변환 
		
		String result  =str.toUpperCase();
		System.out.println( result);
		System.out.println( str);
		
		
		String str2="HELLO";
		String result2 = str2.toLowerCase();
		System.out.println( result2);
		System.out.println( str2);
		
		/*
		  
		  'A' ->65   'a' ->97    ,  '0'  -> 48	    
		  
		   32를 더하거나 빼면 대문자 소문자로 변환이 가능함 
		 */
		
		

	}

}
