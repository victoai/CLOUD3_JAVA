package day13;

public class Main {

	public static void main(String[] args) {

		System.out.println("=====기본출력=====");
		Music music = new Music();
		Movie movie = new Movie();
		Radio radio = new Radio();

		Content a1 = music;
		a1.play();
		Content a2 = movie;
		a2.play();
		Content a3 = radio;
		a3.play();

		System.out.println("\n=====배열출력=====");
		Content[] contents = new Content[3];
		contents[0] = music;
		contents[1] = movie;
		contents[2] = radio;

		for (Content content : contents) {
			content.play();
		}

		System.out.println("\n=====업캐스팅=====");
		Content content = new Music(); // Music을 Content로 업캐스팅
		content.play();

		System.out.println("\n=====다운캐스팅=====");
		Content content1 = new Music(); // Music을 Content로 업캐스팅 -> 자식객체를 부모타입으로 업캐스팅
		Music music1 = (Music) content1;
		music1.play();

		System.out.println("\n=====올바르지 않은 다운캐스팅=====");
		Movie movie1 = (Movie) content; // 업캐스팅 하지 않은 채 Content에서 Movie로 다운캐스팅
		movie1.play();

	}

}
