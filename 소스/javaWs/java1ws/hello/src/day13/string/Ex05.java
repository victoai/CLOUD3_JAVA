package day13.string;

public class Ex05 {

	public static void main(String[] args) {
		String str="AWESOME-amazing";
		
		
		System.out.println( str.length());
		System.out.println(  str.toLowerCase());
		System.out.println(  str.substring(8));  // 시작index  ~ 끝까지 		
		System.out.println(  str.substring(1,4));  //  시작index 끝index 전까지 
		String[]  result = str.split("-");
		
		for( String  s : result) {
			System.out.println( s);
		}
		
		
		String str2="AWESOME-amazing1";
		
		//문자열비교  (문자열의 내용 비교  : 하나 하나 비교하는 과정을 거친다)
		boolean result2= str.equals(str2);
		System.out.println( result2);
		
		 
		

	}

}
