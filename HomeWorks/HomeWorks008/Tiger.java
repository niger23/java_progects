package HomeWorks.HomeWorks008;

public class Tiger extends WildAnimal {
    public Tiger(int height, int weight, String eyeСolor, String habitat, String dateFound) {
        super(height, weight, eyeСolor, habitat, dateFound);
    }
    public void makeSound() {
        System.out.println("Тигр говорит: Ррр-рр");
    }
    @Override
    public String animalInfo() {
        return super.animalInfo();
    }
}
