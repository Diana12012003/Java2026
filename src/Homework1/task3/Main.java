package Homework1.task3;

import java.util.ArrayList;
import java.util.List;

    public class Main {
        public static void main(String[] args) {

            List<Book> books = new ArrayList<>();
            books.add(new Book(1, "Clean Code", "Robert C. Martin", "Programming"));
            books.add(new Book(2, "The Pragmatic Programmer", "David Thomas, Andrew Hunt", "Software Development"));
            books.add(new Book(3, "Designing Data-Intensive Applications", "Martin Kleppmann", "Databases"));
            books.add(new Book(4, "Atomic Habits", "James Clear", "Self-Help"));
            books.add(new Book(5, "The Phoenix Project", "Gene Kim", "IT Novel"));

            System.out.println(books);
        }
    }