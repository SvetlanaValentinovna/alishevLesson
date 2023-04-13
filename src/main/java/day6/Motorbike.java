package day6;

public class Motorbike {
    private String model;
    private String color;
    private int age;


    public void info(){
        System.out.println("Это мотоцикл " + model +", " + color + ", " + age + " год выпуска");
    }

   public int yearDifference(int inputYear){
        int years = inputYear - age;
        return years;
    }

    public Motorbike(String model, String color, int age){
        this.model = model;
        this.color = color;
        this.age = age;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }
}
