package 스레드;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class DataBox2 {
    private String data;
    private final Lock lock = new ReentrantLock();
    private final Condition hasData = lock.newCondition(); // 데이터가 있을 때 알림 , 소비자
    private final Condition noData = lock.newCondition();  // 데이터가 없을 때 알림  , 생산자

    public void produce(String data) {
        lock.lock();
        try {
            while (this.data != null) { // 데이터가 이미 있으면 대기
                noData.await();//생산자 기다리기 
            }
            this.data = data;
            System.out.println("생산됨: " + data);
            hasData.signal(); // 소비자 깨우기
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public String consume() {
        lock.lock();
        try {
            while (this.data == null) { // 데이터가 없으면 대기
                hasData.await();  //소비자가 대기
            }
            String consumedData = this.data;
            this.data = null;
            System.out.println("소비됨: " + consumedData);
            noData.signal(); // 생산자 깨우기
            return consumedData;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return null;
        } finally {
            lock.unlock();
        }
    }
}

public class ReentrantLockExample {
    public static void main(String[] args) {
        DataBox2 dataBox = new DataBox2();

        Thread producer = new Thread(() -> {
            String[] items = {"Item1", "Item2", "Item3"};
            for (String item : items) {
                dataBox.produce(item);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread consumer = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        producer.start();
        consumer.start();
    }
}
