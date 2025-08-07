package day16.io.기반;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class 실습파일복사2 {

	public static void main(String[] args) {
		 
		
		FileInputStream fis =null;
		FileOutputStream fos = null;
		
		
		
		  try {
			fis = new FileInputStream( "res/cute.jpg");
			fos  = new FileOutputStream("res/cuteCopy6.jpg");
			
			//
			fis.transferTo(fos);
			
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		  
		
		  
		  
		
	}

}
