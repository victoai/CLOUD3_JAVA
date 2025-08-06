package day14.짝궁인터페이스.라이브러리실습;

public interface Mart {
	void addItem(String name, int cnt, int price);

	void removeItem(String name, int cnt);

	void printItems(String pay);
}