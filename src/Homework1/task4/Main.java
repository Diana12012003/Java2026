package Homework1.task4;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1, "Toyota Camry", "2023", "Silver"));
        cars.add(new Car(2, "Tesla Model 3", "2024", "Black"));
        cars.add(new Car(3, "BMW X5", "2019", "White"));
        cars.add(new Car(4, "Volkswagen Golf GTI", "2017", "Red"));
        cars.add(new Car(5, "Ford Mustang GT", "2015", "Blue"));

        System.out.println(cars);
    }
}
