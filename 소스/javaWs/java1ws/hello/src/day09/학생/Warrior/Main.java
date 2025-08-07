package day09.학생.Warrior;

public class Main {
	public static void main(String[] args) {
		Worrior worrior = new Worrior(150, 30, 10, 1);
		Monster monster = new Monster(100, 20, 5, 1);

		worrior.showStatus();
		monster.showStatus();

		worrior.levelUp();

		worrior.attack(monster);
		monster.counterAttack(worrior);

		worrior.defend();
		monster.counterAttack(worrior);

		worrior.skill(monster);

		monster.counterAttack(worrior);

		worrior.attack(monster);

		Monster monster2 = new Monster(200, 25, 10, 2);

		monster2.showStatus();
	}
}