package day06.학생.윤현기;
// 1.화폐매수 구하기  문제
// 사원명과  출장비가 입력될 때  출장비에 대한 화폐매수 (고액권부터)를 구하시오
// 화폐단위는 다음과 같다  50000,10000,5000,1000,500,100, 50,10

//ex)
// 361200  - > 오만원: 7   만원:1  , 오천원: 0 , 천원: 1, 오백원: 0 , 백원: 2 , 오십원: 0 , 십원 :0

// 1)사원명과 출장비가 입력되면  화폐매수를 출력하는 프로그램을 작성하시오 (배열 사용 안하는거,  배열사용 하는 거)

// 2)stop 입력될 때 까지  사원명과 출장비가 입력되면 화폐매수를 출력하는 프로그램 작성하시오

// 3) 2과 동일하고 반복이 종료되면 각 화폐별 매수를 출력하는 프로그램을 작성하시오

import java.util.Scanner;

public class currencyPurchase_Noarray03 {
        public static void main(String[] args) {
        	
        	   //화폐단위를 배열에 저장하고 사용하기 
        	    int[] unit  = { 50000,10000,5000,1000,500,100,50,10};
        	    int[] qty  = new int[8];
         
            
                int money =  166640; 
                int temp = money;
                
                
                
                for( int i=0; i< unit.length; i++) {
                    qty[i]= temp /  unit[i];
                    temp %= unit[i];  
                }
                
                
                /*
                int w50000 = temp / 50000;
                temp %= 50000;  
             

                int w10000 = temp / 10000;
                temp %= 10000; 
                

                int w5000 = temp / 5000;
                temp %= 5000;

                
                int w1000 = temp / 1000;
                temp %= 1000;

                
                int w500 = temp / 500;
                temp %= 500;

                
                int w100 = temp / 100;
                temp %= 100;

                
                int w50 = temp / 50;
                temp %= 50;
                

                int w10 = temp / 10;
                
                */
                
                
 
                //화폐매수 전체 출력하기 
                
                for( int i=0; i< qty.length ; i++) {
                	System.out.println(  qty[i]);
                }
                
                
                

            }
         
    }


