package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("BMV");
        car.setColor("Красная");
        car.setAge(2022);
        System.out.println(car.getModel() + " " + car.getColor() + " " + car.getAge());


    }
}
