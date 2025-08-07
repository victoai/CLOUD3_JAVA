package day14.인터페이스.라이브러리;

import java.util.Scanner;

public class 전지형 implements MyRunnable {

	@Override
	public void run() {

//		for(int i=1; i<=9; i++) {
//			System.out.println(2*i);
//		}
		
		System.out.println("벌칙: 랜덤으로 나온 숫자로 음료의 잔수를 마신다");
		System.out.println("음료를 고르세요: 1.마시는청국장 2.피클주스소다 3.프라이드치킨음료 4.피자맥주음료");
		System.out.println("주사위를 돌리세요. 주사위를 돌린 사람이 지목하여 2명이 나눠서 마신다");
		
		int random = (int) (Math.random()*6);
		
		System.out.println(random*2);
			
			
		
	}
	
}
