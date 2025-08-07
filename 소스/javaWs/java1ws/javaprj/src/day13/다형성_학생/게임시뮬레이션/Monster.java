package day13.다형성_학생.게임시뮬레이션;

public class Monster {
	String name;
	int hp;
	int attackPower;
	int expGain;

	public Monster(String name, int hp, int attackPower, int expGain) {
		this.name = name;
		this.hp = hp;
		this.attackPower = attackPower;
		this.expGain = expGain;
	}
}
