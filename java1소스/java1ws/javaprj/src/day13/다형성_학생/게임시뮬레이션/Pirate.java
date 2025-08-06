package day13.다형성_학생.게임시뮬레이션;

public class Pirate extends Character {

    public Pirate(String name) {
        super(name, 45, 35, 3, 180); 
    }

    @Override
    public void levelUp() {
        super.levelUp();
        this.max_hp += level * 7; 
    }
}
