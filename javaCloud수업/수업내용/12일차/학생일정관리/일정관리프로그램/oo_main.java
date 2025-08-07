package javaprj;

import java.util.Scanner;

/*
일정 관리 프로그램
일정, 날짜, 참석자를 입력받고 일정 완료 여부를 출력함
*/

public class oo_main {

    private static String title;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        oo[] list = new oo[5];
        int index = 0;
        System.out.println("안녕하세요? 일정관리 프로그램입니다. 원하는 번호를 선택해주세요!");

        loop: while (true) {
            System.out.println("1.일정 등록  2.일정 조회  3.일정 삭제  4.프로그램 종료");
            int num = sc.nextInt();
            if (index == list.length) {
                System.out.println("일정이 꽉 차 더 이상 추가할 수 없습니다.");
                System.out.println("일정 삭제로 넘어가겠습니다.");
                num=3;
            }

            switch (num) {
                case 1:  //1.일정 등록
                    while (true) { 
                        System.out.println("등록할 일정이 있으신가요? Y/N ");
                        String YorN = sc.next();
                        if (YorN.equals("Y") || YorN.equals("y")) {
                            System.out.println("무엇을 하실건가요? :");
                            String sch = sc.next();
                            sc.nextLine(); // 버퍼에 남은 \n 정리하는 코드
                            System.out.println("일정의 날짜는 언제인가요? : ");
                            String when = sc.nextLine();  
                            System.out.println("누구와 함께 하시나요? : ");
                            String who = sc.nextLine();

                            oo o = new oo(sch, when, who);
                            list[index] = o;
                            index++;
                            
                            System.out.println(index + "번째 일정을 등록했습니다!\n");

                            
                            break; 
                        } else if (YorN.equals("N") || YorN.equals("n")) {
                        	if(index!=0){
                        		System.out.println("지금까지 등록하신 일정을 알려드릴게요!\n");
                        	}
                            
                            for (int i = 0; i < index; i++) {
                                System.out.println(list[i].toString()+"\n");
                            }
                            System.out.println("일정관리 프로그램을 종료합니다.");
                            break loop; // 프로그램 종료
                        } else {
                            System.out.println("잘못 입력하셨습니다. Y 또는 N을 입력해주세요!");
                            continue;
                        }
                    }
                    break;

                case 2: //2.일정 조회
                    for (int i = 0; i < index; i++) {
                    	System.out.println("========"+(i+1)+"번째 일정========");
                        System.out.println(list[i].toString());
                        System.out.println("========================");
                    }
                    System.out.println("일정 완료 여부를 수정하시겠습니까? Y/N");
                    String YorN1 = sc.next();
                    if(YorN1.equals("Y") || YorN1.equals("y")) {
                    	System.out.println("완료한 일정 번호를 입력해주세요.");
                        int choice = sc.nextInt();
                        if(choice>=1 && choice<=index) {	//선택한 범위 내에 있는지 확인
                        	list[choice-1].setResult(true);
                        	System.out.println(choice+"번째 일정이 완료로 처리되었습니다.");
                        	System.out.println(list[choice - 1].toString1());
                        }else {
                        	System.out.println("잘못된 번호를 입력하셨습니다.");
                        	break;
                        }
                        break; 
                    }else if (YorN1.equals("N") || YorN1.equals("n")) {
                    	
                    }else{
                    	System.out.println("잘못된 번호를 선택하셨습니다.");
                    }
                    break;

                case 3:  //3.일정 삭제
                	while(true) {
                		System.out.println("삭제할 일정 번호를 입력하세요.");
                		int num3 = sc.nextInt();
                    
                		if (num3 < 1 || num3 > index) {
                			System.out.println("잘못된 번호를 입력하셨습니다.");
                		}else {
                			for (int i = num3 - 1; i < index - 1; i++) {
                				list[i] = list[i + 1]; 
                			}
                        
                			list[index - 1] = null;
                			index--;
                			System.out.println(num3+"번째 일정이 삭제되었습니다.");
                			break;
                		}
                	}
                    
                    break;

                case 4:  //4.프로그램 종료
                    System.out.println("잘가~");
                    System.out.println("일정관리 프로그램을 종료합니다.");
                    break loop;

                default:
                    System.out.println("잘못된 번호를 선택하셨습니다. 다시 선택해주세요!");
                    break;
            }
        }

    }

}
