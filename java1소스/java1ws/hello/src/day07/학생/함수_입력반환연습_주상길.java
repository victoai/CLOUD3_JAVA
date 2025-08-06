package day07.학생;

import java.util.Scanner;

public class 함수_입력반환연습_주상길 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String strResult;
		int iLoopCnt;
		
		System.out.print("프린트 내용 입력> ");
		strResult = sc.nextLine();
		
		System.out.print("반복횟수 입력> ");
		iLoopCnt = sc.nextInt();
		
		
		//함수실행
		String strMemory = InputContext(strResult, iLoopCnt);
		System.out.println("Your Input : " + strMemory);
		
		sc.close();
	}
	static String InputContext (String _strMessage, int _iLoop) {
		
		String strSum = "";
		
		for(int i=0; i<_iLoop; i++) {
			strSum += _strMessage;
		}
		PrintStr(strSum);
		
		return _strMessage;
	}

	
	static void PrintStr (String _input) {
		System.out.println("\n--( Print )---------------");
		System.out.println(_input);
		System.out.println("--------------------------");
	}

	
}




