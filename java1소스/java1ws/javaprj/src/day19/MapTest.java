package day19;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Map<String, String> list  = new HashMap<>();
		
		String aaa =list.putIfAbsent("google", "1234");
		String kkk=list.putIfAbsent("google", "4567");
		
		
	 
		
		
		String pw  =list.get("google");
		System.out.println( pw);
		System.out.println(kkk);
		System.out.println(aaa);
		
		

	}

}
