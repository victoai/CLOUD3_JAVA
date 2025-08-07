package day08.학생;

public class SongTest {

	public static void main(String[] args) {

		Song s = new Song();
		
		s.name = "밤하늘의 별을";
		s.singer = "경서";
		s.year = 2020;
		s.genre = "발라드";
		
		밤하늘의_별을(s);

	}
	
	public static void 밤하늘의_별을(Song s) {
		System.out.println("제목: " + s.name);
		System.out.println("가수: " + s.singer);
		System.out.println("발매년도: " + s.year);
		System.out.println("장르: " + s.genre);
	}

}
