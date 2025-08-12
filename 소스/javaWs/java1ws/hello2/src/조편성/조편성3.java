package 조편성;

import java.util.Random;

public class 조편성3 {
    public static void main(String[] args) throws InterruptedException {

        String[] students = {
            "김민희", "김서호", "김인국", "김현희", "박두식", 
            "박성욱", "손민영", "우동훈", "유승재", "윤태민", 
            "이대훈", "이동규", "이성빈", "이정헌", "이혜린", 
            "전희연", "정지원", "최성원", "최정문"
        };

        Random random = new Random();

        // 배열 랜덤 섞기 (Fisher–Yates shuffle)
        for (int i = students.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            String temp = students[i];
            students[i] = students[j];
            students[j] = temp;
        }

        // 팀 구성 (5명, 5명, 5명, 4명)
        String[][] groups = {
            new String[5],
            new String[5],
            new String[5],
            new String[4]
        };

        // 학생 배정
        int index = 0;
        for (int g = 0; g < groups.length; g++) {
            for (int m = 0; m < groups[g].length; m++) {
                groups[g][m] = students[index++];
            }
        }

        // 5초 대기 후 출력
        Thread.sleep(5000);
        System.out.println("==> 조 편성 ^^ 축하합니다. 재미있게 같이 해 주세요!");
        System.out.println();

        for (int i = 0; i < groups.length; i++) {
            System.out.print("조 " + (i + 1) + ": ");
            for (String member : groups[i]) {
                System.out.print(member + " ");
            }
            System.out.println();
        }
    }
}
