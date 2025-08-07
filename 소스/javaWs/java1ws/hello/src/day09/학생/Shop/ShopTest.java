package day09.학생.Shop;

public class ShopTest {

	public static void main(String[] args) {
		
		
		Shop s;
		s = new Shop();
		

		
		
		s.order(3, 5, 2, 1, 2);
		
		
		
		
		s.printTotal();
		s.shopGrade();
		
		
		
		Shop s2;
		s2 = new Shop();
		
		s2.order(10,1,3,4,1);
		s2.printTotal();
		s2.shopGrade();
		
		
		s.printTotal();
		s.shopGrade();
		

	}

}
