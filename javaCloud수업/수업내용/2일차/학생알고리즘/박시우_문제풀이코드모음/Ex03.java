package hello;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		int positive=0,negative=0,even=0,odd=0;
		
		for(int i=0; i<5; i++) {
			System.out.print("숫자를 입력하시오: ");
			int tmp=sc.nextInt();
			arr[i]=tmp;
		}
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>=0) {
				positive+=1;
				if(arr[i]%2==0) {
					even+=1;
				} else if(arr[i]%2==1) {
					odd+=1;
				}
			} else if(arr[i]<0) {
				negative+=1;
			}
		}
		
		System.out.printf("입력하신 수 중에서 양수는 %d개, 음수는 %d개 이고 양수중에서 짝수는 %d개, 홀수는 %d개 입니다.",
				positive,negative,even,odd);
		
		sc.close();
	}
	
}
