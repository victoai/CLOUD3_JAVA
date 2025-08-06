package day08;

//생성자가 따로 지정이 돼 있지 않을 떄는 클래스 이름 옆에다가 괄호를 붙혀주면 됨

public class Main {
    public static void main(String[] args) {
        //두 슬라임 객체 생성
        Slime slime1 = new Slime();
        Slime slime2 = new Slime();


        // 슬라임1의 초기 값 출력
        System.out.println("슬라임1의 상태 : ");
        slime1.stats();

        // 슬라임2의 초기 값 출력
        System.out.println("\n슬라임2의 상태 :");
        slime2.stats();

        //슬라임1이 슬라임2 공격
        slime1.attack(slime2);

        //공격 후 슬라임 상태 출력
        System.out.println("\n 슬라임1이 슬라임 2를 공격 한 후 :\n");
        System.out.println("슬라임1");
        slime1.stats();
        System.out.println("\n슬라임2");
        slime2.stats();
    }
}

