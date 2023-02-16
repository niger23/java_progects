package HomeWorks.HomeWorks012.models;

public class Tiger extends WildAnimal {
    public Tiger(int height, int weight, String eyeСolor, String habitat, String dateFound) {
        super(height, weight, eyeСolor, habitat, dateFound);
    }
    public String makeSound() {
        return "Ррр-рр";
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
