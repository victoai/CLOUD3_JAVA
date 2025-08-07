package day07_0224;

import java.util.Scanner;

public class 출장비2 {

   public static void main(String[] args) {

      
      Scanner sc=new Scanner(System.in);
      int[]money={50000,10000,5000,1000,500,100, 50,10,5,1};
      
      while(true) {
         System.out.println("사원명과 출장비를 입력하세요. (stop이 입력되기 전까지 반복 출력됩니다.)");
         String name = sc.nextLine();
         int fee=sc.nextInt();
         
//         if(name.equals("stop")){
//            System.out.println("종료합니다.");
//            break;
//         }
         
         for(int i=0; i<money.length; i++) {
        	 int cnt = fee/money[i];
        	 fee=fee%money[i];
        	 System.out.print(money[i]+"원 : "+cnt+(i<4?"장 / ":"개 / "));
         }
      }
      
       

   }

}

