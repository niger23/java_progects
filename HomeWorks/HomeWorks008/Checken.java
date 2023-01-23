package HomeWorks.HomeWorks008;

public class Checken extends Bird{
    public Checken(int height, int weight, String eyeСolor, int flightAltitude) {
        super(height, weight, eyeСolor, flightAltitude);
    }
    @Override
    public String animalInfo() {
        return super.animalInfo();
    }
    @Override
    public void makeSound() {
        System.out.println("Курица говорит: Ко-ко-ко");
    }
    @Override
    public void fly() {
        super.fly();
    }
}
