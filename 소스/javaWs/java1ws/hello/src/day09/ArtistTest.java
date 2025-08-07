package day09;

public class ArtistTest {

	public static void main(String[] args) {
		
		
		//변수
		Artist  a1 = new Artist();
		//값 저장
		a1.newName = "김범수";
		a1.age = 45;
		a1.debut = 1999;
		a1.titleSong = "보고싶다";
		
		
		//값 이용
		printArtist(a1); 		
		printArtist(a1); 		
		printArtist(a1); 

	}

	
	public static void printArtist(Artist a1) {		
		System.out.println( a1.newName);
		System.out.println( a1.age);
		System.out.println( a1.debut);
		System.out.println( a1.titleSong);
	}

}
