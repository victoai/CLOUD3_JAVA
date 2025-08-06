package day20.멀티스레드예제;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class FileReadTask implements Runnable {
    private String filePath;

    public FileReadTask(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void run() {
        try (BufferedReader reader = new BufferedReader(new FileReader(new File(filePath)))) {
            String line;
            System.out.println(Thread.currentThread().getName() + " - Reading: " + filePath);
            while ((line = reader.readLine()) != null) {
                System.out.println(Thread.currentThread().getName() + " - " + line);
            }
        } catch (IOException e) {
            System.err.println(Thread.currentThread().getName() + " - Error reading file: " + filePath);
            e.printStackTrace();
        }
    }
}

public class MultiThreadFileReader {
    public static void main(String[] args) {
        String[] filePaths = {
            "res/file1.txt",
            "res/file2.txt",
            "res/file3.txt"
        };

        for (String path : filePaths) {
            Thread thread = new Thread(new FileReadTask(path));
            thread.start();
        }
    }
}
