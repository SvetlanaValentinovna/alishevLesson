package day9.Task2;

public class Rectangle extends Figure{
    int weight;
    int height;

    public Rectangle(int weight, int length, String color) {
        super(color);
        this.weight = weight;
        this.height = length;
    }


    @Override
    public double area() {
        return weight * height;
    }

    @Override
    public double perimeter() {
        return 2 * (weight + height);
    }
}
