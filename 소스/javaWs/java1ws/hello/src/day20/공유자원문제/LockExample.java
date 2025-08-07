package day20.공유자원문제;

 
class SharedResource {
    private boolean isLocked = false;  // 락 상태

    public synchronized void accessResource(String threadName) {
        while (isLocked) {  // 다른 스레드가 이미 락을 가지고 있다면 대기
            try {
                System.out.println(threadName + " 대기 중... (LOCKED)");
                wait();  // 락을 얻을 수 있을 때까지 기다림
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // 락 획득
        isLocked = true;
        System.out.println(threadName + " ▶ 락 획득 (사용 중)");

        try {
            Thread.sleep(2000);  // 공유 자원 사용 (예제용)
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // 락 반납
            isLocked = false;
            System.out.println(threadName + " ◀ 락 반납 (사용 완료)");
            notifyAll();  // 대기 중인 다른 스레드들에게 락이 해제되었음을 알림
        }
    }
}

class WorkerThread extends Thread {
    private SharedResource resource;

    public WorkerThread(String name, SharedResource resource) {
        super(name);
        this.resource = resource;
    }

    @Override
    public void run() {
        resource.accessResource(getName());
    }
}

public class LockExample {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        // 3개의 스레드가 동일한 공유 객체에 접근
        Thread t1 = new WorkerThread("스레드-1", sharedResource);
        Thread t2 = new WorkerThread("스레드-2", sharedResource);
        Thread t3 = new WorkerThread("스레드-3", sharedResource);

        t1.start();
        t2.start();
        t3.start();
    }
}
