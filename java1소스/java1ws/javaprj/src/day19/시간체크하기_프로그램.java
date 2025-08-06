package day19;

import java.util.Scanner;
/*
  class TimerThread extends Thread {
	  
    private int countdownTime;
    private boolean isTimeUp = false;

    public TimerThread(int countdownTime) {
        this.countdownTime = countdownTime;
    }

    @Override
    public void run() {
        try {
            for (int i = countdownTime; i > 0; i--) {
                //System.out.println("남은 시간: " + i + "초");
                Thread.sleep(1000); // 1초마다 카운트 다운
            }
            
            isTimeUp = true;
            
            System.out.println("시간 종료!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public boolean isTimeUp() {
        return isTimeUp;
    }
}
*/
public class 시간체크하기_프로그램 {

 
	
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TimerThread timerThread = null;
        boolean exit = false;

        // 메뉴 반복문
        while (!exit) {
            // 타이머 시작 (예: 10초 카운트)
            if (timerThread == null || !timerThread.isAlive()) {
                timerThread = new TimerThread(10);
                timerThread.start();
            }

            System.out.println("1. 메뉴 1");
            System.out.println("2. 메뉴 2");
            System.out.println("3. 종료");
            System.out.print("메뉴를 선택하세요: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("메뉴 1을 선택하셨습니다.");
                    break;
                case 2:
                    System.out.println("메뉴 2를 선택하셨습니다.");
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    exit = true;
                    break;
                default:
                    System.out.println("잘못된 선택입니다.");
                    break;
            }

            // 시간이 끝났다면 첫 번째 메뉴로 돌아가기
            if (timerThread.isTimeUp()) {
                System.out.println("시간이 초과되어 첫 번째 메뉴로 돌아갑니다.");
                timerThread = new TimerThread(10); // 타이머 재시작
                timerThread.start();
            }
        }

        scanner.close();
    }
}
