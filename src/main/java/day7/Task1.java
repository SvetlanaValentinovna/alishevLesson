package day7;


public class Task1 {
    public static void main(String[] args) {

        Airplane airplane1 = new Airplane("ОАК", 2020, 29.94, 400);
        Airplane airplane2 = new Airplane("Боинг", 2022, 55.0, 500);
        Airplane.compareAirplanes(airplane1, airplane2);



    }
}