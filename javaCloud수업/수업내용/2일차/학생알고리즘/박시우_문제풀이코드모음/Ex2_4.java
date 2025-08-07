package hello;

import java.util.Scanner;

class Student{
	String name;
	int korean;
	int english;
	int math;
	
	public Student() {
		
	}
	
	public Student(String name, int korean, int english, int math) {
		this.name=name;
		this.korean=korean;
		this.english=english;
		this.math=math;
	}
}

public class Ex2_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("학생수를 입력하세요 : ");
		int num = sc.nextInt();
		Student[] student = new Student[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("학생의 이름, 국어, 영어, 수학 성적을 입력하세요 : ");
			student[i] = new Student(sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt());
		}
		
		for(Student each : student) {
			double avg=0;
			avg=(each.english+each.korean+each.math)/3;
			System.out.printf("%s님 국어점수 : %d 영어점수 : %d 수학점수 : %d 평균 : %.2f\n",each.name,each.korean,each.english,each.math,avg);
			if(avg>90) {
				System.out.printf("%s님 Excellent!",each.name);
			} else if(avg<60) {
				System.out.printf("%s님 FAIL",each.name);
			}
		}
		
		System.out.println();
		
        int sumkorean = 0, sumenglish = 0, summath = 0;

		for (Student each : student) {
            sumkorean += each.korean;
            sumenglish += each.english;
            summath += each.math;
        }

        float avgkorean = sumkorean / (float) num;
        float avgenglish = sumenglish / (float) num;
        float avgmath = summath / (float) num;
		System.out.printf("국어 평균 : %.2f 영어 평균 : %.2f 수학 평균 : %.2f",avgkorean,avgenglish,avgmath);
	}
}
