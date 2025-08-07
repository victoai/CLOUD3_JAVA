package day13.학생.김세중;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Warrior[] warriors = { new Warrior(20, 10, 100, 50, 5, 7), new Warrior(25, 12, 110, 40, 6, 6) };

		Monster[] monsters = { new Monster(15, 5, 80, 30), new Monster(18, 7, 90, 25) };

		// 업캐스팅
		Weapon[] weapons = { new Sword(), new Bow(), new Axe() };

		int selectedWarrior = 0;
		int selectedMonster = 0;

		while (true) {
			int choice = showMenu(scanner);
			switch (choice) {
			case 1:
				selectedWarrior = selectWarrior(warriors, scanner);
				break;
			case 2:
				selectedMonster = selectMonster(monsters, scanner);
				break;
			case 3:
				attackToMonster(warriors[selectedWarrior], monsters[selectedMonster]);
				break;
			case 4:
				defenseFromMonster(warriors[selectedWarrior], monsters[selectedMonster]);
				break;
			case 5:
				Weapon weapon = selectWeapon(weapons, scanner);
				warriors[selectedWarrior].equipWeapon(weapon);
				break;
			case 6:
				useSkill(warriors[selectedWarrior], monsters[selectedMonster]);
				break;
			case 7:
				showBattleStatus(warriors[selectedWarrior], monsters[selectedMonster]);
				break;
			case 8:
				System.out.println("게임 종료");
				scanner.close();
				return;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}
	}

	private static int showMenu(Scanner scanner) {
		System.out.println("\n1.전사 선택");
		System.out.println("2.몬스터 선택");
		System.out.println("3.공격");
		System.out.println("4.방어");
		System.out.println("5.무기장착");
		System.out.println("6.스킬 사용");
		System.out.println("7.상태창");
		System.out.println("8.게임 종료");
		return scanner.nextInt();
	}

	private static int selectWarrior(Warrior[] warriors, Scanner scanner) {
		System.out.println("전사를 선택하세요:");
		for (int i = 0; i < warriors.length; i++) {
			System.out.println((i + 1) + ". 전사 " + (i + 1) + " (HP: " + warriors[i].getHp() + ")");
		}
		int choice = scanner.nextInt() - 1;
		return (choice >= 0 && choice < warriors.length) ? choice : 0;
	}

	private static int selectMonster(Monster[] monsters, Scanner scanner) {
		System.out.println("몬스터를 선택하세요:");
		for (int i = 0; i < monsters.length; i++) {
			System.out.println((i + 1) + ". 몬스터 " + (i + 1) + " (HP: " + monsters[i].getHp() + ")");
		}
		int choice = scanner.nextInt() - 1;
		return (choice >= 0 && choice < monsters.length) ? choice : 0;
	}

	private static Weapon selectWeapon(Weapon[] weapons, Scanner scanner) {
		System.out.println("무기를 선택하세요:");
		for (int i = 0; i < weapons.length; i++) {
			System.out.println((i + 1) + ". " + weapons[i].getWeaponName());
		}
		int choice = scanner.nextInt() - 1;
		return (choice >= 0 && choice < weapons.length) ? weapons[choice] : weapons[0];
	}

	private static void attackToMonster(Warrior warrior, Monster monster) {
		System.out.print("행동: ");

		if (warrior.getEquippedWeapon() != null) {
			warrior.getEquippedWeapon().attack();
		} else {
			System.out.println("맨손 공격!");
		}

		int damage = warrior.getAttackDamage() - monster.getDefense();
		damage = Math.max(damage, 0);
		monster.setHp(monster.getHp() - damage);
		System.out.println("몬스터의 남은 체력: " + monster.getHp());
	}

	private static void defenseFromMonster(Warrior warrior, Monster monster) {
		System.out.println("행동: 방어");
		int decreasedDamage = monster.getAttackDamage() - warrior.getDefense();
		decreasedDamage = Math.max(decreasedDamage, 0);
		warrior.setHp(warrior.getHp() - decreasedDamage);
		System.out.println("전사의 남은 체력: " + warrior.getHp());
	}

	private static void useSkill(Warrior warrior, Monster monster) {
		if (warrior.getEquippedWeapon() == null) {
			System.out.println("무기가 장착되어 있지 않습니다.");
			return;
		}

		Weapon weapon = warrior.getEquippedWeapon();
		int skillCost = 0;
		int damage = 0;

		// weapon이 Sword를 참조->다운캐스팅으로 sword의 매서드 사용
		if (weapon instanceof Sword) {
			skillCost = ((Sword) weapon).SwordSkill();
		} else if (weapon instanceof Bow) {
			skillCost = ((Bow) weapon).BowSkill();
		} else if (weapon instanceof Axe) {
			skillCost = ((Axe) weapon).AxeSkill();
		}

		if (warrior.getMp() >= skillCost) {
			warrior.setMp(warrior.getMp() - skillCost);
			monster.setHp(monster.getHp() - Math.max(damage, 0));
			System.out.println("스킬 사용으로 인한 데미지: " + damage);
			System.out.println("몬스터의 남은 체력: " + monster.getHp());
		} else {
			System.out.println("MP가 부족하여 스킬을 사용할 수 없습니다.");
		}
	}

	private static void showBattleStatus(Warrior warrior, Monster monster) {
		System.out.println("\t전사\t\t몬스터");
		System.out.println("HP:\t" + warrior.getHp() + "\t\t" + monster.getHp());
		System.out.println("공격력:\t" + warrior.getAttackDamage() + "\t\t" + monster.getAttackDamage());
		System.out.println("방어력:\t" + warrior.getDefense() + "\t\t" + monster.getDefense());

		Weapon equippedWeapon = warrior.getEquippedWeapon();
		String weaponName = (equippedWeapon != null) ? equippedWeapon.getWeaponName() : "없음";
		System.out.println("장착 무기:\t" + weaponName);
	}

	// 랜덤 거리 계산후 전사+무기 거리 안에 있으면 공격 아니면 회피! 출력

	public static boolean calculateRange(Warrior warrior, Monster monster, Weapon weapon) {
		Random random = new Random();
		int range = random.nextInt(20);

		if (warrior.getRange() < range) {
			return false;
		}
		return true;
	}
}
