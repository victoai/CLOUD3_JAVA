package day09.학생.Books;

public class Books { // 단수
	long orderNumber; // 주문번호
	String title; // 제목
	String author; // 저자
	String publisher; // 출판사
	String date; // 출판 날짜
	int price; // 가격
	boolean possible; // 구매 가능 여부 (재고)

	// 책 객체 생성 후 값 초기화
	public void input(long orderNumber, String title, String author, String publisher, String date, int price,
			boolean possible) {
		this.orderNumber = orderNumber;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.date = date;
		this.price = price;
		this.possible = possible;
	}

	// 책 객체 정보 (변수 값 확인)
	public void printInfo() {
		System.out.println("주문번호 : " + this.orderNumber);
		System.out.println("제목 : " + this.title);
		System.out.println("저자 : " + this.author);
		System.out.println("출판사 : " + this.publisher);
		System.out.println("출판일 : " + this.date);
		System.out.println("가격 : " + this.price);
		System.out.println("구매 가능 여부 : " + this.possible);
		System.out.println();
	}
}
