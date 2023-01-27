package HomeWorks.HomeWorks009;

import java.util.ArrayList;

public abstract class Polygon extends Figure implements Perimetr{
    protected ArrayList <Double> sides;

    protected Polygon(ArrayList <Double> sides) {
        this.sides = sides;
    }

    @Override
    public double perimeter() {
        double res = 0;
        if (this.sides.size() > 2) {
            for (int i = 0; i < this.sides.size(); i++) {
                res+= this.sides.get(i);
            }
        } else if (this.sides.size() == 2) {
            res = (this.sides.get(0) + this.sides.get(1))*2;
        }
        return res;
    }
}
