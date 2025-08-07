package day20.join;

class SumThread1 extends Thread {
    private int sum = 0;

    @Override
    public void run() {
        for (int i = 1; i <= 50; i++) {
            sum += i;
        }
    }

    public int getSum() {
        return sum;
    }
}

class SumThread2 extends Thread {
    private int sum = 0;

    @Override
    public void run() {
        for (int i = 51; i <= 100; i++) {
            sum += i;
        }
    }

    public int getSum() {
        return sum;
    }
}

public class MultiThreadSum {
    public static void main(String[] args) {
        // 두 스레드 생성
        SumThread1 thread1 = new SumThread1();
        SumThread2 thread2 = new SumThread2();

        // 스레드 시작
        thread1.start();
        thread2.start();

        try {
            // 두 스레드가 끝날 때까지 대기
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 결과 출력
        int totalSum = thread1.getSum() + thread2.getSum();
        System.out.println("1부터 100까지의 합: " + totalSum);
    }
}
