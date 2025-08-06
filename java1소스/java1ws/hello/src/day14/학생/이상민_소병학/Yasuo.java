package day14.학생.이상민_소병학;

public class Yasuo implements ChampInterface {

    @Override
    public void Q() {
        System.out.println("Yasuo의 Q 스킬: 강철의 폭풍 - 직선상의 적들을 베어 큰 피해를 입힙니다.");
    }

    @Override
    public void W() {
        System.out.println("Yasuo의 W 스킬: 바람 장막 - 앞으로의 모든 투사체를 막아주는 방벽을 생성합니다.");
    }

    @Override
    public void E() {
        System.out.println("Yasuo의 E 스킬: 질풍검 - 적을 관통하며 빠르게 이동합니다.");
    }

    @Override
    public void R() {
        System.out.println("Yasuo의 R 스킬: 최후의 숨결 - 공중에 떠오른 모든 적을 향해 순간 이동하여 강력한 피해를 입힙니다.");
    }

    @Override
    public void D() {
        System.out.println("Yasuo의 D 스킬: 점멸 - 짧은 거리를 순간이동합니다.");
    }

    @Override
    public void F() {
        System.out.println("Yasuo의 F 스킬: 점멸 - 짧은 거리를 순간이동합니다.");
    }
}
