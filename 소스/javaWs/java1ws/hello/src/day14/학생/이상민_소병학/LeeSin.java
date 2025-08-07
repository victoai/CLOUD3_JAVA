package day14.학생.이상민_소병학;

public class LeeSin implements ChampInterface {

    @Override
    public void Q() {
        System.out.println("LeeSin의 Q 스킬: 음파 - 적에게 음파를 발사하여 물리 피해를 입히고, 재사용 시 적에게 돌진할 수 있습니다.");
    }

    @Override
    public void W() {
        System.out.println("LeeSin의 W 스킬: 방호 - 아군에게 돌진하여 보호막을 부여합니다.");
    }

    @Override
    public void E() {
        System.out.println("LeeSin의 E 스킬: 폭풍 - 주변의 모든 적에게 피해를 입히고 적의 이동 속도를 감소시킵니다.");
    }

    @Override
    public void R() {
        System.out.println("LeeSin의 R 스킬: 용의 분노 - 강력한 발차기로 적을 밀쳐내며, 밀려난 적이 다른 적과 충돌 시 추가 피해를 입힙니다.");
    }

    @Override
    public void D() {
        System.out.println("LeeSin의 D 스킬: 점멸 - 짧은 거리를 순간이동합니다.");
    }

    @Override
    public void F() {
        System.out.println("LeeSin의 F 스킬: 점멸 - 짧은 거리를 순간이동합니다.");
    }
}
