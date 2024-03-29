package HomeWorks.HomeWorks009;

public class Circle extends Figure implements Circumference{
    private double radius;

    public Circle(double radius) throws IllegalArgumentException {
        if (radius <= 0) throw new IllegalArgumentException();

        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI*Math.pow(this.radius, 2);
    }

    @Override
    public double circumference() {
        return 2*Math.PI*this.radius;
    }
    
}

