package day08.학생;

public class MovieCustomerTest {

	public static void main(String[] args) {
		
		MovieCustomer c = new MovieCustomer();
		
		c.customerNumber = 192911;
		c.name = "전우선";
		c.age = 27;
		c.address = "경기도 시흥시";
		c.movieGenre = "액션";
		c.rentMovie = "범죄도시";
		
		printMovieCustomer(c);

	}
	
	public static void printMovieCustomer(MovieCustomer c) {
		System.out.println("고객 번호 : " + c.customerNumber);
		System.out.println("이름 : " + c.name);
		System.out.println("나이 : " + c.age);
		System.out.println("주소 : " + c.address);
		System.out.println("장르 : " + c.movieGenre);
		System.out.println("영화명 : " + c.rentMovie);
	}

}
