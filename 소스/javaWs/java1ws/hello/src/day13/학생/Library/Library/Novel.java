package day13.학생.Library.Library;

public class Novel extends Book{
	
	private String genre;

    public Novel(String title, String author, String genre) {
        super(title, author);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("장르: " + genre);
    }

}
