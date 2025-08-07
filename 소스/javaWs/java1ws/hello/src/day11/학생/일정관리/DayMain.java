package day11.학생.일정관리;

import java.util.ArrayList;
import java.util.Scanner;


public class DayMain {
	
	ArrayList<Day> days = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DayMain aho=new DayMain();
		aho.run();
	}
		 
	public void run() {
		loop: while(true) {
			System.out.println("메뉴 1.등록, 2.조회, 3. 변경, 4. 종료 ");
			int menu = sc.nextInt();
			sc.nextLine();
			switch(menu) {
			case 1:
				register();
				break;
			case 2:
				check();
				break;
			case 3:
				changecheck();
				break;
			case 4:
				end();
				break loop;
			}
		 }
	}
	public void register() {
		Day a=new Day(false);
		
		String tit=sc.nextLine();
		String day=sc.nextLine();
		String des=sc.nextLine();
//		boolean res=sc.nextBoolean();
		a.setTitle(tit); 
		a.setDate(day);
		a.setDesc(des);
//		a.setResult(res);
		days.add(a);
	}
	
	public void check() {
		for(int i=0;i<days.size();i++) {
			System.out.println(days.get(i).toString());
		}
	}
	
	public void changecheck() {
		int a = sc.nextInt();
		boolean b = sc.nextBoolean();
		days.get(a).setResult(b);
	}
	
	public void end() {
		System.out.println("종료");
		System.exit(0);
	}

}
