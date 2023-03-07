package homework6;

public class Rectangle extends Quadrilateral {
    public Rectangle(double side1, double side2) {
        super(side1, side2, 0, 0, 0);
    }

    public double square(){
        return side1 * side2;
    }
}
