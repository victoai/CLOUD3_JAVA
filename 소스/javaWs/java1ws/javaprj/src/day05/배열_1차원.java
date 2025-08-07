package day05;

public class 배열_1차원 {

	public static void main(String[] args) {
		
		
		//String[] 영화1차원  =  {"캡틴 아메리카: 브레이브 뉴" ,"패딩턴: 페루에 가다!" , "써니데이" ,"고백" ,"말할 수 없는 비밀" };
		
		
		
		String[] 영화1차원= new String[5];
		
		
		영화1차원[0] ="캡틴 아메리카: 브레이브 뉴";
		영화1차원[1] ="패딩턴: 페루에 가다!";
		영화1차원[2] ="써니데이";
		영화1차원[3] ="고백";
		영화1차원[4] ="말할 수 없는 비밀";
		
		
		
		for( int i=0; i< 영화1차원.length ; i++) {
			
			System.out.println( 영화1차원[i]);
		}
		
		

	}

}
