package HomeWorks.HomeWorks009;

import java.util.ArrayList;
import java.util.Arrays;

public class Triangle extends Polygon{
    public Triangle(double sideA, double sideB,double sideC) throws IllegalArgumentException{
        super(new ArrayList <> (Arrays.asList(sideA,sideB,sideC)));
        if (sideA+sideB<sideC && sideC+sideB<sideA && sideC+sideA<sideB) throw new IllegalArgumentException();
    }

    @Override
    double area() {
        double halfPerimeter = this.sides.get(0)+this.sides.get(1)+this.sides.get(2);
        return Math.sqrt(halfPerimeter*(halfPerimeter - this.sides.get(0))*(halfPerimeter - this.sides.get(1))*(halfPerimeter - this.sides.get(2)));
    }
}
