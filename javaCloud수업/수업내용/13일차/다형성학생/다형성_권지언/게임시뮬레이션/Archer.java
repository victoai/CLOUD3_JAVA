package day12.게임시뮬레이션;

public class Archer extends Character {

    public Archer(String name) {
        super(name, 40, 25, 4, 150); 
    }

    @Override
    public void levelUp() {
        super.levelUp();
        this.max_hp += level * 6;
    }
}
