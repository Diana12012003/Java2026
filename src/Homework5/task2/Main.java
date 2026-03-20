package Homework5.task2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Олег", 19, 1));
        students.add(new Student("Анна", 22, 3));
        students.add(new Student("Максим", 18, 1));
        students.add(new Student("Діана", 21, 2));
        students.add(new Student("Іван", 20, 2));
        students.add(new Student("Оксана", 23, 4));

        String fileName = "students.txt";

        try {
            List<String> lines = new ArrayList<>();
            for (Student s : students) {
                lines.add(s.name + "," + s.age + "," + s.course);
            }
            Files.write(Paths.get(fileName), lines);
            System.out.println("Список студентів: " + fileName);

        } catch (IOException e) {
            System.out.println("Помилка: " + e.getMessage());
        }

        List<Student> readStudents = new ArrayList<>();

        try {
            List<String> fileLines = Files.readAllLines(Paths.get(fileName));

            for (String line : fileLines) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String name = parts[0];
                    int age = Integer.parseInt(parts[1]);
                    int course = Integer.parseInt(parts[2]);
                    readStudents.add(new Student(name, age, course));
                }
            }

        } catch (IOException e) {
            System.out.println("Помилка: " + e.getMessage());
        }

        Collections.sort(readStudents, Comparator.comparingInt(s -> s.age));

        System.out.println("\nСтудентиза віком:");
        System.out.println("Ім'я\t\tВік\tКурс");
        System.out.println("-----------------------------");
        for (Student s : readStudents) {
            System.out.printf("%-15s %d\t%d\n", s.name, s.age, s.course);
        }
    }
}

