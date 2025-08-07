package day05;

import java.util.Arrays;
import java.util.Scanner;

public class 짝수배열문제 {

	public static void main(String[] args) {
		//1차배열 (정수형배열 10개), 숫자 10개를 저장할 수 있는 배열 준비하기
		//수를 입력받아서 짝수만 저장하고 출력하기
		//수가 0이면 입력되면 종료
		
		//숫자를 입력 받아서 10개 (배열에 저장한 후) => 배열의 내용 10개를 출력하기
		//숫자를 입력 받아서 0이 아니면 배열에 저장한 후 => 입력된 갯수만큼 출력하기
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[10];
		int index = 0;
		
		while(true) {
			System.out.print("숫자를 입력하세요 : ");
			int num = Integer.parseInt(scan.nextLine());
			
			if(num % 2 == 0) {
				if(index >= 10) break;
				arr[index] = num;
				index++;
			}
			
			if(num == 0) break;
		}
		
		
		int[] result = Arrays.copyOf(arr, index - 1); //Arrays.copyOf(원본 배열, 복사할 길이)
		
		if(index == 10) {
			System.out.print(Arrays.toString(arr));
		}else {
			System.out.print(Arrays.toString(result));
		}

	}

}
