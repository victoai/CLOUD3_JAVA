package day07.학생;

import java.util.Scanner;

public class 함수연습 {

    public static void main(String[] args) {
        // 구구단 출력 메소드 호출
        System.out.println("함수호출 구구단");
        
    	mul();// 함수호출 구구단
    	int[][] gugudan = calGu(); //함수호출 배열구구단
    	priGu(gugudan);
    	
    	menu(); //함수호출 메뉴
    }
  //---------------------------------------------------------------------
    public static void mul() {
    	
    	
        for(int i=2; i<=9; i++) {
        	System.out.println("---- " + i + " 단----");
            for(int j=1; j<=9; j++) {
                int result = i * j; 
                System.out.println(i + " * " + j + " = " + result);
               
            }
            
        }
    }
  //---------------------------------------------------------------------
    public static int[][] calGu() {
    	int[][] gugudan = new int[8][9];
    	for(int i=0; i<8; i++) {
    		for(int j=0; j<9; j++) {
    			int result = (i+2) * (j+1);
    			gugudan[i][j]=(i+2)*(j+1);
    		}
    	}
    	return gugudan;
    }
    
    public static void priGu(int[][] gugudan) {
    	for(int i=0; i<gugudan.length; i++) {
    		System.out.println("----배열 " + (i+2) +" 구구단----");
    		for(int j=0; j<gugudan.length; j++) {
    			System.out.println((i+2) + " * " + (j+1) + "=" + gugudan[i][j]);
    		}
    	}
    }
     
    //---------------------------------------------------------------------
    public static void menu() {
    	System.out.println("1.주문 2.주문취소 3.주문조회 4.종료");
    	
    	loop:while(true) {
    	Scanner sc = new Scanner(System.in);
    	int input = sc.nextInt();
    	
    	switch(input) {
    	case 1: 
    		System.out.println("주문을 선택하셨습니다");
    		System.out.println("주문메뉴 번호를 선택하세요");
    		int menuSel = sc.nextInt();
    		String[] menuList = {"김밥", "참치김밥", "크래미김밥", "묵은지김밥", "청양김밥"};
    		
  
    		break;
    	case 2: 
    		System.out.println("주문을 취소하겠습니다");
    		break;
    	case 3: 
    		System.out.println("주문 조회합니다");
    		break;
    	case 4: 
    		System.out.println("종료하겠습니다");
    		break loop;
    		
    		default:
    			System.out.println("다시 선택하세요");
    		
    	}
    }
    
    }
  
    }
