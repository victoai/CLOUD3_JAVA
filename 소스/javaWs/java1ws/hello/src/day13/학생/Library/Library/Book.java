package day13.학생.Library.Library;

public class Book {

	private String title;
	private String author;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public void printInfo() {
		System.out.println("제목: " + title);
		System.out.println("저자: " + author);
	}
}
