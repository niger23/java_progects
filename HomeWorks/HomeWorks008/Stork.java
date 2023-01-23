package HomeWorks.HomeWorks008;

public class Stork extends Bird{
    public Stork(int height, int weight, String eyeСolor, int flightAltitude) {
        super(height, weight, eyeСolor,flightAltitude);
    }
    @Override
    public String animalInfo() {
        return super.animalInfo();
    }
    @Override
    public void makeSound() {
        System.out.println("Аист говорит: Тук-тук");
    }
    public void fly() {
        super.fly();
    }
}
