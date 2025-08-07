package day14.학생.이상민_소병학;

public class Lux implements ChampInterface {

    @Override
    public void Q() {
        System.out.println("Lux의 Q 스킬: 빛의 속박 - 적 둘을 속박하는 빛의 구체를 발사합니다.");
    }

    @Override
    public void W() {
        System.out.println("Lux의 W 스킬: 프리즘 보호막 - 아군에게 보호막을 부여하는 지팡이를 던집니다.");
    }

    @Override
    public void E() {
        System.out.println("Lux의 E 스킬: 광휘의 특이점 - 목표 지점에 폭발하는 광휘의 구체를 생성합니다.");
    }

    @Override
    public void R() {
        System.out.println("Lux의 R 스킬: 무한의 광선 - 광선을 발사하여 경로 상의 모든 적에게 큰 마법 피해를 입힙니다.");
    }

    @Override
    public void D() {
        System.out.println("Lux의 D 스킬: 점멸 - 짧은 거리를 순간이동합니다.");
    }

    @Override
    public void F() {
        System.out.println("Lux의 F 스킬: 점멸 - 짧은 거리를 순간이동합니다.");
    }
}
