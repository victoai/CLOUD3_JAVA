package 박수경;

import java.util.ArrayList;

public class 프로그램2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList  list = new ArrayList(); 
		
		list.add(new 구급차());
		
		
		구급차 b  = new 구급차();		
		Object o =b;
		
		
		Object o2 =list.get(0);
		
		((구급차)o2).삐용(); 
	
		

	}

}
