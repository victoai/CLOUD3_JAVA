package day19;

import java.util.concurrent.*;

public class AutoLogoutTask {
    private static final int TIMEOUT = 10; // 10초 후 로그아웃

    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        
        System.out.println("사용자가 로그인했습니다.");
        
        executor.submit(() -> {
            try {
                Thread.sleep(TIMEOUT * 1000);
                System.out.println("시간 초과! 자동 로그아웃됩니다.");
            } catch (InterruptedException e) {
                System.out.println("로그아웃 타이머가 중단되었습니다.");
            }
        });

        // 실제 프로그램에서는 사용자의 입력을 받으면서 타이머를 초기화해야 함
    }
}

