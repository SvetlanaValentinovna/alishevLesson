package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("ОАК", 2020, 29.94, 400);
        airplane.info();

        airplane.setYear(2000);
        airplane.setLength(50.2);

        airplane.fillUp(10);
        airplane.fillUp(20);
        airplane.info();

    }
}
