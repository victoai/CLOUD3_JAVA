package day13.학생.Library.Library;

public class Thesis extends Book{
	
	private String subject;

    public Thesis(String title, String author, String subject) {
        super(title, author);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("주제: " + subject);
    }
}
