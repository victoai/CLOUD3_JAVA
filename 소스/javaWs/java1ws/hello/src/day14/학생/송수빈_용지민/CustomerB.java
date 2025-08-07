package day14.학생.송수빈_용지민;

import java.util.Scanner;

public class CustomerB implements CustomerI {
	
	int qty;
	int price;

	@Override
	public void order() {
		System.out.println("CustomerB: 수박주스 주문");
		
	}

	@Override
	public void inputQty() {
		System.out.print("수량 입력: ");
		Scanner sc = new Scanner(System.in);
		this.qty = sc.nextInt();
		sc.nextLine();
	}

	@Override
	public void pay() {
		this.price = 4000 * qty;
		System.out.println("총 주문금액 " + price + "원");
		
	}
	
	

}
