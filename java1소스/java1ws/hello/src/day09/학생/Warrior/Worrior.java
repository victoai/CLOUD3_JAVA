package day09.학생.Warrior;

class Worrior {
	private int hp;
	private int attackDamage;
	private int defense;
	private int level;
	private boolean isDefending;

	Worrior(int hp, int attackDamage, int defense, int level) {
		this.hp = hp;
		this.attackDamage = attackDamage;
		this.defense = defense;
		this.level = level;
		this.isDefending = false;
	}

	public void attack(Monster monster) {
		int damage = attackDamage - monster.getDefense();
		if (damage < 0)
			damage = 0;
		monster.takeDamage(damage);
		System.out.println("전사의 공격 (공격력: " + attackDamage + ")!!");
		System.out.println("몬스터 방어력: " + monster.getDefense());
		System.out.println("최종 데미지: " + damage);
		System.out.println("남은 몬스터 체력: " + monster.getHp());
		System.out.println();
		if (monster.getHp() < 0) {
			System.out.println("몬스터 토벌 성공!");
		}
	}

	public void skill(Monster monster) {
		int damage = (attackDamage * 2) - monster.getDefense();
		if (damage < 0)
			damage = 0;
		monster.takeDamage(damage);
		System.out.println("전사의 스킬 공격 (공격력: " + attackDamage * 2 + ")!!");
		System.out.println("몬스터 방어력: " + monster.getDefense());
		System.out.println("최종 데미지: " + damage);
		System.out.println("남은 몬스터 체력: " + monster.getHp());
		System.out.println();
	}

	public void defend() {
		this.isDefending = true;
		System.out.println("전사가 방어 자세를 취합니다. 방어력 " + defense + "만큼 데미지 감소!");
		System.out.println();
	}

	public void takeDamage(int damage) {
		if (isDefending) {
			damage -= defense;
			if (damage < 0)
				damage = 0;
			isDefending = false;
		}
		hp -= damage;
		System.out.println("전사가 공격을 받습니다! " + "-" + damage + " 전사의 남은 체력: " + hp);
		System.out.println();
	}

	public void levelUp() {
		System.out.println("전사 레벨업 공격력,방어력 +1");
		attackDamage++;
		defense++;
		level++;
		showStatus();
	}

	public int getHp() {
		return hp;
	}

	public void showStatus() {
		System.out.println(
				"전사의 현재 상태: 체력 = " + hp + ", 공격력 = " + attackDamage + ", 방어력 = " + defense + ", 레벨 = " + level);
		System.out.println();
	}

	public int getLevel() {
		return level;
	}

	public void showHp() {
		System.out.println("전사의 남은 체력: " + hp);
	}
}

class Monster {
	private int hp;
	private int defense;
	private int attack;
	private int level;

	Monster(int hp, int attack, int defense, int level) {
		this.hp = hp;
		this.defense = defense;
		this.attack = attack;
		this.level = level;
	}

	public void counterAttack(Worrior worrior) {
		worrior.takeDamage(attack);

		System.out.println();
	}

	public void takeDamage(int damage) {
		hp -= damage;
	}

	public int getHp() {
		return hp;
	}

	public int getAttack() {
		return attack;
	}

	public int getDefense() {
		return defense;
	}

	public void showStatus() {
		System.out.println("몬스터 출현!");
		System.out.println("몬스터 현재 상태: 체력 = " + hp + ", 공격력 = " + attack + ", 방어력 = " + defense + ", 레벨 = " + level);
		System.out.println();

	}

	public int getLevel() {
		return level;
	}
}
