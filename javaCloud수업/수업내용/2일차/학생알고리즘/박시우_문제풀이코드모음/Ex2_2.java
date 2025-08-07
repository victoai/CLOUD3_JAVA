package hello;

import java.util.Scanner;

class Employee{
	String name;
	int code;
	int worktime;
	
	public Employee() {
		
	}
	
	public Employee(      String name, int code, int worktime) {
		this.name=name;
		this.code=code;
		this.worktime=worktime;
	}
}

public class Ex2_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee[] emp_arr = new Employee[3]; 
		
		for (int i = 0; i < 3; i++) {
            System.out.printf("직원 %d 정보 입력 (이름, 코드, 근무시간): ", i + 1);
            emp_arr[i] = new Employee(  sc.next(), sc.nextInt(), sc.nextInt());
        }

        System.out.println("\n--- 직원 정보 출력 ---");
        for (Employee emp : emp_arr) {
        	switch(emp.code) {
        		case 1:
                	System.out.printf("이름: %s, 코드: %d, 근무시간: %d시간, 임금 : %d\n", emp.name, emp.code, emp.worktime, emp.worktime*2000);
                	break;
        		case 2:
                    System.out.printf("이름: %s, 코드: %d, 근무시간: %d시간, 임금 : %d\n", emp.name, emp.code, emp.worktime, emp.worktime*2500);
                    break;
        		case 3:
        			System.out.printf("이름: %s, 코드: %d, 근무시간: %d시간, 임금 : %d\n", emp.name, emp.code, emp.worktime, emp.worktime*3000);
        			break;
        		case 4:
        			System.out.printf("이름: %s, 코드: %d, 근무시간: %d시간, 임금 : %d\n", emp.name, emp.code, emp.worktime, emp.worktime*4000);
        			break;
        	}
        }
        sc.close();
	}
}
