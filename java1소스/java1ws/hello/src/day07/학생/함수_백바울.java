package day07.학생;

import java.util.Arrays;
import java.util.Random;

public class 함수_백바울 {

	public static void main(String[] args) {
		System.out.println("4. 이번주 예상 로또번호를 반환하는 함수 만들기 ");
		System.out.println();

		
//		System.out.println(Arrays.toString(lotto()));
		int[] result = lotto();
		
		for(int i =0 ; i <result.length ; i++) {
			System.out.println(result[i]);
		} 
		
		
	}

	//로또함수
	public static int[] lotto() {
		Random lotto = new Random();

		int[] number = new int[6];

		for (int i = 0; i < number.length; i++) {
			number[i] = lotto.nextInt(45) + 1;

			if (i > 0) {
				for (int j = 0; j < i; j++) {
					if (number[i] == number[j]) {
						i--;
					}
				}
			}
			
		}
		
		for(int i = 0 ; i < number.length; i++) {
			for(int j = i+1 ; j < number.length ; j++) {
				if(number[i] > number[j]) {
					int a = number[i]; //i열의 값을 a라는 변수에 저장
					number[i]= number[j]; // j열의 값을 i열에 저장 
					number[j] = a; // i열의 값이 저장되어있던 a의 값을 j열에 저장
				}
			}
				
		}
		return number;
		
		
	}
}
