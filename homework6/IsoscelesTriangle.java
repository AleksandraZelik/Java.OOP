package homework6;

public class IsoscelesTriangle extends Triangle {

    public IsoscelesTriangle(double leg1, double basic) {
        super(leg1, 0, basic);

    }

    public double square() {
        double p=((leg1*leg1)-(basic*basic))/4;
        double s=Math.sqrt(p);
        return (basic*s)/2;
    }

    @Override
    public double perimeter() {
        return 2*leg1+basic;
    }
    public String toString() {
        return "[IsoscelesTriangle]: Square = " + square() + " Perimeter = " + perimeter();
    }
}