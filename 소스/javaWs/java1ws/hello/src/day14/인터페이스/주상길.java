package day14.인터페이스;

public class 주상길 implements  많이먹는게가능한, 나는게가능한 {

    public 주상길() {

    }

    @Override
    public void 많이먹다() {
        System.out.println("주상길: 많이먹고~ ♨︎");
    }

    @Override
    public void 날수있다() {
        System.out.println("주상길: 날자~ ✈︎");
    }

}
