package hello2;

import java.io.*;
import java.util.*;

public class 조편성 {
    public static void main(String[] args) {
    	ArrayList<String> students = new ArrayList<>();

        // 학생 정보 파일 읽기
        try (BufferedReader br = new BufferedReader(new FileReader("src/hello2/students.txt"))) {
            String line;
            while ((line = br.readLine()) != null) { 
                    students.add(line ); 
            }
        } catch (IOException e) {
            
        	e.printStackTrace();
        }

        // 랜덤 섞기
        Collections.shuffle(students);

     
        // 4명씩 출력 (마지막 팀은 3명)
        int index = 0;
        for (int team = 1; team <= 4; team++) {
            System.out.println("=== " + team + "팀 ===");
            int memberCount = (team <= 3) ? 5 : 4; // 앞 4팀은 5명, 마지막은 4명
            for (int i = 0; i < memberCount; i++) {
                System.out.println(students.get(index++));
            }
            System.out.println();
        }
    }
}
