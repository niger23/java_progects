package HomeWorks.HomeWorks009;

import java.util.ArrayList;
import java.util.Arrays;

public class Rectangle extends Polygon{
    public Rectangle(double sideA, double sideB) {
        super(new ArrayList <> (Arrays.asList(sideA,sideB)));
    }

    @Override
    double area() {
        return this.sides.get(0)*this.sides.get(1);
    }

}
