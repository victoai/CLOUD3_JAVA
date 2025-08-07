package day12.게임시뮬레이션;

public class Warrior extends Character {

	public Warrior(String name) {
		super(name, 50, 30, 3, 200); 
	}

	@Override
	public void levelUp() {
		super.levelUp();
		this.max_hp += level * 10; 
	}
}
