package day13.학생.김세중;

public class Warrior {
	private int attackDamage;
	private int defense;
	private int hp;
	private int mp;
	private int range;
	private int ATK_Speed;
	private Weapon equippedWeapon; // 현재 장착된 무기

	Warrior(int attackDamage, int defense, int hp, int mp, int range, int ATK_Speed) {
		this.attackDamage = attackDamage;
		this.defense = defense;
		this.hp = hp;
		this.mp = mp;
		this.range = range;
		this.ATK_Speed = ATK_Speed;
	}

	public int getAttackDamage() {
		if (equippedWeapon != null) {
			return attackDamage + equippedWeapon.getATK();
		}
		return attackDamage;
	}

	public void setAttackDamage(int attackDamage) {

		this.attackDamage = attackDamage;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public int getATK_Speed() {
		return ATK_Speed;
	}

	public void setATK_Speed(int ATK_Speed) {
		this.ATK_Speed = ATK_Speed;
	}

	public Weapon getEquippedWeapon() {
		return equippedWeapon;
	}

	public void equipWeapon(Weapon weapon) {
		this.equippedWeapon = weapon;
		System.out.println(weapon.getWeaponName() + "을(를) 장착했습니다.");
	}
}
