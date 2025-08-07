package day13.학생.김세중;

public abstract class Weapon {
	private int atk;
	private int range;
	private int atkSpeed;
	private String weaponName;

	public Weapon(String weaponName, int atk, int range, int atkSpeed) {
		this.weaponName = weaponName;
		this.atk = atk;
		this.range = range;
		this.atkSpeed = atkSpeed;
	}

	public abstract void attack();

	public int getATK() {
		return atk;
	}

	public int getRange() {
		return range;
	}

	public int getAtkSpeed() {
		return atkSpeed;
	}

	public String getWeaponName() {
		return weaponName;
	}

}

class Sword extends Weapon {
	public Sword() {
		super("검", 10, 3, 8);
	}

	@Override
	public void attack() {
		System.out.println("검으로 공격합니다!");
	}

	public int SwordSkill() {
		System.out.println("검 스킬 '스트라이크' 사용");
		return getATK() * 2;
	}

}

class Bow extends Weapon {
	public Bow() {
		super("활", 15, 10, 2);
	}

	@Override
	public void attack() {
		System.out.println("활로 공격합니다!");
	}

	public int BowSkill() {
		System.out.println("활 스킬 '연사' 사용");
		return getATK() * 3;
	}

}

class Axe extends Weapon {
	public Axe() {
		super("도끼", 20, 2, 1);
	}

	@Override
	public void attack() {
		System.out.println("도끼로 강력하게 내려칩니다!");
	}

	public int AxeSkill() {
		System.out.println("도끼 스킬 '벌목' 사용");
		return getATK() * 4;
	}

}
