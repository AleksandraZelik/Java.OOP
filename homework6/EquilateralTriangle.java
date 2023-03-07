package homework6;

public class EquilateralTriangle extends Triangle {

    public EquilateralTriangle(double leg1) {
        super(leg1, 0, 0);
    }

    public double square() {
            double p=Math.sqrt(3);
            double f=Math.pow(leg1,2);
            return (p*f)/4;
        }
    }

