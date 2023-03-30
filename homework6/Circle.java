package homework6;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {

        return radius;
    }

    public double square() {
        return 2 * radius * 3.14;
    }

    @Override
    public double perimeter() {
        return 2 * radius * 3.14;
    }
    public String toString() {
        return "[Circle]: Square = " + square() + " Perimeter = " + perimeter();
    }
}
