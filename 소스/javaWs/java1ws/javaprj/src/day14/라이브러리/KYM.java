package day14.라이브러리;

public class KYM implements MyRun {

    @Override
    public void run() {
        System.out.println("탑쌓기");

        for (int i = 1; i <= 40; i++) {
           
            for (int j = 1; j <= i; j++) {
                System.out.print("*");  
            }
            System.out.println();
        }
    }
}
