package day23.추가.objectstream;

 

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L; // 버전 관리용

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
        return "이름: " + name +
               ", 국어: " + korean +
               ", 영어: " + english +
               ", 수학: " + math;
    }
}
