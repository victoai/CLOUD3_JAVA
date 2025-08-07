package day14.학생.이상민_소병학;

public class Ahri implements ChampInterface {

    @Override
    public void Q() {
        System.out.println("Ahri의 Q 스킬: 현혹의 구슬 - 구슬을 던져 적을 맞추고 되돌아오며, 마법 피해를 입힙니다.");
    }

    @Override
    public void W() {
        System.out.println("Ahri의 W 스킬: 여우불 - 세 개의 여우불이 근처의 적을 추적해 마법 피해를 입힙니다.");
    }

    @Override
    public void E() {
        System.out.println("Ahri의 E 스킬: 매혹 - 적을 매혹하여 일정 시간 동안 Ahri를 향해 다가오게 만듭니다.");
    }

    @Override
    public void R() {
        System.out.println("Ahri의 R 스킬: 혼령 질주 - 짧은 거리로 세 번 순간이동하며 적에게 마법 피해를 입힙니다.");
    }

    @Override
    public void D() {
        System.out.println("Ahri의 D 스킬: 점멸 - 짧은 거리를 순간이동합니다.");
    }

    @Override
    public void F() {
        System.out.println("Ahri의 F 스킬: 점멸 - 짧은 거리를 순간이동합니다.");
    }
}
