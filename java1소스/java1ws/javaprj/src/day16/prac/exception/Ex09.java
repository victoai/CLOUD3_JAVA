package day16.prac.exception;

import java.io.IOException;

public class Ex09 {

	
	
	public static void main(String[] args) {
		 
		try {
			키보드로부터읽어오기();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//
	}
	
	//
	/* 직접예외처리하기 
	public static void 키보드로부터읽어오기() {		
		
		try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
	
	
	//예외미루기 
	//매서드를 호출한 쪽으로 예외가 넘어감
    public static void 키보드로부터읽어오기() throws IOException {	
	
    	System.in.read();
    	
	 
	} 
	
	
}
