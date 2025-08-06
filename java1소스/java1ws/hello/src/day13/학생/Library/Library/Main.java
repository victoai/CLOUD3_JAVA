package day13.학생.Library.Library;

public class Main {

	public static void main(String[] args) {

		Book[] books = new Book[2];
        books[0] = new Novel("아몬드", "손원평", "드라마");
        books[1] = new Thesis("도파민 터지는 세상에서 나는 왜 우울한가", "장래혁", "뇌과학");

        System.out.println("==== 책 정보 ====");
        for (Book book : books) {
            book.printInfo();
            System.out.println();
        }
    }

}
