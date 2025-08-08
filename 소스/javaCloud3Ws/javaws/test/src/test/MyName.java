package test;

public class MyName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		char ch1= 0xC6B0;
		char  ch2 =0xC8FC;
		char ch3=0xC5F0;
		
		
		
		System.out.print( ch1);
		System.out.print( ch2);
		System.out.print( ch3);
		
		

		
		char[] name = {0xC6B0,0xC8FC,0xC5F0 };
		
		
		for( char item: name) {
			System.out.print( item);
		}
	}

}
