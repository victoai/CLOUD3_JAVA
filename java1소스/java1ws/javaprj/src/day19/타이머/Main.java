package day19.타이머;

import java.util.Scanner;

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

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TimerThread timerThread = new TimerThread(10);
        boolean exit = false;

        // 타이머 시작 (예: 10초 카운트)
        timerThread.start();

        
        System.out.println("프로그램이 시작합니다");
        
        
        loop:while (!exit) {
            System.out.println("1. 상위 메뉴");
            System.out.println("2. 종료");
            System.out.print("메뉴를 선택하세요: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // 하위 메뉴 반복문
                    boolean subMenuExit = false;
                    while (!subMenuExit) {
                        // 타이머가 종료되면 자동으로 상위 메뉴로 돌아가기
                        if (timerThread.isTimeUp()) {
                            System.out.println("시간 초과! 상위 메뉴로 돌아갑니다.");
                            subMenuExit = true;
                            break loop;
                            //timerThread = new TimerThread(10); // 타이머 재시작
                           // timerThread.start();
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
                                boolean subSubMenuExit1 = false;
                                while (!subSubMenuExit1) {
                                    System.out.println("1. 서브 메뉴 1.1");
                                    System.out.println("2. 서브 메뉴 1.2");
                                    System.out.println("3. 상위 메뉴로 돌아가기");
                                    System.out.print("서브 메뉴 1을 선택하세요: ");
                                    int subSubChoice = scanner.nextInt();
                                    switch (subSubChoice) {
                                        case 1:
                                            System.out.println("서브 메뉴 1.1을 선택하셨습니다.");
                                            break;
                                        case 2:
                                            System.out.println("서브 메뉴 1.2를 선택하셨습니다.");
                                            break;
                                        case 3:
                                            subSubMenuExit1 = true;
                                            break;
                                        default:
                                            System.out.println("잘못된 선택입니다.");
                                            break;
                                    }
                                    // 시간이 초과되면 상위 메뉴로 돌아가기
                                    if (timerThread.isTimeUp()) {
                                        System.out.println("시간 초과! 상위 메뉴로 돌아갑니다.");
                                        subSubMenuExit1 = true;
                                        //timerThread = new TimerThread(10); // 타이머 재시작
                                        //timerThread.start();
                                        break loop;
                                    }
                                }
                                break;
                            case 2:
                                // 서브 메뉴 2
                                System.out.println("하위 메뉴 2를 선택하셨습니다.");
                                boolean subSubMenuExit2 = false;
                                while (!subSubMenuExit2) {
                                    System.out.println("1. 서브 메뉴 2.1");
                                    System.out.println("2. 서브 메뉴 2.2");
                                    System.out.println("3. 상위 메뉴로 돌아가기");
                                    System.out.print("서브 메뉴 2를 선택하세요: ");
                                    int subSubChoice = scanner.nextInt();
                                    switch (subSubChoice) {
                                        case 1:
                                            System.out.println("서브 메뉴 2.1을 선택하셨습니다.");
                                            break;
                                        case 2:
                                            System.out.println("서브 메뉴 2.2를 선택하셨습니다.");
                                            break;
                                        case 3:
                                            subSubMenuExit2 = true;
                                            break;
                                        default:
                                            System.out.println("잘못된 선택입니다.");
                                            break;
                                    }
                                    // 시간이 초과되면 상위 메뉴로 돌아가기
                                    if (timerThread.isTimeUp()) {
                                        System.out.println("시간 초과! 상위 메뉴로 돌아갑니다.");
                                        subSubMenuExit2 = true;
                                        //timerThread = new TimerThread(10); // 타이머 재시작
                                       // timerThread.start();
                                        break loop;
                                    }
                                }
                                break;
                            case 3:
                                System.out.println("상위 메뉴로 돌아갑니다.");
                                subMenuExit = true;
                                break;
                            default:
                                System.out.println("잘못된 선택입니다.");
                                break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("프로그램을 종료합니다.");
                    exit = true;
                    break;
                default:
                    System.out.println("잘못된 선택입니다.");
                    break;
            }

            // 시간이 초과되면 상위 메뉴로 돌아가기
            if (timerThread.isTimeUp()) {
                System.out.println("시간 초과! 상위 메뉴로 돌아갑니다.");
                //timerThread = new TimerThread(10); // 타이머 재시작
               // timerThread.start();
                break loop;
            }
        }

        scanner.close();
        
        try {
			timerThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("프로그램이 종료합니다");
    }
}
