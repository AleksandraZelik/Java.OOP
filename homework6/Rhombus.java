package homework6;

public class Rhombus extends Quadrilateral {
    public Rhombus(double side1, double angleDeg) {
        super(side1,0,0,0,angleDeg);
    }

    public double square() {
        double angleRadian = (angleDeg * 3.14) / 180;
        double sinAngle = Math.sin(angleRadian);
        return side1 * side1 * sinAngle;

    }
}
