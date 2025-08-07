package day16.prac.io.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex01 {

	public static void main(String[] args)   {
		// TODO Auto-generated method stub
		
		
		//파일로 부터 읽기  
		//파일로 쓰기
		
		
		//기반스트림  - 바이트스트림, 문자스트림 
		
		
		
		//바이트스트림 
		//기반스트림
		FileInputStream fis = null;
	 
			try {
				fis = new FileInputStream("res/input.txt");
				
				 int data  =fis.read();			
				 System.out.print( (char) data);
				 
				   data  =fis.read();			
				 System.out.print( (char) data);
				
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				 //e.printStackTrace();
				System.out.println( e.getMessage()); 
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			
		
			
			
			
			
			System.out.println("프로그램 종료");
		
		
		

	}

}
