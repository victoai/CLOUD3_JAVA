package day16.prac.io;

import java.io.IOException;
import java.io.InputStreamReader;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//키보드로 부터 한글 읽기 
		//=> 기반스트림 (바이트 스트림만 제공됨 )으로만 사용하면 한글이 깨짐 
		//=> 보조스트림을 제공함 
		
		
		
//		InputStreamReader is  = new InputStreamReader();  // 기본생성자를 제공하지않는다 .  기반스트림이 없으면 제대로 작동안함 
		InputStreamReader  is = new InputStreamReader(System.in);
		
		
		try {
		  int data =	is.read();
		  System.out.println( data);
		  System.out.println( (char) data);
		  
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
