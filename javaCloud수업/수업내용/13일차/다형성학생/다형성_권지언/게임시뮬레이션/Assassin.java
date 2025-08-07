package day12.게임시뮬레이션;

public class Assassin extends Character {

    public Assassin(String name) {
        super(name, 35, 28, 4, 140); 
    }

    @Override
    public void levelUp() {
        super.levelUp();
        this.max_hp += level * 5; 
    }
}
