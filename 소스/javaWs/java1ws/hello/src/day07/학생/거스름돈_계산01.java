package day07.학생;

import java.util.Arrays;

public class 거스름돈_계산01 {

	public static void change(int money) {
			if(money / 10000 != 0) {
				System.out.println("만원 : " + (money / 10000) + "장");
				money -= (money / 10000) * 10000;
			}
			if(money / 5000 != 0) {
				System.out.println("오천원 : " + (money / 5000) + "장");
				money -= (money / 5000) * 5000;
			}
			if(money / 1000 != 0) {
				System.out.println("천원 : " + (money / 1000) + "장");
				money -= (money / 1000) * 1000;
			}
			if(money / 500 != 0) {
				System.out.println("오백원 : " + (money / 500) + "개");
				money -= (money / 500) * 500;
			}
			if(money / 100 != 0) {
				System.out.println("백원 : " + (money / 100) + "개");
				money -= (money / 100) * 100;
			}
			if(money / 50 != 0) {
				System.out.println("오십원 : " + (money / 50) + "개");
				money -= (money / 50) * 50;
			}
			if(money / 10 != 0) {
				System.out.println("십원 : " + (money / 10) + "개");
				money -= (money / 10) * 10;
			}
	}
	
	public static void change2(int money) {
		int[] price = {10000,5000,1000,500,100,50,10};
		for(int i=0; i<price.length; i++) {
			if(money / price[i] != 0) {
				System.out.println(price[i] + "원 : " + (money / price[i]) );
				money -= (money / price[i]) * price[i];
			}
		}
	}
	
	public static int[] change3(int money) {
		int[] price = {10000,5000,1000,500,100,50,10};
		int[] result = new int[7];
		for(int i=0; i<price.length; i++) {
			if(money / price[i] != 0) {
//				System.out.println(price[i] + "원 : " + (money / price[i]) );
				result[i] = (money / price[i]);
				money -= (money / price[i]) * price[i];
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] result = change3(106750);
		System.out.println(Arrays.toString(result));
	}
}
