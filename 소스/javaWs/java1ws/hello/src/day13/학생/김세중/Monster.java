package day13.학생.김세중;

public class Monster {
	private int attackDamage;
	private int defense;
	private int hp;
	private int mp;

	Monster(int attackDamage, int defense, int hp, int mp) {
		this.attackDamage = attackDamage;
		this.defense = defense;
		this.hp = hp;
		this.mp = mp;
	}

	public int getAttackDamage() {
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
}
