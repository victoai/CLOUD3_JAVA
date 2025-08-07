package day19.타이머2;

import java.util.Scanner;



//별도의 흐름으로  타이머 동작 !!! 

class 타이머쓰레드 extends Thread {
	
    private int time;
    private boolean 시간끝남 = false;
 
    public 타이머쓰레드(int countdownTime) {
        this.time = countdownTime;
    }

    @Override
    public void run() {
        try {
            for (int i = time; i > 0; i--) {
                Thread.sleep(1000); // 1초마다 카운트 다운
            }
            시간끝남 = true;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public boolean 시간끝났니() {
        return 시간끝남;
    }
}



//
public class 타이머체크하기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
         

        System.out.println("프로그램이 시작됩니다."); 
        while(true) {
        	
        	
        	System.out.println("  로그인하세요  !! ");
        	String menu= scanner.next();
        	
        	
        	 //타이머동작!! 
        	
            타이머쓰레드 timerThread = new 타이머쓰레드(10);
            timerThread.start();
        	
            
            
        	outerloop: while (true) { 
        		
             	// 타이머 체크 
                 if (timerThread.시간끝났니()) {  
                	 System.out.println("시간이 종료");
                     break  outerloop;
                 }
 
                 System.out.println("1. 상위 메뉴");
                 System.out.println("2. 종료");
                 System.out.print("메뉴를 선택하세요: ");
                 int choice = scanner.nextInt();

                 
                 switch (choice) {
                     case 1: 
                        subloop : while (true) {
                             if (timerThread.시간끝났니()) { 
                            	 System.out.println("시간이 종료");
                                 break outerloop;
                             }

                             System.out.println("1. 하위 메뉴 1");
                             System.out.println("2. 하위 메뉴 2");
                             System.out.println("3. 상위 메뉴로 돌아가기");
                             System.out.print("하위 메뉴를 선택하세요: ");                             
                             int subChoice = scanner.nextInt();

                             
                             
                             switch (subChoice) {
                                 case 1:
                                     // 서브 메뉴 1
                                     System.out.println("하위 메뉴 1을 선택하셨습니다.");
                                     break;
                                 case 2:
                                     // 서브 메뉴 2
                                     System.out.println("하위 메뉴 2를 선택하셨습니다.");
                                     break;
                                 case 3:
                                      break subloop;
                                    
                                 default:
                                     System.out.println("잘못된 선택입니다.");
                                     break;
                             }
                         }
                         break;

                     case 2:
                         System.out.println("프로그램을 종료합니다.");                 
                         break outerloop ;

                     default:
                         System.out.println("잘못된 선택입니다.");
                         break;
                 }
             }

            
        	 
        	 /*
             
             try {
                 timerThread.join(); // 타이머 스레드 종료 대기
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
             */
            

        }
      
      
    }
}
