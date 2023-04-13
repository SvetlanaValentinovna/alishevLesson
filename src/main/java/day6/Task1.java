package day6;

public class Task1 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike("Ява", "Синий", 1986);
        motorbike.info();
        int year1 = motorbike.yearDifference(2020);
        System.out.println("Эксплуатация мотоцикла " + year1 +  " года");

        Car car = new Car("BMV", "красная", 2010);
        car.info();
       int year2 = car.yearDifference(2023);
        System.out.println("Эксплуатация машины " + year2 + " года");


    }
}
