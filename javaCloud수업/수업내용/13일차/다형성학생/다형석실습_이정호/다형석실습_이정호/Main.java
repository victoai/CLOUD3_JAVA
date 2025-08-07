package day12.다형성실습;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Mon mon = new Mon();
		Tue tue = new Tue();
		Wen wen = new Wen();
		Thu thu = new Thu();
		Fri fri = new Fri();
		Pizza pizza = new Pizza();
		
		Scanner scan = new Scanner(System.in);
		
		loop : while(true) {
			System.out.print("요일을 입력하세요(일 ~ 토), stop를 입력하면 종료 : ");
			String week = scan.next();
			System.out.println();
			
			switch(week) {
			case "월":
				mon.printPizza();
				break;
			case "화":
				tue.printPizza();
				break;
			case "수":
				wen.printPizza();
				break;
			case "목":
				thu.printPizza();
				break;
			case "금":
				fri.printPizza();
				break;
			case "stop":
				System.out.println("종료되었습니다");
				break loop;
			default:
				pizza.printPizza();
				System.out.println();
			}
		}

	}

}
