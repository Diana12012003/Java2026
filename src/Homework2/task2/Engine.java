package Homework2.task2;

public class Engine {
    private final String type;
    private final int speed;

    public Engine(String type, int speed) {
        this.type = type;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "type='" + type + '\'' +
                ", speed=" + speed +
                '}';
    }
}

