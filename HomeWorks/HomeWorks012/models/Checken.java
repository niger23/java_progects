package HomeWorks.HomeWorks012.models;

public class Checken extends Bird{
    public Checken(int height, int weight, String eyeСolor, int flightAltitude) {
        super(height, weight, eyeСolor, flightAltitude);
    }
    @Override
    public String toString() {
        return super.toString();
    }
    @Override
    public String makeSound() {
        return "Ко-ко-ко";
    }
    @Override
    public String fly() {
        return super.fly();
    }
}
