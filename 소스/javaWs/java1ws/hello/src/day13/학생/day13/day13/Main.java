package day13.학생.day13.day13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		// 입력 형식 차이
		// 속도, 성능, 안정성 -> BufferedReader 가 scanner 보다 우세
		// 입력 유연성 -> Scanner 가 BufferedReader 보다 우세
		
		// 대용량 데이터를 다루는 알고리즘 문제를 풀 때
		// 속도와 성능을 늘리고 싶을때 유용합니다
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
//		// 입력을 받는 부분
//		loop : while (true) {
//			System.out.println("1. 등록 | 2. 조회 | 3. 변경 | 4. 삭제 | 5. 전체조회 | 6. 종료");
//			System.out.println("---------------------");
//			System.out.print(">>> ");
//			int select = Integer.valueOf(bf.readLine());
//			
//			switch (select) {
//			case 1:
//				break;
//			case 2:
//				break;
//			case 0:
//				break loop;
//			}
//		}
		
		System.out.print("아이디 입력 : ");
		String id = bf.readLine();
		System.out.print("이름 입력 : ");
		String name = bf.readLine();
		System.out.print("휴대폰 번호 입력 : ");
		String phoneNum = bf.readLine();
		Acorn me = new 이상민(id, name, phoneNum);
		
		System.out.println();
		
		System.out.println("현재까지의 정보");
		System.out.println("---------------------");
		me.printInfo();
		
		System.out.println("추가정보 입력");
		System.out.println("---------------------");
		System.out.print("이메일 입력 : ");
		String email = bf.readLine();
		
		// instanceof 로 확인해서 맞다면 다운캐스팅을 통해 접근
		if (me instanceof 이상민) {
			((이상민)me).setEmail(email);
		}
		System.out.print("학년 입력 : ");
		String grade = bf.readLine();
		if (me instanceof 이상민) {
			((이상민)me).setGrade(grade);
		}
		
		System.out.println();
		
		System.out.println("모든 정보");
		System.out.println("---------------------");
		me.printInfo();
	}
}
