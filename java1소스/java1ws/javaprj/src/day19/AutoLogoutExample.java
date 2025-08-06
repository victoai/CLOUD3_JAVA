package day19;

import java.util.Scanner;

public class AutoLogoutExample {
    private static final int TIMEOUT = 10; // 10초 후 로그아웃

    public static void main(String[] args) {
        // 로그인 시
        System.out.println("사용자가 로그인했습니다.");
        
        // 타이머 쓰레드 시작
        Thread timeoutThread = new Thread(new TimeoutTask());
        timeoutThread.start();
        Scanner scanner = new Scanner(System.in);

        // 사용자 입력을 기다리는 부분 (여기서는 단순히 예시로 5초 후 사용자가 작업했다고 가정)
        try {
            Thread.sleep(5000); // 5초 후 사용자가 작업을 한 것으로 간주
            
            
            
          

            while (true) {
                // 메뉴 출력
                System.out.println("===== 메뉴 =====");
                System.out.println("1. 로그인");
                System.out.println("2. 작업 1");
                System.out.println("3. 작업 2");
                System.out.println("4. 종료");
                System.out.print("원하는 작업을 선택하세요 (1-4): ");

                // 사용자 입력 받기
                int choice = scanner.nextInt();

                // 선택된 작업에 따라 처리
                switch (choice) {
                    case 1:
                        System.out.println("로그인");  // 로그인 작업
                        break;
                    case 2:
                    	System.out.println("로그인");  ;  // 작업 1
                        break;
                    case 3:
                    	System.out.println("로그인");   // 작업 2
                        break;
                    case 4:
                        System.out.println("프로그램을 종료합니다.");
                        scanner.close();
                        return;  // 종료
                    default:
                        System.out.println("잘못된 선택입니다. 다시 시도하세요.");
                }
            }
             
        } catch (InterruptedException e) {
            System.out.println("작업 중 오류가 발생했습니다.");
        }
    }

    // 타임아웃을 체크하는 쓰레드
    static class TimeoutTask implements Runnable {
        @Override
        public void run() {
            try {
                // 일정 시간 대기 후 시간 초과 처리
                Thread.sleep(TIMEOUT * 1000);
                System.out.println("시간 초과! 자동 로그아웃됩니다.");
            } catch (InterruptedException e) {
                System.out.println("타이머가 중단되었습니다.");
            }
        }
    }
}
