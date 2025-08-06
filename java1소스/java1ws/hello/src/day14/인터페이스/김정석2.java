package day14.인터페이스;
 

public class 김정석2 implements 나는게가능한, 변신가능한 {
    // field
    private boolean stateFly = false;

    // method
    @Override
    public void 변신하기() {
        System.out.println("날개달음");
        setFly(true);  // 현재 객체의 stateFly 값을 변경
    }

    @Override
    public void 날수있다() {
        if (getFly()) {
            System.out.println("김정석 : 하늘을 난다");
        } else {
            System.out.println("김정석 : 하늘을 못난다");
        }
    }

    // getter, setter
    public boolean getFly() {
        return stateFly;
    }

    public void setFly(boolean state) {
        this.stateFly = state;
    }

    // test
    public static void main(String[] args) {
        김정석 a = new 김정석();
        a.날수있다();  // 변신 전 상태 출력

        a.변신하기();  // 변신하기 호출 -> stateFly 변경
        a.날수있다();  // 변신 후 상태 출력
    }
}
