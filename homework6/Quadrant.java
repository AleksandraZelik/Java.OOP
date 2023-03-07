package homework6;

public class Quadrant extends Quadrilateral{

    public Quadrant(double side1) {
        super(side1,0,0,0,0);
    }
    public double square(){
        return side1 * side1;
    }
}
