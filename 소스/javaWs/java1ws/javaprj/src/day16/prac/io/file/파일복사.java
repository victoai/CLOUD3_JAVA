package day16.prac.io.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class 파일복사 {

	public static void main(String[] args) {
	 
		
		
		//이미지 파일 복사하기 
		
		//입력스트림(바이트 기반 스트림)
		//출력스트림(바이트 기반 스트림)
		
		//FileInputStream
		//FileOutputStream 
		
		FileInputStream  f=null;
		FileOutputStream o = null;
		
		try {
			   f = new FileInputStream("res/img.jpg");
			   o = new FileOutputStream("res/imgcopy55.jpg");
			   
			   int ch;
			   while( (ch  = f.read() )  != -1   ) { 				  
				  o.write(ch);
			   }
			   
			   
			   
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			
			if( f != null) {
				try {
					f.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
			if(o !=null) {
				try {
					o.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
		}
		
		
		
	}

}
