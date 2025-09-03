package day23.추가;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StudentFileReader {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("res/students.txt"))) {
            String line;
            while ((line = br.readLine()) != null) { // 한 줄씩 읽기
                // CSV 형식: 이름,국어,영어,수학
                String[] parts = line.split(",");
                System.out.println( parts);
                String name = parts[0];
                int korean = Integer.parseInt(parts[1]);
                int english = Integer.parseInt(parts[2]);
                int math = Integer.parseInt(parts[3]);

                // 출력
                System.out.println("이름: " + name + ", 국어: " + korean
                        + ", 영어: " + english + ", 수학: " + math);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
