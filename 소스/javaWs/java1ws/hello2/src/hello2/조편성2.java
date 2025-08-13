package hello2;
import java.io.*;
import java.util.*;

public class 조편성2 {
    public static void main(String[] args) throws InterruptedException {
        List<String> students = new ArrayList<>();

        // 학생 정보 읽기
        try (BufferedReader br = new BufferedReader(new FileReader("src/hello2/students.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                
                    students.add(line );
                 
            }
        } catch (IOException e) {
            e.printStackTrace();
             
        }

        // 섞기
        Collections.shuffle(students);

        // 팀 구성 결과를 Map에 저장
        Map<Integer, ArrayList<String>> teamMap = new LinkedHashMap<>();
        int index = 0;
        for (int team = 1; team <= 4; team++) {
            int memberCount = (team <= 3) ? 5 : 4;
            ArrayList <String> teamMembers = new ArrayList<>();
            for (int i = 0; i < memberCount; i++) {
                teamMembers.add(students.get(index++));
            }
            teamMap.put(team, teamMembers);
        }

        // 스레드 슬립을 이용해서 한 팀씩 출력
        
        Thread.sleep(5000); // 1초 대기 후 다음 팀 출력
        for (Map.Entry<Integer, ArrayList<String>> entry : teamMap.entrySet()) {
            System.out.println("=== " + entry.getKey() + "팀 ===");
            for (String name : entry.getValue()) {
                System.out.println(name);
            }
            System.out.println();
           
        }
    }
}
