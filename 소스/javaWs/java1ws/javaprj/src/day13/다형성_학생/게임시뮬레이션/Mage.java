package day13.다형성_학생.게임시뮬레이션;

public class Mage extends Character {

	public Mage(String name) {
		super(name, 30, 20, 5, 120); 
	}

	@Override
	public void levelUp() {
		super.levelUp();
		this.max_hp += level * 4;
	}
}
