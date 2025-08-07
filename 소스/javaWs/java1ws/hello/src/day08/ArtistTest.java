package day08;

public class ArtistTest {

	public static void main(String[] args) {
		 

		//artist 정보를 담을 수 있는 변수 만들기
		Artist  a = new Artist();
		
		
		a.name="이승환";
		a.age=60;
		a.debut=1989;
		a.titleSong="천일동안";
		
		
		
		System.out.println( a.name);
		System.out.println( a.age);
		System.out.println( a.debut);
		System.out.println( a.titleSong);
		
		
		printArtist( a);	
		
	}
	 
	
	public static void printArtist( Artist a) {
		System.out.println( a.name);
		System.out.println( a.age);
		System.out.println( a.debut);
		System.out.println( a.titleSong);
		
	}
	

}
