package homework6;

public class RightTriangle extends Triangle{

    public RightTriangle( double leg1, double leg2){
        super(leg1,leg2,0);
    }
    public double square() {
        return (leg1+leg2)/2;
    }
}

