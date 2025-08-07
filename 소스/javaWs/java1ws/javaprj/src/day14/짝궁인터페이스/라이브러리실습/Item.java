package day14.짝궁인터페이스.라이브러리실습;

public class Item {
	private String name;
	private int cnt;
	private int price;
	private int totalPrice;

	public Item(String name, int cnt, int price) {
		super();
		this.name = name;
		this.cnt = cnt;
		this.price = price;
		calcTotalPrice();
	}

	private void calcTotalPrice() {
		this.totalPrice = this.cnt * this.price;
	}

	public String getName() {
		return this.name;
	}

	public int getCnt() {
		return this.cnt;
	}

	public int getPrice() {
		return this.price;
	}

	public int getTotalPrice() {
		return this.totalPrice;
	}

	public void updateCnt(int cnt) {
		this.cnt += cnt;
		calcTotalPrice();
	}

	// 전체 삭제를 하는지 확인하는 메서드 삭제할 개수가 크거나 같으면 true반환, 더 적으면 개수 만큼 삭제 후 false 반환
	public boolean isRemoveAll(int cnt) {
		if (this.cnt <= cnt) {
			return true;
		} else {
			this.cnt -= cnt;
			calcTotalPrice();
			return false;
		}
	}

	@Override
	public String toString() {
		return "[상품 명 : " + name + ", 수량 : " + cnt + ", 가격 : " + price + ", 총 금액 : " + totalPrice + "]";
	}

}
