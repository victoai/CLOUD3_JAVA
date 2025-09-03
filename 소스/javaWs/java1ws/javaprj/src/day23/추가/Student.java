package day23.추가;

public class Student {
    private String name;
    private int korean;
    private int english;
    private int math;

    public Student(String name, int korean, int english, int math) {
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }

    @Override
    public String toString() {
        // CSV 형식으로 저장: 이름,국어,영어,수학
        return name + "," + korean + "," + english + "," + math;
    }
}
