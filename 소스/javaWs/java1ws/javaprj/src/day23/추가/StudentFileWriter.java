package day23.추가;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class StudentFileWriter {
    public static void main(String[] args) {
        Student[] students = {
            new Student("홍길동", 90, 85, 92),
            new Student("김철수", 78, 88, 80),
            new Student("이영희", 95, 92, 98)
        };

        try (FileWriter fw = new FileWriter("res/students.txt");
             PrintWriter pw = new PrintWriter(fw)) {

            for (Student s : students) {
                pw.println(s); // 한 줄씩 기록, toString() 자동 호출
            }

            System.out.println("학생 데이터 파일 쓰기 완료!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
