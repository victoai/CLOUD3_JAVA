package day08.학생_구조화된자료형.윤현기;
// 생성자를 필요로 하지 않음
// 필드들이 기본 값을 가짐
// 인스턴스를 인자로 받는 메소드

public class Slime {
    double hp = 50; // 슬라임 체력 지정
    int attack = 8; // 데미지 지정
    double defense = 0.2; //슬라임의 방어수치 지정

    // 공격메소드
    // 다른 슬라임의 인스턴스를 인자로 받음
    void attack (Slime enemy) { //인자로 자료형인 슬라임을 받아온다
        enemy.hp -= attack * (1 - enemy.defense); // 50 - 6.4 = 36.4
    }

    //슬라임의 상태를 출력 해주는 메소드
    void stats(){
        System.out.printf("체력 : %.2f\n 데미지 : %d\n 방어력 : %.2f\n", // %.2f : 소숫점 어디까지 출력할건지 설정
                hp, attack, defense
        );
    }
}
