package day19;

import java.util.Timer;
import java.util.TimerTask;
import java.util.Scanner;

public class 타이머체크하기 {

    // 타이머가 끝날 때 실행되는 작업을 정의한 TimerTask
    static class TimeUpTask extends TimerTask {
        @Override
        public void run() {
            System.out.println("시간 종료!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        Timer timer = new Timer();
        TimerTask timeUpTask = new TimeUpTask();
        
        // 메뉴 반복문
        while (!exit) {
            // 타이머 시작 (예: 10초 카운트)
            if (timer != null) {
                timer.cancel();  // 이전 타이머가 아직 실행 중이면 취소
            }
            timer = new Timer();
            timer.schedule(timeUpTask, 10000); // 10초 후 실행

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
            
         
            try {
                // 타이머가 끝나기 전까지 기다림
                Thread.sleep(10000);
                // 타이머 종료 후 첫 번째 메뉴로 돌아가기
                System.out.println("시간이 초과되어 첫 번째 메뉴로 돌아갑니다.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
             
        }

        scanner.close();
        timer.cancel(); // 프로그램 종료 시 타이머도 종료
    }
}
