package HomeWorks.HomeWorks012.models;

public class Stork extends Bird{
    public Stork(int height, int weight, String eyeСolor, int flightAltitude) {
        super(height, weight, eyeСolor,flightAltitude);
    }
    @Override
    public String toString() {
        return super.toString();
    }
    @Override
    public String makeSound() {
        return "Тук-тук";
    }
    public String fly() {
        return super.fly();
    }
}
