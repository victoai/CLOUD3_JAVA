package day23.추가.objectstream;
 

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StudentFileWriter {
    public static void main(String[] args) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("res/students.obj"))) {
            Student s1 = new Student("홍길동", 90, 85, 92);
            Student s2 = new Student("김철수", 78, 88, 80);
            Student s3 = new Student("이영희", 95, 92, 98);

            oos.writeObject(s1);
            oos.writeObject(s2);
            oos.writeObject(s3);

            System.out.println("학생 정보를 파일에 저장했습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
