package 스레드;

class DataBox {
    private String data;
    
    public synchronized void produce(String data) {
        while (this.data != null) { // 데이터가 있으면 기다림
            try {
              wait(); // 소비자가 소비할 때까지 대기
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.data = data;
        System.out.println("생산됨: " + data);
        notify(); // 대기 중인 소비자 깨움
    }

    public synchronized String consume() {
        while (this.data == null) { // 데이터가 없으면 기다림
            try {
                wait(); // 생산자가 데이터 넣을 때까지 대기
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        String consumedData = this.data;
        this.data = null;
        System.out.println("소비됨: " + consumedData);
        notify(); // 대기 중인 생산자 깨움
        return consumedData;
    }
}

public class A {
    public static void main(String[] args) {
        DataBox dataBox = new DataBox();

        // 생산자 스레드
        Thread producer = new Thread(() -> {
            String[] items = {"Item1", "Item2", "Item3"};
            for (String item : items) {
                dataBox.produce(item);
                try {
                    Thread.sleep(1000); // 생산 속도 조절
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // 소비자 스레드
        Thread consumer = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                dataBox.consume();
                try {
                    Thread.sleep(1500); // 소비 속도 조절
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        producer.start();
        consumer.start();
    }
}
