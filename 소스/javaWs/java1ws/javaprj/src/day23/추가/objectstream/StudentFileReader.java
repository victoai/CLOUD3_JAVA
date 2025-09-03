package day23.추가.objectstream;
 

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class StudentFileReader {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("res/students.obj"))) {
            while (true) {
                 try {
                    Student student = (Student) ois.readObject();
                    System.out.println(student);
                 } catch (EOFException e) {
                	//e.printStackTrace();
                     break; // 파일 끝에 도달하면 반복 종료
                 }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
