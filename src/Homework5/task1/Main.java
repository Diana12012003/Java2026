package Homework5.task1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        String fileName = "test.txt";

        Path filePath = Paths.get(fileName);

        try {
            String content = Files.readString(Paths.get("test.txt"));
            System.out.println("File:");
            System.out.println(content);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
