package day14.학생.이상민_소병학;

public class Vayne implements ChampInterface {

    @Override
    public void Q() {
        System.out.println("Vayne의 Q 스킬: 구르기 - 원하는 방향으로 짧게 구르며 다음 기본 공격이 강화됩니다.");
    }

    @Override
    public void W() {
        System.out.println("Vayne의 W 스킬: 선고 - 세 번째 공격마다 추가 피해를 입힙니다.");
    }

    @Override
    public void E() {
        System.out.println("Vayne의 E 스킬: 천둥 소리 - 적을 밀쳐내며, 벽에 부딪히면 기절시킵니다.");
    }

    @Override
    public void R() {
        System.out.println("Vayne의 R 스킬: 궁극기 - 잠시 동안 전투 능력이 크게 향상됩니다.");
    }

    @Override
    public void D() {
        System.out.println("Vayne의 D 스킬: 점멸 - 짧은 거리를 순간이동합니다.");
    }

    @Override
    public void F() {
        System.out.println("Vayne의 F 스킬: 점멸 - 짧은 거리를 순간이동합니다.");
    }
}