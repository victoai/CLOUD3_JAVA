package hello;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		int input;
		int randomSu;
		int cnt=0;
		Scanner sc = new Scanner(System.in);
		
		randomSu = (int)(Math.random()*100);
		System.out.println(randomSu);

		while(true) {
			System.out.print("숫자를 입력하세요 : ");
			input=sc.nextInt();
			
			if(input>randomSu) {
				System.out.println("down");
			}else if(input<randomSu) {
				System.out.println("up");
			}else if(input==randomSu) {
				break;
			}
			cnt++;
		}
		System.out.println("정답! "+cnt+" 번 시도하셨습니다");
		System.out.printf("정답! %d번 시도하셨습니다",cnt);
		sc.close();
	}
}
