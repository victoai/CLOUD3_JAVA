package day06.학생;

import java.util.Scanner;

public class 문제_화폐매수구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//권액정보
		final int[] arrMoney = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
		int[] arrMoneyCnt = new int[8];
		//직원정보
		String[] arrWorkerName = null;
		int[] arrWorkerPay = null;
		int iWorkerCnt = 0;
		int iInput;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("--company---------------------------------");
			System.out.println("1.사원등록 2.출장비등록 3.출장비목록 4.종료");
			System.out.println("------------------------------------------");
			System.out.print("입력> ");
			
			iInput = sc.nextInt();
//			sc.close();
//			if(sc.nextInt() == String)
			
			switch(iInput) {
			
				case 1:
					//메뉴
					System.out.print("사원이름 입력> ");
					//정보등록
					sc.nextLine();
					String strInput = sc.nextLine();
					iWorkerCnt++;
//					sc.close();
					
					//기존배열 백업 > 신규배열 등록
					int[] arrWorkerPayOld = new int[iWorkerCnt-1];
					String[] arrWorkerNameOld = new String[iWorkerCnt-1];
					
					//백업
					for(int i=0; i<arrWorkerNameOld.length; i++) {
						arrWorkerPayOld[i] = arrWorkerPay[i];
						arrWorkerNameOld[i] = arrWorkerName[i];
					}
					//신규배열
					arrWorkerPay = new int[iWorkerCnt];
					arrWorkerName = new String[iWorkerCnt];
					
					for(int i=0; i<arrWorkerNameOld.length; i++) {
						arrWorkerPay[i] = arrWorkerPayOld[i];
						arrWorkerName[i] = arrWorkerNameOld[i];
					}
					
					arrWorkerPay[iWorkerCnt-1] = 0;
					arrWorkerName[iWorkerCnt-1] = strInput;
					
					for(int i=0; i<iWorkerCnt; i++) {
						System.out.println(arrWorkerName[i]);
					}
					System.out.println();
					break;
					
				case 2:
					System.out.println("2");
					
					int index;
					for(int i=0; i<iWorkerCnt; i++) {
						index = i+1;
						System.out.println("(" + index + ") " + arrWorkerName[i] + ": " + arrWorkerPay[i] + "원(출장)");
					}
					System.out.print("출장비를 적용 할 사원번호 입력> ");
					int iInputIndex = sc.nextInt();
					
					if(iInputIndex > iWorkerCnt) {
						System.out.println("사원범위를 초과합니다. 다시 입력해주세요. 입력> ");
						iInputIndex = sc.nextInt();
					}
					System.out.print("출장금액 입력> ");
					int iInputPay = sc.nextInt();
//					sc.close();
					
					arrWorkerPay[iInputIndex-1] = iInputPay;
					
					//권액별 매수 계산
					// arrMoney = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 }
					// arrMoneyCnt = new int[8];
					int iTotalMoney = arrWorkerPay[iInputIndex-1];
					int iBalanceMoney = iTotalMoney;
					
					for(int i=0; i<arrMoney.length; i++) {
						if(iBalanceMoney >= arrMoney[i]) {
							int iCnt = iBalanceMoney / arrMoney[i];
							iBalanceMoney = iBalanceMoney % arrMoney[i];
							arrMoneyCnt[i] = iCnt;
							
							if(iBalanceMoney < 10) {		// 1원단위 절삭
								arrWorkerPay[iInputIndex-1] -= iBalanceMoney;
							}
						}
					}
					
					//결과출력
					for(int i=0; i<arrMoneyCnt.length; i++) {
						System.out.print(arrMoney[i] + "원: " + arrMoneyCnt[i] + "개 /");
					}
					System.out.println();
					System.out.println("--$$-------");
					System.out.println(arrWorkerName[iInputIndex-1]+"님의 출장비 "+ arrWorkerPay[iInputIndex-1] +"원을 적용하였습니다.");
					System.out.println();
					break;
					
				case 3:
					System.out.println();
					System.out.println("<출장비 리스트>");
					index = 0;
					for(int i=0; i<iWorkerCnt; i++) {
						index = i+1;
						System.out.println("(" + index + ") " + arrWorkerName[i] + ": " + arrWorkerPay[i] + "원(출장)");
					}
					
					System.out.println();
					break;
					
				case 4:
					System.out.println("4");
					System.out.println();
					System.out.println("- END -");
					System.exit(0);	// 콘솔 종
					break;
			};
		
		}
		
	}

}
