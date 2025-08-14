package test;

import java.util.Random;

public class 조편성2 {
    public static void main(String[] args) throws InterruptedException {

         
    	 String[] students = new String[]{
    			 "김민희",
        		 "김서호",
        		 "김인국",
        		 "김현희",
        		 "박두식" ,
        		 "박성욱",
        		 "손민영",
        		 "우동훈",
        		 "유승재",
        		 "윤태민",
        		 "이대훈" ,
        		 "이동규" ,
        		 "이성빈",
        		 "이정헌",
        		 "이혜린",
        		 "전희연",
        		 "정지원",
        		 "최성원",
        		 "최정문"
        	 
        };
        
    	 
    	 
    	System.out.println(students.length);
        Random random = new Random();

        // 배열을 랜덤하게 섞기
        for (int i = students.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            String temp = students[i];
            students[i] = students[j];
            students[j] = temp;
        }

        // 4개의 조를 만듦 (마지막 조는 5명)
        // 각 행이 다른 배열을 만들 때는 아래와 같이 해야 함 
        
        String[][] groups = new String[4][];
        groups[0] = new String[5];
        groups[1] = new String[5];
        groups[2] = new String[5];
        groups[3] = new String[4]; // 4번째 조는 4명
        
        

        // 4개의 조에 학생 배정 (i값에 따라 조 선택을 따로 처리)
        for (int i = 0; i < students.length; i++) {
            int row; // 조 인덱스 계산
            int column; // 조 내 인덱스 계산

          
            if (i < 18) {  
                row = i / 5;
                column = i % 5;
            } else  {  // i == 18인 경우
                row = 3;
                column = 3;
            }
            
            
            groups[row][column] = students[i];
        }

        // 5초 대기 후 결과 
        Thread.sleep(5000);
        

        System.out.println("==> 조 편성 ^^ 축하합니다. 재미있게 같이 해 주세요!");        
        System.out.println();

        // 조 편성 결과 출력
        for (int i = 0; i < groups.length; i++) {
            System.out.print("조 " + (i + 1) + ": ");
            
            for (int j = 0; j < groups[i].length; j++) {
                System.out.print(groups[i][j] + " ");
            }
            System.out.println();
        }
    }
}