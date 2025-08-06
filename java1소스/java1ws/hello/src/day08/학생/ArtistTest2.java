package day08.학생;

public class ArtistTest2 {

	public static void main(String[] args) {
		
		Artist a1 = new Artist();
		a1.name = "김범수";
		a1.age = 45;
		a1.debut = 1999;
		a1.titleSong = "보고싶다";
		
		printInfo(a1);
		System.out.println();
		
		Artist a2 = new Artist();
		a2.name = "박효신";
		a2.age = 42;
		a2.debut = 1999;
		a2.titleSong = "눈의 꽃";
		
		printInfo(a2);
		
		
	}

	
	
	public static void printInfo(Artist a) {
		System.out.println("< "+a.name+ " >");
		System.out.println("나이 : " + a.age);
		System.out.println("데뷔년도 : "+ a.debut);
		System.out.println("대표곡 : " + a.titleSong);
	}
	
}
