package day07.학생;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MealCalculator_소병학 {

    public static int calculateTotalPrice(Map<String, Integer> menu, int numberOfPeople) {
        Scanner scanner = new Scanner(System.in);
        int totalPrice = 0;

   
        String[] menuItems = menu.keySet().toArray(new String[0]);
        
        for (int j = 0; j < menuItems.length; j++) {
            System.out.println((j + 1) + ". " + menuItems[j] + " - " + menu.get(menuItems[j]) + "원");
        }

        for (int i = 1; i <= numberOfPeople; i++) {
          
            System.out.println("메뉴를 선택하세요 (번호 입력):");
            
            int menuNumber = scanner.nextInt();  

            if (menuNumber > 0 && menuNumber <= menuItems.length) {
                totalPrice += menu.get(menuItems[menuNumber - 1]);
            } else {
                System.out.println("잘못된 번호를 입력했습니다. 다시 입력해주세요.");
                i--; 
            }
        }

        scanner.close();  // Scanner 닫기
        return totalPrice;  // 총 가격 반환
    }

    public static void main(String[] args) {
        // 메뉴 리스트 생성
        Map<String, Integer> menu = new HashMap<>();
        menu.put("제육덮밥_청국장정식", 10000);
        menu.put("김치제육정식", 12000);
        menu.put("비빔밥", 8000);
        menu.put("된장찌개", 7000);

    
        Scanner scanner = new Scanner(System.in);
        System.out.print("사람 수를 입력하세요: ");
        int numberOfPeople = scanner.nextInt();

     
        int totalPrice = calculateTotalPrice(menu, numberOfPeople);

    
        System.out.println("총 가격은 " + totalPrice + "원 입니다.");
    }
}
