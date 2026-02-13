package Homework2.task2;

public class Main {
    public static void main(String[] args) {

        Engine engine1 = new Engine("Hybrid", 300);
        Engine engine2 = new Engine("Electric", 500);

        Driver driver1 = new Driver("Олег", "Коваленко");
        Driver driver2 = new Driver("Анна", "Сидоренко");

        Car car = new Car ("Tesla", "Y", 2023, "black", engine1, driver1);
        Car car2 = new Car("BMW", "X5", 2022, "white", engine2, driver2);

        System.out.println(car2);
    }
}
