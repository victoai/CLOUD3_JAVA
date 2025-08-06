package day14.라이브러리;

import java.util.Scanner;

public class KMH implements MyRun{

	@Override
	public void run() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1~5까지");
		int num = sc.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("노브랜드버거");
			break;
		case 2:
			System.out.println("맘스터치");
			break;
		case 3:
			System.out.println("버거킹");
			break;
		case 4:
			System.out.println("롯데리아");
			break;
		case 5:
			System.out.println("맥도날드");
			break;
		default:
			System.out.println("제대로 입력하세요");
		}
	}
	
}
