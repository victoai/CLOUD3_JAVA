package day07_0224;

import java.util.Scanner;

public class 출장비1 {

   public static void main(String[] args) {
	   
      work();
   }
   
   public static void work() {
	   Scanner sc=new Scanner(System.in);
	   String name = sc.nextLine();
	   int fee=sc.nextInt();
	   
	   int[]money={50000,10000,5000,1000,500,100, 50,10,5,1};
	   System.out.println("사원명과 출장비를 입력하세요.");
	      
	   //입력한 사원명, 출장비 출력
	   System.out.println();
	   System.out.println("사원명 : "+name);
	   System.out.println("출장비 : "+fee+"원");
	   System.out.println();
	      
	      
	   for(int i=0; i<money.length; i++) {
	   int cnt = fee/money[i];
	   fee=fee%money[i];
	   System.out.print(money[i]+"원 : "+cnt+(i<4?"장 / ":"개 / "));
	   }
   }

}
