package Homework5.task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        String studentsFile = "students2.txt";
        createStudentsFile(studentsFile);

        String coursesFile = "courses.txt";
        createCoursesFile(coursesFile);

        Map<String, String> students = new HashMap<>();
        readStudents(studentsFile, students);

        Map<String, String> courseNames = new HashMap<>();
        Map<String, List<String>> courseToStudents = new HashMap<>();
        readCourses(coursesFile, courseNames, courseToStudents);

        List<String> result = new ArrayList<>();
        result.add("Учень (ID)\t\t\tКурси");
        result.add("-------------------------------------------");

        for (Map.Entry<String, String> entry : students.entrySet()) {
            String studentId = entry.getKey();
            String studentName = entry.getValue();

            List<String> studentCourses = new ArrayList<>();
            for (Map.Entry<String, List<String>> courseEntry : courseToStudents.entrySet()) {
                if (courseEntry.getValue().contains(studentId)) {
                    studentCourses.add(courseNames.get(courseEntry.getKey()));
                }
            }
            String coursesStr = studentCourses.isEmpty() ? "немає курсів" : String.join(", ", studentCourses);
            result.add(studentName + " (" + studentId + ")\t\t" + coursesStr);
        }

        System.out.println("Результат");
        for (String line : result) {
            System.out.println(line);
        }

        String resultFile = "result.txt";
        try {
            PrintWriter writer = new PrintWriter(resultFile);
            for (String line : result) {
                writer.println(line);
            }
            writer.close();
            System.out.println("\nРезультат збережено: " + resultFile);
        } catch (FileNotFoundException e) {
            System.out.println("Помилка result.txt: " + e.getMessage());
        }
    }

    private static void createStudentsFile(String fileName) {
        try {
            PrintWriter writer = new PrintWriter(fileName);
            writer.println("1,Олег Петренко");
            writer.println("2,Анна Коваленко");
            writer.println("3,Максим Іванов");
            writer.println("4,Діана Сидоренко");
            writer.println("5,Іван Шевченко");
            writer.println("6,Оксана Григоренко");
            writer.close();
            System.out.println("Файл " + fileName + " створено");
        } catch (FileNotFoundException e) {
            System.out.println("Помилка" + fileName);
        }
    }

    private static void createCoursesFile(String fileName) {
        try {
            PrintWriter writer = new PrintWriter(fileName);
            writer.println("101,Математика,1,3,5");
            writer.println("102,Програмування,1,2,4");
            writer.println("103,Англійська,2,4,6");
            writer.println("104,Фізика,3,5");
            writer.close();
            System.out.println("Файл " + fileName + " створено");
        } catch (FileNotFoundException e) {
            System.out.println("Помилка" + fileName);
        }
    }

    private static void readStudents(String fileName, Map<String, String> students) {
        try {
            Scanner scanner = new Scanner(new File(fileName));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    students.put(parts[0].trim(), parts[1].trim());
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Не знайдено" + fileName);
        }
    }
    
    private static void readCourses(String fileName, Map<String, String> courseNames, Map<String, List<String>> courseToStudents) {
        try {
            Scanner scanner = new Scanner(new File(fileName));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                if (parts.length >= 3) {
                    String courseId = parts[0].trim();
                    String courseName = parts[1].trim();
                    courseNames.put(courseId, courseName);

                    List<String> studentIds = new ArrayList<>();
                    for (int i = 2; i < parts.length; i++) {
                        studentIds.add(parts[i].trim());
                    }
                    courseToStudents.put(courseId, studentIds);
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Не знайдено" + fileName);
        }
    }
}
