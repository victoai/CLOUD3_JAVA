package day14.짝궁인터페이스.박예린_이정호;

import java.util.Scanner;

public class Order {
    public static void main(String[] args) {
        Menu[] menuList = {new Americano(), new Espresso(), new Latte(), new Mocha()};

        Scanner sc = new Scanner(System.in);
        
        System.out.print("1. 음료 정보, 2. 구매: ");
        int select = sc.nextInt();
        
        System.out.println();
        switch(select) {
        case 1:
        	for (int i = 0; i < menuList.length; i++)
		    {
		        System.out.println((i + 1) + ". " + menuList[i].name() + "(" + menuList[i].price() +"원)");
		    }
        	break;
        case 2:
        	System.out.print("현재 소지 금액을 입력해주세요 : ");
        	int money = sc.nextInt();
        	
        	if(money >= 4500) {
        		System.out.println("\n================");
        		System.out.println("아메리카노(4500원)");
        		System.out.println("에스프레소(4500원)");
        		System.out.println("카페모카(5500원)");
        		System.out.println("카페라떼(5000원)");
        		
        		System.out.print("\n음료 이름을 입력해주세요 : ");
                String sellName = sc.next();
                
                System.out.print("구매할 갯수 : ");
                int count = sc.nextInt();
                System.out.println();
                
                boolean found_2 = false;
            	
            	for (Menu m : menuList) {
                    if (m.name().equals(sellName)) {
                    	if(m.totalPrice(count) > money) {
                    		System.out.println("잔액이 부족합니다.");
                    	}else {
                    		 System.out.println("구매할 음료: " + m.name());
                             System.out.println("총 가격: " + m.totalPrice(count) + "원");
                             System.out.println("남은 잔액 : " + (money - m.totalPrice(count)) + "원");
                    	}
                    	found_2 = true;
                    	break;
                    }
            	}
            	
            	if (!found_2) {
                    System.out.println("해당 음료가 없습니다. 정확한 이름을 입력해주세요.");
                }
            	
        	}else {
        		System.out.println("\n잔액이 부족합니다.");
        	}
        	
        	break;
        default:
        	System.out.println("다시 입력해주세요.");
        }

    }
}
